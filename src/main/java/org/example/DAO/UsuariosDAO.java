package org.example.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.example.model.Usuario;


public class UsuariosDAO {
    private Connection connection;

    public UsuariosDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Usuario> getAllUsuarios() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuarios";

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                String identificacion = rs.getString("identificacion");
                String nombre = rs.getString("nombre");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                String tipo = rs.getString("tipo");

                Usuario usuario = new Usuario(identificacion, nombre, direccion, telefono, email, tipo);
                usuarios.add(usuario);
            }
        }

        return usuarios;
    }
}
