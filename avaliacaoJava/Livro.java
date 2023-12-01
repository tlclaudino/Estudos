package avaliacaoJava;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Livro extends Midia {
    private Autor autor;
    public int idAutor;

    public Livro(String titulo, Autor autor, boolean disponivel, int idAutor) {
        super(titulo, disponivel);
        this.autor = autor;
        try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("insert into biblioteca.livro values (?, ?, ?, ?)");
            ps.setLong(1, 1);
            ps.setString(2, titulo);
            ps.setBoolean(3, disponivel);
            ps.setInt(4, Autor.getAutorId(idAutor));
            ps.executeUpdate();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public String toString() {
        return "Título: " + super.getTitulo()
            + ". Autor: " + this.autor.getNome() 
            + ". Disponível: " + (super.getDisponivel() ? "Sim" : "Não");
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public static void emprestarLivro(int idLivro) {
        try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("update biblioteca.livro set disponivel = false where id_livro = ?");
            ps.setInt(1, Livro.getLivroId(idLivro));
            ps.executeUpdate();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void devolverLivro(int idLivro) {
        try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("update biblioteca.livro set disponivel = true where id_livro = ?");
            ps.setInt(1, Livro.getLivroId(idLivro));
            ps.executeUpdate();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static int getLivroId(int idLivro) {
        try {
            Connection connManager = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/biblioteca",
                    "root",
                    "");
            System.out.println("Conexão estabelecida");
 
            String query = "SELECT id_livro FROM biblioteca.livro WHERE id_livro = ?";
            PreparedStatement ps = connManager.prepareStatement(query);
            ps.setInt(1, idLivro);
            ResultSet rs = ps.executeQuery();
 
            if (rs.next()) {
                 idLivro = rs.getInt("id_livro");
            } else {
                System.out.println("Livro não encontrado");
            }
            rs.close();
            connManager.close();
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
        }
        return idLivro;
    }

    public static void listarLivros () {
        try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("select id_livro from biblioteca.livro");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idLivro = rs.getInt("id_livro");
                System.out.println("ID do Livro: " + idLivro);
            }
            rs.close();
            ps.close();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

}