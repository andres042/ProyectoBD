package org.example.model;

public class Multa {
    private String usuarioIdentificacion;
    private String fecha;
    private long valor;
    private String descripcion;

    public Multa(String usuarioIdentificacion, String fecha, long valor, String descripcion) {
        this.usuarioIdentificacion = usuarioIdentificacion;
        this.fecha = fecha;
        this.valor = valor;
        this.descripcion = descripcion;
    }

    // Getters and setters

    public String getUsuarioIdentificacion() {
        return usuarioIdentificacion;
    }

    public void setUsuarioIdentificacion(String usuarioIdentificacion) {
        this.usuarioIdentificacion = usuarioIdentificacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getValor() {
        return valor;
    }

    public void setValor(long valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Multa{" +
                "usuarioIdentificacion='" + usuarioIdentificacion + '\'' +
                ", fecha='" + fecha + '\'' +
                ", valor=" + valor +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
