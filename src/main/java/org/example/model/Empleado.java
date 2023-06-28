package org.example.model;

public class Empleado {
    private int identificacionEmpleado;
    private String nombre;
    private String cargo;

    public Empleado(int identificacionEmpleado, String nombre, String cargo) {
        this.identificacionEmpleado = identificacionEmpleado;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    // Getters and setters

    public int getIdentificacionEmpleado() {
        return identificacionEmpleado;
    }

    public void setIdentificacionEmpleado(int identificacionEmpleado) {
        this.identificacionEmpleado = identificacionEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "identificacionEmpleado=" + identificacionEmpleado +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
