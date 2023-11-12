package avaliacaoJava;

class Midia {
    private String titulo;
    private boolean disponivel;

    public Midia(String titulo, boolean disponivel) {
        this.titulo = titulo;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() throws Exception {
        if (disponivel) {
            disponivel = false;
        } else {
            throw new Exception("A mídia não está disponível para empréstimo.");
        }
    }

    public void devolver() throws Exception {
        if (!disponivel) {
            disponivel = true;
        } else {
            throw new Exception("A mídia já está disponível.");
        }
    }

    @Override
    public String toString() {
        return titulo + " (" + (disponivel ? "Disponível" : "Indisponível") + ")";
    }
}