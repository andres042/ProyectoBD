package org.example.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.example.model.Prestamo;

public class PrestamosDAO {
    private Connection connection;

    public PrestamosDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Prestamo> getAllPrestamos() throws SQLException {
        List<Prestamo> prestamos = new ArrayList<>();
        String query = "SELECT * FROM prestamos";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int numeroConsecutivo = resultSet.getInt("numero_consecutivo");
                int ejemplarId = resultSet.getInt("ejemplar_id");
                Date fechaRealizacion = resultSet.getDate("fecha_realizacion");
                Date fechaDevolucion = resultSet.getDate("fecha_devolucion");
                String empleadoAtendio = resultSet.getString("empleado_atendio");
                Prestamo prestamo = new Prestamo(numeroConsecutivo, ejemplarId, fechaRealizacion, fechaDevolucion, empleadoAtendio);
                prestamos.add(prestamo);
            }
        }
        return prestamos;
    }
}
