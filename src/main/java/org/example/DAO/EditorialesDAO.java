package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.example.model.Editorial;


public class EditorialesDAO {
    private Connection connection;

    public EditorialesDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Editorial> getAllEditoriales() {
        List<Editorial> editoriales = new ArrayList<>();
        String query = "SELECT * FROM editoriales";

        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int codigoEditorial = resultSet.getInt("codigo_editorial");
                String nombre = resultSet.getString("nombre");
                String paginaWeb = resultSet.getString("pagina_web");
                String paisOrigen = resultSet.getString("pais_origen");

                Editorial editorial = new Editorial(codigoEditorial, nombre, paginaWeb, paisOrigen);
                editoriales.add(editorial);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return editoriales;
    }
}
