package avaliacaoJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Biblioteca {
    private String nome;

    public Biblioteca(String nome) {
        this.nome = nome;
        try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("insert into biblioteca(nome_biblioteca) values (?)");
            ps.setString(1, nome);
            ps.executeUpdate();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void adicionarLivro(int idBibLioteca, int idLivro) {
        try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("update biblioteca.biblioteca set id_livro_biblioteca = ? where id_biblioteca = ?");
            ps.setInt(1, Livro.getLivroId(idLivro));
            ps.setInt(2, Biblioteca.getBibliotecaId(idBibLioteca));

            ps.executeUpdate();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void adicionarMidiaDigital(int idBibLioteca, int idMidiaDigital) {
        try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("update biblioteca.biblioteca set id_midiadigital_biblioteca = ? where id_biblioteca = ?");
            ps.setInt(1, Livro.getLivroId(idMidiaDigital));
            ps.setInt(2, Biblioteca.getBibliotecaId(idBibLioteca));

            ps.executeUpdate();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static int getBibliotecaId(int idBiblioteca) {
        try {
            Connection connManager = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/biblioteca",
                    "root",
                    "");
            System.out.println("Conexão estabelecida");

            String query = "SELECT id_biblioteca FROM biblioteca.biblioteca WHERE id_biblioteca = ?";
            PreparedStatement ps = connManager.prepareStatement(query);
            ps.setInt(1, idBiblioteca);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                idBiblioteca = rs.getInt("id_biblioteca");
            } else {
                System.out.println("Livro não encontrado");
            }
            rs.close();
            connManager.close();
        } catch (SQLException erro) {
            System.out.println(erro.getMessage());
        }
        return idBiblioteca;
    }

    public static void listarBibliotecas () {
        try {
            Connection connManager = DriverManager
                    .getConnection(
                            "jdbc:mysql://localhost:3306/biblioteca",
                            "root",
                            "");
            System.out.println("Conexão estabelecida!");
            PreparedStatement ps = connManager.prepareStatement("select id_biblioteca from biblioteca.biblioteca");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int idBiblioteca = rs.getInt("id_biblioteca");
                System.out.println("ID da Biblioteca: " + idBiblioteca);
            }
            rs.close();
            ps.close();
            connManager.close();
        } catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
    }

}