package org.example.model;

public class AreaConocimiento {
    private int codigo;
    private String nombre;
    private String descripcion;
    private int areaPadreId;

    @Override
    public String toString() {
        return "Área de Conocimiento [nombre=" + nombre + ", descripción=" + descripcion + "]";
    }
    public AreaConocimiento(int codigo, String nombre, String descripcion, int areaPadreId) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.areaPadreId = areaPadreId;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAreaPadreId() {
        return areaPadreId;
    }

    public void setAreaPadreId(int areaPadreId) {
        this.areaPadreId = areaPadreId;
    }
}
