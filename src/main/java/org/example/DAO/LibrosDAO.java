package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.example.model.Libro;


public class LibrosDAO {
    private Connection connection;

    public LibrosDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Libro> getAllLibros() {
        List<Libro> libros = new ArrayList<>();

        String query = "SELECT * FROM libros";

        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                String isbn = resultSet.getString("isbn");
                String titulo = resultSet.getString("titulo");
                int anioPublicacion = resultSet.getInt("ano_publicacion");
                String idioma = resultSet.getString("idioma");
                int areaConocimientoId = resultSet.getInt("area_conocimiento_id");
                int numPaginas = resultSet.getInt("num_paginas");

                Libro libro = new Libro(isbn, titulo, anioPublicacion, idioma, areaConocimientoId, numPaginas);
                libros.add(libro);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return libros;
    }
}
