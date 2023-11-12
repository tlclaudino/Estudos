package avaliacaoJava;

class MidiaDigital {
    private String titulo;
    private String album;

    public MidiaDigital(String titulo, String album) {
        this.titulo = titulo;
        this.album = album;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return titulo + " - " + album;
    }
}