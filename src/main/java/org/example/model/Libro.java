package org.example.model;

public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private String idioma;
    private int areaConocimientoId;
    private int numPaginas;

    public Libro(String isbn, String titulo, int anioPublicacion, String idioma, int areaConocimientoId, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.idioma = idioma;
        this.areaConocimientoId = areaConocimientoId;
        this.numPaginas = numPaginas;
    }

    // Getters y Setters

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAreaConocimientoId() {
        return areaConocimientoId;
    }

    public void setAreaConocimientoId(int areaConocimientoId) {
        this.areaConocimientoId = areaConocimientoId;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", idioma='" + idioma + '\'' +
                ", areaConocimientoId=" + areaConocimientoId +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
