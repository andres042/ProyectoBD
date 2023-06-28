package org.example.model;

public class Solicitud {
    private int numeroConsecutivo;
    private String fecha;
    private String descripcion;
    private String usuarioIdentificacion;
    private String libroISBN;
    private String libroTitulo;

    public Solicitud(int numeroConsecutivo, String fecha, String descripcion, String usuarioIdentificacion, String libroISBN, String libroTitulo) {
        this.numeroConsecutivo = numeroConsecutivo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.usuarioIdentificacion = usuarioIdentificacion;
        this.libroISBN = libroISBN;
        this.libroTitulo = libroTitulo;
    }

    // Getters and setters

    public int getNumeroConsecutivo() {
        return numeroConsecutivo;
    }

    public void setNumeroConsecutivo(int numeroConsecutivo) {
        this.numeroConsecutivo = numeroConsecutivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsuarioIdentificacion() {
        return usuarioIdentificacion;
    }

    public void setUsuarioIdentificacion(String usuarioIdentificacion) {
        this.usuarioIdentificacion = usuarioIdentificacion;
    }

    public String getLibroISBN() {
        return libroISBN;
    }

    public void setLibroISBN(String libroISBN) {
        this.libroISBN = libroISBN;
    }

    public String getLibroTitulo() {
        return libroTitulo;
    }

    public void setLibroTitulo(String libroTitulo) {
        this.libroTitulo = libroTitulo;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "numeroConsecutivo=" + numeroConsecutivo +
                ", fecha='" + fecha + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", usuarioIdentificacion='" + usuarioIdentificacion + '\'' +
                ", libroISBN='" + libroISBN + '\'' +
                ", libroTitulo='" + libroTitulo + '\'' +
                '}';
    }
}
