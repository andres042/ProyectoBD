package org.example.DAO;

import org.example.model.LibroDigital;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibrosDigitalesDAO {
    private Connection connection;

    public LibrosDigitalesDAO(Connection connection) {
        this.connection = connection;
    }

    public List<LibroDigital> getAllLibrosDigitales() {
        List<LibroDigital> librosDigitales = new ArrayList<>();

        String query = "SELECT * FROM libros_digitales";

        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String isbn = resultSet.getString("isbn");
                String url = resultSet.getString("url");
                String formatoArchivo = resultSet.getString("formato_archivo");
                long tamanoBytes = resultSet.getLong("tamano_bytes");

                LibroDigital libroDigital = new LibroDigital(isbn, url, formatoArchivo, tamanoBytes);
                librosDigitales.add(libroDigital);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return librosDigitales;
    }
}
