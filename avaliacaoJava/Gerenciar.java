package avaliacaoJava;
import java.util.List;
import java.util.Scanner;

public class Gerenciar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("Minha Biblioteca");

        do {
            System.out.println("\nMenu da Biblioteca:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Mídia");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    adicionarLivro(biblioteca, scanner);
                    break;
                case 2:
                    listarLivros(biblioteca);
                    break;
                case 3:
                    menuMidia(scanner, biblioteca);
                    break;
                case 4:
                    System.out.println("Saindo da Biblioteca. Até logo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (true);
    }

    private static void adicionarLivro(Biblioteca biblioteca, Scanner scanner) {
        System.out.print("Título do Livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Nome do Autor: ");
        String nomeAutor = scanner.nextLine();
        System.out.print("Nacionalidade do Autor: ");
        String nacionalidadeAutor = scanner.nextLine();

        Autor autor = new Autor(nomeAutor, nacionalidadeAutor);
        Livro livro = new Livro(titulo, autor, true);
        biblioteca.adicionarLivro(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    private static void listarLivros(Biblioteca biblioteca) {
        List<Livro> livros = biblioteca.getLivros();

        if (livros.isEmpty()) {
            System.out.println("A biblioteca não possui livros no momento.");
        } else {
            System.out.println("Livros na Biblioteca:");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }
    private static void menuMidia(Scanner scanner, Biblioteca biblioteca) {
        System.out.println("Menu de Mídia:");
        System.out.println("1. Conversar com alguém sobre os livros que você escolheu");
        System.out.println("2. Postar na Internet");
        System.out.println("3. Voltar ao Menu Principal");
        System.out.print("Escolha uma opção: ");
    
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
    
        switch (escolha) {
            case 1:
                conversarSobreLivros(scanner, biblioteca);
                break;
            case 2:
            
            System.out.println("Escolha a plataforma para postar:");
            System.out.println("1. Google");
            System.out.println("2. Instagram");
            System.out.println("3. Facebook");
            System.out.print("Escolha uma plataforma (1-3): ");
            int escolhaPlataforma = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (escolhaPlataforma) {
                case 1:
                    System.out.println("Você escolheu postar no Google.");
                    postarNoGoogle();
                    break;
                case 2:
                    System.out.println("Você escolheu postar no Instagram.");
                    postarNoInstagram();
                    break;
                case 3:
                    System.out.println("Você escolheu postar no Facebook.");
                    postarNoFacebook();
                    break;
                default:
                    System.out.println("Plataforma inválida. Tente novamente.");
                    break;
            }
            break;
            case 3:
                System.out.println("Voltando ao Menu Principal.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
    }
    
    private static void conversarSobreLivros(Scanner scanner, Biblioteca biblioteca) {
        List<Livro> livros = biblioteca.getLivros();
        
        if (livros.isEmpty()) {
            System.out.println("Você ainda não adicionou nenhum livro à biblioteca.");
        } else {
            System.out.println("Livros disponíveis na biblioteca:");
            for (int i = 0; i < livros.size(); i++) {
                System.out.println((i + 1) + ". " + livros.get(i));
            }
            
            System.out.print("Escolha um livro para conversar (digite o número): ");
            int escolhaLivro = scanner.nextInt();
            scanner.nextLine(); 
            
            if (escolhaLivro >= 1 && escolhaLivro <= livros.size()) {
                Livro livroEscolhido = livros.get(escolhaLivro - 1);
                System.out.println("Você escolheu conversar sobre o livro: " + livroEscolhido.getTitulo());
                System.out.println("Amanda: Este livro é incrível! Gostei muito da história.");
                System.out.println("Roberto: Este livro é incrível! Gostei muito da história.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    private static void postarNoGoogle() 
    {
        System.out.println("Postagem no Google realizada com sucesso!");
        
    }
    
    private static void postarNoInstagram() 
    {
        System.out.println("Postagem no Instagram realizada com sucesso!");
    }
    
    private static void postarNoFacebook() 
    {
        System.out.println("Postagem no Facebook realizada com sucesso!");
    }
}