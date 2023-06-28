package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.example.model.Ejemplar;


public class EjemplaresDAO {
    private Connection connection;

    public EjemplaresDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Ejemplar> getAllEjemplares() {
        List<Ejemplar> ejemplares = new ArrayList<>();

        String query = "SELECT * FROM ejemplares";

        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String libroIsbn = resultSet.getString("libro_isbn");
                String ubicacionSala = resultSet.getString("ubicacion_sala");
                int ubicacionPasillo = resultSet.getInt("ubicacion_pasillo");
                int ubicacionEstante = resultSet.getInt("ubicacion_estante");
                int ubicacionCajon = resultSet.getInt("ubicacion_cajon");

                Ejemplar ejemplar = new Ejemplar(id, libroIsbn, ubicacionSala, ubicacionPasillo, ubicacionEstante, ubicacionCajon);
                ejemplares.add(ejemplar);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ejemplares;
    }
}