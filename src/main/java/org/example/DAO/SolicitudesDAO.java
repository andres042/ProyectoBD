package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.example.model.Solicitud;

public class SolicitudesDAO {
    private Connection connection;

    public SolicitudesDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Solicitud> getAllSolicitudes() throws SQLException {
        List<Solicitud> solicitudes = new ArrayList<>();
        String query = "SELECT * FROM solicitudes";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int numeroConsecutivo = resultSet.getInt("numero_consecutivo");
                String fecha = resultSet.getString("fecha");
                String descripcion = resultSet.getString("descripcion");
                String usuarioIdentificacion = resultSet.getString("usuario_identificacion");
                String libroISBN = resultSet.getString("libro_isbn");
                String libroTitulo = resultSet.getString("libro_titulo");
                Solicitud solicitud = new Solicitud(numeroConsecutivo, fecha, descripcion, usuarioIdentificacion, libroISBN, libroTitulo);
                solicitudes.add(solicitud);
            }
        }
        return solicitudes;
    }
}
