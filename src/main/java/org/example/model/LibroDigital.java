package org.example.model;

public class LibroDigital {
    private String isbn;
    private String url;
    private String formatoArchivo;
    private long tamanoBytes;

    public LibroDigital(String isbn, String url, String formatoArchivo, long tamanoBytes) {
        this.isbn = isbn;
        this.url = url;
        this.formatoArchivo = formatoArchivo;
        this.tamanoBytes = tamanoBytes;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormatoArchivo() {
        return formatoArchivo;
    }

    public void setFormatoArchivo(String formatoArchivo) {
        this.formatoArchivo = formatoArchivo;
    }

    public long getTamanoBytes() {
        return tamanoBytes;
    }

    public void setTamanoBytes(long tamanoBytes) {
        this.tamanoBytes = tamanoBytes;
    }

    @Override
    public String toString() {
        return "LibroDigital{" +
                "isbn='" + isbn + '\'' +
                ", url='" + url + '\'' +
                ", formatoArchivo='" + formatoArchivo + '\'' +
                ", tamanoBytes=" + tamanoBytes +
                '}';
    }
}
