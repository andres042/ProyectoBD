package org.example.model;

public class Estudiante {
    private String identificacion;
    private String carrera;
    private String universidadProviene;

    public Estudiante(String identificacion, String carrera, String universidadProviene) {
        this.identificacion = identificacion;
        this.carrera = carrera;
        this.universidadProviene = universidadProviene;
    }

    // Getters and setters

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getUniversidadProviene() {
        return universidadProviene;
    }

    public void setUniversidadProviene(String universidadProviene) {
        this.universidadProviene = universidadProviene;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "identificacion='" + identificacion + '\'' +
                ", carrera='" + carrera + '\'' +
                ", universidadProviene='" + universidadProviene + '\'' +
                '}';
    }
}