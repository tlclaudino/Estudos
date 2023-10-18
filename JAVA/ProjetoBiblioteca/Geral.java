import java.util.Scanner;
public class Geral 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Digite o nome do autor: ");
        String nomeAutor = sc.nextLine();
        Autor autor = new Autor(nomeAutor);

        
        System.out.print("Digite o título do livro: ");
        String tituloLivro = sc.nextLine();
        Livro livro = new Livro(tituloLivro, autor);

        
        Biblioteca biblioteca = new Biblioteca();

    
        biblioteca.adicionarLivro(livro);

        int opcao;
        do {
            System.out.println("Bem - Vindo ");
            System.out.println("Escolha uma opção:");
            System.out.println("1. Emprestar livro");
            System.out.println("2. Devolver livro");
            System.out.println("3. Listar livros disponíveis");
            System.out.println("4. Sair");

            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    livro.emprestar();
                    break;
                case 2:
                    livro.devolver();
                    break;
                case 3:
                    biblioteca.listarLivrosDisponiveis();
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }
}