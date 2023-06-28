package org.example.model;

public class Ejemplar {
    private int id;
    private String libroIsbn;
    private String ubicacionSala;
    private int ubicacionPasillo;
    private int ubicacionEstante;
    private int ubicacionCajon;

    public Ejemplar(int id, String libroIsbn, String ubicacionSala, int ubicacionPasillo, int ubicacionEstante, int ubicacionCajon) {
        this.id = id;
        this.libroIsbn = libroIsbn;
        this.ubicacionSala = ubicacionSala;
        this.ubicacionPasillo = ubicacionPasillo;
        this.ubicacionEstante = ubicacionEstante;
        this.ubicacionCajon = ubicacionCajon;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibroIsbn() {
        return libroIsbn;
    }

    public void setLibroIsbn(String libroIsbn) {
        this.libroIsbn = libroIsbn;
    }

    public String getUbicacionSala() {
        return ubicacionSala;
    }

    public void setUbicacionSala(String ubicacionSala) {
        this.ubicacionSala = ubicacionSala;
    }

    public int getUbicacionPasillo() {
        return ubicacionPasillo;
    }

    public void setUbicacionPasillo(int ubicacionPasillo) {
        this.ubicacionPasillo = ubicacionPasillo;
    }

    public int getUbicacionEstante() {
        return ubicacionEstante;
    }

    public void setUbicacionEstante(int ubicacionEstante) {
        this.ubicacionEstante = ubicacionEstante;
    }

    public int getUbicacionCajon() {
        return ubicacionCajon;
    }

    public void setUbicacionCajon(int ubicacionCajon) {
        this.ubicacionCajon = ubicacionCajon;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "id=" + id +
                ", libroIsbn='" + libroIsbn + '\'' +
                ", ubicacionSala='" + ubicacionSala + '\'' +
                ", ubicacionPasillo=" + ubicacionPasillo +
                ", ubicacionEstante=" + ubicacionEstante +
                ", ubicacionCajon=" + ubicacionCajon +
                '}';
    }
}
