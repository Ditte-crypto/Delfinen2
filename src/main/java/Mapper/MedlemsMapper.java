package Mapper;

import Model.Medlem;
import Util.DBConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MedlemsMapper {

    //Tilføj medlem
    public static void lavNytMedlem(Medlem medlem) {
        String sqlQuery = "";
        Connection connection = DBConnector.getInstance().getConnection();
        try {
            Statement statement = connection.createStatement();
            sqlQuery = "insert into medlemmer(Navn,Aargang,Betalt,Aktiv) values ('"
                    + medlem.getNavn() + "','"
                    + medlem.getAargang() + "',"
                    + medlem.getBetalt() + ");"
                    + medlem.getAktiv() + ");";
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
        }
    }


    public ArrayList<Medlem> getAllMedlemmer(){
        ArrayList<Medlem> medlemmer = new ArrayList<>();
        Medlem retMedlem = null;
        String sqlQuery = "";
        Connection connection = DBConnector.getInstance().getConnection();
        try {
            Statement statement = connection.createStatement();
            sqlQuery ="select * from delfin";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            //bearbejdning af resultset:
            while(resultSet.next()) {
                int Id = resultSet.getInt("MedlemsID");
                String Navn = resultSet.getString("Navn");
                int Aargang = resultSet.getInt("Aargang");
                Boolean Betalt = resultSet.getBoolean("Betalt");
                Boolean Aktiv = resultSet.getBoolean("Aktiv");
                retMedlem = new Medlem();
                retMedlem.setId(Id);
                retMedlem.setNavn(Navn);
                retMedlem.setAargang(Aargang);
                retMedlem.setBetalt(Betalt);
                retMedlem.setAktiv(Aktiv);
                medlemmer.add(retMedlem);
                //Printer resultaterne
                //System.out.format("%s, %s, %s, %s, %s", Id, );
            }
        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
        }

        return medlemmer;
    }

    public void deleteMedlem(Medlem medlem){
        String sqlQuery = "";
        Connection connection = DBConnector.getInstance().getConnection();

        try {
            Statement statement = connection.createStatement();
            sqlQuery ="DELETE FROM medlemmer WHERE MedlemsID = " + medlem.getId();
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
        }

    }
}
