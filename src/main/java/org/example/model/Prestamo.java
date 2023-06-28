package org.example.model;

import java.sql.Date;

public class Prestamo {
    private int numeroConsecutivo;
    private int ejemplarId;
    private Date fechaRealizacion;
    private Date fechaDevolucion;
    private String empleadoAtendio;

    public Prestamo(int numeroConsecutivo, int ejemplarId, Date fechaRealizacion, Date fechaDevolucion, String empleadoAtendio) {
        this.numeroConsecutivo = numeroConsecutivo;
        this.ejemplarId = ejemplarId;
        this.fechaRealizacion = fechaRealizacion;
        this.fechaDevolucion = fechaDevolucion;
        this.empleadoAtendio = empleadoAtendio;
    }

    // Getters and setters

    public int getNumeroConsecutivo() {
        return numeroConsecutivo;
    }

    public void setNumeroConsecutivo(int numeroConsecutivo) {
        this.numeroConsecutivo = numeroConsecutivo;
    }

    public int getEjemplarId() {
        return ejemplarId;
    }

    public void setEjemplarId(int ejemplarId) {
        this.ejemplarId = ejemplarId;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getEmpleadoAtendio() {
        return empleadoAtendio;
    }

    public void setEmpleadoAtendio(String empleadoAtendio) {
        this.empleadoAtendio = empleadoAtendio;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "numeroConsecutivo=" + numeroConsecutivo +
                ", ejemplarId=" + ejemplarId +
                ", fechaRealizacion=" + fechaRealizacion +
                ", fechaDevolucion=" + fechaDevolucion +
                ", empleadoAtendio='" + empleadoAtendio + '\'' +
                '}';
    }
}
