package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.example.model.DescargaLibro;

public class DescargaLibrosDAO {
    private Connection connection;

    public DescargaLibrosDAO(Connection connection) {
        this.connection = connection;
    }

    public List<DescargaLibro> getAllDescargasLibros() throws SQLException {
        List<DescargaLibro> descargasLibros = new ArrayList<>();
        String query = "SELECT * FROM descargas_libros_digitales";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                String usuarioIdentificacion = resultSet.getString("usuario_identificacion");
                String fecha = resultSet.getString("fecha");
                String hora = resultSet.getString("hora");
                String ipMaquina = resultSet.getString("ip_maquina");
                DescargaLibro descargaLibro = new DescargaLibro(usuarioIdentificacion, fecha, hora, ipMaquina);
                descargasLibros.add(descargaLibro);
            }
        }
        return descargasLibros;
    }
}
