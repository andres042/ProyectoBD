package org.example.model;

public class Profesor {
    private String identificacion;
    private String dependencia;
    private String titulo;
    private String areasInteres;

    public Profesor(String identificacion, String dependencia, String titulo, String areasInteres) {
        this.identificacion = identificacion;
        this.dependencia = dependencia;
        this.titulo = titulo;
        this.areasInteres = areasInteres;
    }

    // Getters and setters

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAreasInteres() {
        return areasInteres;
    }

    public void setAreasInteres(String areasInteres) {
        this.areasInteres = areasInteres;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "identificacion='" + identificacion + '\'' +
                ", dependencia='" + dependencia + '\'' +
                ", titulo='" + titulo + '\'' +
                ", areasInteres='" + areasInteres + '\'' +
                '}';
    }
}


