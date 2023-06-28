package org.example.DAO;

import org.example.model.Autor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AutoresDAO {
    private Connection connection;

    public AutoresDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Autor> getAllAutores() {
        List<Autor> autores = new ArrayList<>();

        String query = "SELECT * FROM autores";

        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int codigoAutor = resultSet.getInt("codigo_autor");
                String primerApellido = resultSet.getString("primer_apellido");
                String segundoApellido = resultSet.getString("segundo_apellido");
                String primerNombre = resultSet.getString("primer_nombre");
                String segundoNombre = resultSet.getString("segundo_nombre");

                Autor autor = new Autor(codigoAutor, primerApellido, segundoApellido, primerNombre, segundoNombre);
                autores.add(autor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return autores;
    }
}
