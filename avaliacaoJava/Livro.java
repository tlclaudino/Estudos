package avaliacaoJava;
class Livro {
    private String titulo;
    private Autor autor;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
        }
    }
    public String getTitulo() {
        return titulo;
    }
    @Override
    public String toString() {
        return titulo + " - " + autor.getNome() + " (" + (disponivel ? "Disponível" : "Indisponível") + ")";
    }
}