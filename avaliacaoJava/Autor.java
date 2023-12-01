package avaliacaoJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Autor extends Pessoa {
    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
        try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("insert into biblioteca.autor values (?, ?, ?)");
            ps.setLong(1, 0);
            ps.setString(2, this.nome);
            ps.setString(3, this.nacionalidade);
            ps.executeUpdate();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public Autor(String nome) {
        this(nome, "Brasil");
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public String toString() {
        return super.toString() + ". Nacionalidade: " + this.nacionalidade;
    }

    public static void listarAutores() {
    }

    public static int getAutorId(int numeroAutorLivro) {
        try {
            Connection connManager = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/biblioteca",
                    "root",
                    "");
            System.out.println("Conexão estabelecida");
 
            String query = "SELECT id_autor FROM biblioteca.autor WHERE id_autor = ?";
            PreparedStatement ps = connManager.prepareStatement(query);
            ps.setInt(1, numeroAutorLivro);
            ResultSet rs = ps.executeQuery();
 
            if (rs.next()) {
                 numeroAutorLivro = rs.getInt("id_autor");
            } else {
                System.out.println("Autor não encontrado");
            }
            rs.close();
            connManager.close();
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
        }
        return numeroAutorLivro;
    }
}

/*   try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("insert into usuario.usuario values (?, ?, ?, ?)");
            ps.setLong(1, 0);
            ps.setString(2, this.nome);
            ps.setString(3, this.email);
            ps.setString(4, this.senha);
            ps.executeUpdate();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    } */