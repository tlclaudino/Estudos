package avaliacaoJava;

import java.util.Scanner;

public class Gerenciar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;

        do {
            System.out.println("Minha Biblioteca");
            System.out.println("0 - Sair");
            System.out.println("1 - Criar autor");
            System.out.println("2 - Criar livro");
            System.out.println("3 - Criar mídia digital");
            System.out.println("4 - Criar biblioteca");
            System.out.println("5 - Adicionar livro");
            System.out.println("6 - Emprestar livro");
            System.out.println("7 - Devolver livro");
            System.out.println("8 - Adicionar mídia digital");
            System.out.println("9 - Emprestar mídia digital");
            System.out.println("10 - Devolver mídia digital");
            try {
                op = sc.nextInt();
            } catch (Exception e) {
                op = 99;
            }

            switch (op) {
                case 0: {
                    System.out.println("Sair....");
                    break;
                }
                case 1: {
                    System.out.println("Digite o nome do autor");
                    String nome = sc.next();
                    System.out.println("Digite o nacionalidade do autor");
                    String nacionalidade = sc.next();
                    new Autor(nome, nacionalidade);
                    break;
                }
                case 2: {
                    System.out.println("Digite o titulo");
                    String titulo = sc.next();
                    System.out.println("Digie o ID do autor");
                    int idAutor = sc.nextInt();
                    new Livro(titulo, null, false, idAutor);
                    break;
                }
                case 3: {
                    System.out.println("Digite o titulo");
                    String titulo = sc.next();
                    System.out.println("Digite o álbum");
                    String album = sc.next();
                    new MidiaDigital(titulo, album, false);
                    break;
                }
                case 4: {
                    System.out.println("Digite o nome");
                    String nome = sc.next();
                    new Biblioteca(nome);
                    break; 
                }
                case 5: {
                    System.out.println("Digite o ID da biblioteca");
                    Biblioteca.listarBibliotecas();
                    int idBiblioteca = sc.nextInt();
                    System.out.println("Selecione o ID do livro");
                    Livro.listarLivros();
                    int idLivro = sc.nextInt();
                    Biblioteca.adicionarLivro(idBiblioteca, idLivro);
                    break;
                }
                case 6: {
                    System.out.println("Selecione o ID do livro que você deseja emprestar");
                    Livro.listarLivros();
                    int idLivro = sc.nextInt();
                    Livro.emprestarLivro(idLivro);
                    break;
                }
                case 7: {
                    System.out.println("Selecione o ID do livro que você deseja devolver");
                    Livro.listarLivros();
                    int idLivro = sc.nextInt();
                    Livro.devolverLivro(idLivro);
                    break;
                }
                case 8: {
                    System.out.println("Selecione o ID da biblioteca");
                    Biblioteca.listarBibliotecas();
                    int idBiblioteca = sc.nextInt();
                    System.out.println("Selecione o ID da mídia digital");
                    MidiaDigital.listarMidiaDigital();
                    int idMidiaDigital = sc.nextInt();
                    Biblioteca.adicionarMidiaDigital(idBiblioteca, idMidiaDigital);
                    break;
                }
                case 9: {
                    System.out.println("Selecione o ID da mídia digital que você deseja emprestar");
                    MidiaDigital.listarMidiaDigital();
                    int idMidiaDigital = sc.nextInt();
                    MidiaDigital.emprestarMidiaDigital(idMidiaDigital);
                    break;
                }
                case 10: {
                    System.out.println("Selecione o ID da mídia digital que você deseja devolver");
                    MidiaDigital.listarMidiaDigital();
                    int idMidiaDigital = sc.nextInt();
                    MidiaDigital.devolverMidiaDigital(idMidiaDigital);
                    break;
                }
                default: {
                    System.out.println("Opção inválida");
                    break;
                }
            }
        } while (op != 0);
        sc.close();
    }
}