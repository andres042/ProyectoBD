package org.example.DAO;

import org.example.model.AreaHija;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AreasHijasDAO {
    private Connection connection;

    public AreasHijasDAO(Connection connection) {
        this.connection = connection;
    }

    public List<AreaHija> getAllAreasHijas() {
        List<AreaHija> areasHijas = new ArrayList<>();

        try {
            String query = "SELECT * FROM areas_hijas";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int areaPadreId = resultSet.getInt("area_padre_id");
                int areaHijaId = resultSet.getInt("area_hija_id");
                String areaHija = resultSet.getString("area_hija");

                AreaHija areaHijaObj = new AreaHija(areaPadreId, areaHijaId, areaHija);
                areasHijas.add(areaHijaObj);
            }

            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return areasHijas;
    }
}
