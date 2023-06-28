package org.example.model;

public class Editorial {
    private int codigoEditorial;
    private String nombre;
    private String paginaWeb;
    private String paisOrigen;

    public Editorial(int codigoEditorial, String nombre, String paginaWeb, String paisOrigen) {
        this.codigoEditorial = codigoEditorial;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.paisOrigen = paisOrigen;
    }

    public int getCodigoEditorial() {
        return codigoEditorial;
    }

    public void setCodigoEditorial(int codigoEditorial) {
        this.codigoEditorial = codigoEditorial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "codigoEditorial=" + codigoEditorial +
                ", nombre='" + nombre + '\'' +
                ", paginaWeb='" + paginaWeb + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }
}
