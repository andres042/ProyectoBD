package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.example.model.Estudiante;


public class EstudiantesDAO {
    private Connection connection;

    public EstudiantesDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Estudiante> getAllEstudiantes() throws SQLException {
        List<Estudiante> estudiantes = new ArrayList<>();
        String query = "SELECT * FROM estudiantes";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                String identificacion = resultSet.getString("identificacion");
                String carrera = resultSet.getString("carrera");
                String universidadProviene = resultSet.getString("universidad_proviene");
                Estudiante estudiante = new Estudiante(identificacion, carrera, universidadProviene);
                estudiantes.add(estudiante);
            }
        }
        return estudiantes;
    }
}
