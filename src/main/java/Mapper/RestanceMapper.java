package Mapper;

import Model.Medlem;
import Util.DBConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RestanceMapper {

    public ArrayList<Medlem> getAllRestancer(){
        ArrayList<Medlem> restance = new ArrayList<>();
        Medlem retRestance = null;
        String sqlQuery = "";
        Connection connection = DBConnector.getInstance().getConnection();
        try {
            Statement statement = connection.createStatement();
            sqlQuery ="select * from medlemmer";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            //bearbejdning af resultset:
            while(resultSet.next()) {
                int Id = resultSet.getInt("MedlemsID");
                String Navn = resultSet.getString("Navn");
                Boolean Betalt = resultSet.getBoolean("Betalt");
                retRestance = new Medlem();
                retRestance.setId(Id);
                retRestance.setNavn(Navn);
                retRestance.setBetalt(Betalt);
                restance.add(retRestance);
                //Printer resultaterne
                //System.out.format("%s, %s, %s, %s, %s", Id, );
            }
        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
        }

        return restance;
    }
}
