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
                int Aargang = resultSet.getInt("Aargang");
                Boolean Betalt = resultSet.getBoolean("Betalt");
                Boolean Aktiv = resultSet.getBoolean("Aktiv");
                retRestance = new Medlem();
                retRestance.setId(Id);
                retRestance.setNavn(Navn);
                retRestance.setAargang(Aargang);
                retRestance.setBetalt(Betalt);
                retRestance.setAktiv(Aktiv);
                restance.add(retRestance);
                //Printer resultaterne
                //System.out.format("%s, %s, %s, %s, %s", Id, );
            }
        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
        }

        return restance;
    }

    public void tilfoejMedlemByIdTilRestanceListe(int id){
        String sqlQuery = "";
        Connection connection = DBConnector.getInstance().getConnection();

        try {
            Statement statement = connection.createStatement();
            sqlQuery = "update medlemmer set Betalt = 0 where MedlemsID = "+id;

            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
        }

    }

    public void medlemHarBetalt(int id){
        String sqlQuery = "";
        Connection connection = DBConnector.getInstance().getConnection();

        try {
            Statement statement = connection.createStatement();
            sqlQuery = "update medlemmer set Betalt = 1 where MedlemsID = "+id;

            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
        }

    }
}
