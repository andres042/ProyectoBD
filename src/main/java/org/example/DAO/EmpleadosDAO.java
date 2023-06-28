package org.example.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.example.model.Empleado;


public class EmpleadosDAO {
    private Connection connection;

    public EmpleadosDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Empleado> getAllEmpleados() throws SQLException {
        List<Empleado> empleados = new ArrayList<>();
        String query = "SELECT * FROM empleados";
        try (PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                int identificacionEmpleado = resultSet.getInt("identificacion_empleado");
                String nombre = resultSet.getString("nombre");
                String cargo = resultSet.getString("cargo");
                Empleado empleado = new Empleado(identificacionEmpleado, nombre, cargo);
                empleados.add(empleado);
            }
        }
        return empleados;
    }
}
