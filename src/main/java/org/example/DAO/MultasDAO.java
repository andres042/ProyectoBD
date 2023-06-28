package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.example.model.Multa;

public class MultasDAO {
    private Connection connection;

    public MultasDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Multa> getAllMultas() throws SQLException {
        List<Multa> multas = new ArrayList<>();
        String query = "SELECT * FROM multas";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                String usuarioIdentificacion = resultSet.getString("usuario_identificacion");
                String fecha = resultSet.getString("fecha");
                long valor = resultSet.getLong("valor");
                String descripcion = resultSet.getString("descripcion");
                Multa multa = new Multa(usuarioIdentificacion, fecha, valor, descripcion);
                multas.add(multa);
            }
        }
        return multas;
    }
}
