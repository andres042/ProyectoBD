package org.example.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.example.model.Profesor;

public class ProfesoresDAO {
    private Connection connection;

    public ProfesoresDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Profesor> getAllProfesores() throws SQLException {
        List<Profesor> profesores = new ArrayList<>();
        String query = "SELECT * FROM profesores";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                String identificacion = resultSet.getString("identificacion");
                String dependencia = resultSet.getString("dependencia");
                String titulo = resultSet.getString("titulo");
                String areasInteres = resultSet.getString("areas_interes");
                Profesor profesor = new Profesor(identificacion, dependencia, titulo, areasInteres);
                profesores.add(profesor);
            }
        }
        return profesores;
    }
}