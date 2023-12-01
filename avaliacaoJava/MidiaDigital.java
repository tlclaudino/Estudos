package avaliacaoJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MidiaDigital extends Midia {
    private String album;

    public MidiaDigital(String titulo, String album, boolean disponivel) {
        super(titulo, disponivel);
        this.album = album;
        try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("insert into biblioteca.midiadigital values (?, ?, ?, ?)");
            ps.setLong(1, 0);
            ps.setString(2, album);
            ps.setString(3, titulo);
            ps.setBoolean(4, disponivel);
            ps.executeUpdate();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void emprestarMidiaDigital(int idMidiaDigital) {
        try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("update biblioteca.midiadigital set disponivel = false where id_midiadigital = ?");
            ps.setInt(1, Livro.getLivroId(idMidiaDigital));
            ps.executeUpdate();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void devolverMidiaDigital(int idMidiaDigital) {
        try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("update biblioteca.midiadigital set disponivel = true where id_midiadigital = ?");
            ps.setInt(1, Livro.getLivroId(idMidiaDigital));
            ps.executeUpdate();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static int getMidiaDigitalId(int idMidiaDigital) {
        try {
            Connection connManager = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/biblioteca",
                    "root",
                    "");
            System.out.println("Conexão estabelecida");
 
            String query = "SELECT id_midiadigital FROM biblioteca.midiadigital WHERE id_midiadigital = ?";
            PreparedStatement ps = connManager.prepareStatement(query);
            ps.setInt(1, idMidiaDigital);
            ResultSet rs = ps.executeQuery();
 
            if (rs.next()) {
                 idMidiaDigital = rs.getInt("id_midiadigital");
            } else {
                System.out.println("Midia não encontrada");
            }
            rs.close();
            connManager.close();
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
        }
        return idMidiaDigital;
    }

    public static void listarMidiaDigital () {
        try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("select id_midiadigital from biblioteca.midiadigital");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idMidiaDigital = rs.getInt("id_midiadigital");
                System.out.println("ID da Midia Digital: " + idMidiaDigital);
            }
            rs.close();
            ps.close();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

}