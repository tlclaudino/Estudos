class Livro 
{
    String titulo;
    Autor autor;
    boolean disponivel;

    public Livro(String titulo, Autor autor) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public Autor getAutor() 
    {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() 
    {
        if (disponivel)
         {
            disponivel = false;
            System.out.println("Livro emprestado: " + titulo);
        } else 
        {
            System.out.println("Este livro já está emprestado.");
        }
    }

    public void devolver() 
    {
        if (!disponivel) 
        {
            disponivel = true;
            System.out.println("Livro devolvido: " + titulo);
        } else {
            System.out.println("Este livro já está disponível.");
        }
    }