package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;

import org.example.model.AreaConocimiento;

public class AreasConocimientoDAO {
    private Connection connection;

    public AreasConocimientoDAO(Connection connection) {
        this.connection = connection;
    }

    public AreasConocimientoDAO(String user, String pass) {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prueba_proyecto", user, pass);
        } catch (SQLException e) {
            System.out.println("Error al establecer la conexión con la base de datos: " + e.getMessage());
        }
    }


    // Método para obtener todas las áreas de conocimiento
    public List<AreaConocimiento> getAllAreasConocimiento() {
        List<AreaConocimiento> areasConocimiento = new ArrayList<>();
        String query = "SELECT codigo, nombre, descripcion, area_padre_id FROM areas_conocimiento";

        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int codigo = resultSet.getInt("codigo");
                String nombre = resultSet.getString("nombre");
                String descripcion = resultSet.getString("descripcion");
                int areaPadreId = resultSet.getInt("area_padre_id");

                AreaConocimiento areaConocimiento = new AreaConocimiento(codigo, nombre, descripcion, areaPadreId);
                areasConocimiento.add(areaConocimiento);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return areasConocimiento;
    }


}

