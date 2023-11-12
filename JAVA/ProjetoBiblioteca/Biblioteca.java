package ProjetoBiblioteca;
import java.util.ArrayList;
class Biblioteca 
{

    ArrayList<Livro> livros;

    public Biblioteca() 
    {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) 
    {
        livros.add(livro);
        System.out.println("Livro adicionado à biblioteca: " + livro.getTitulo());
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }
}
