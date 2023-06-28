package org.example.model;

public class DescargaLibro {
    private String usuarioIdentificacion;
    private String fecha;
    private String hora;
    private String ipMaquina;

    public DescargaLibro(String usuarioIdentificacion, String fecha, String hora, String ipMaquina) {
        this.usuarioIdentificacion = usuarioIdentificacion;
        this.fecha = fecha;
        this.hora = hora;
        this.ipMaquina = ipMaquina;
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getIpMaquina() {
        return ipMaquina;
    }

    public void setIpMaquina(String ipMaquina) {
        this.ipMaquina = ipMaquina;
    }

    @Override
    public String toString() {
        return "DescargaLibro{" +
                "usuarioIdentificacion='" + usuarioIdentificacion + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", ipMaquina='" + ipMaquina + '\'' +
                '}';
    }
}
