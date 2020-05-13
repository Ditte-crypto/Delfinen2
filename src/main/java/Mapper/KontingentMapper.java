package Mapper;

import Model.Kontingent;
import Model.Medlem;
import Util.DBConnector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class KontingentMapper {

    public ArrayList<Kontingent> alleBetalinger() {
        ArrayList<Kontingent> alleBetalinger = new ArrayList<>();
        String sqlQuery = "SELECT * FROM Betalinger";
        Connection connection = DBConnector.getInstance().getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet res = preparedStatement.executeQuery();
            while (res.next()) {
                int payid = res.getInt(1);
                int memberid = res.getInt(2);
                int year = res.getInt(3);
                int amount = res.getInt(4);

            }

        } catch (SQLException e) {
            System.out.println("Errr");
        }
        return alleBetalinger;
    }

    public void indbetal(Medlem medlem, int amount) {

    }

}
