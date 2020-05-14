package Mapper;

import Model.Medlem;
import Model.Resultat;
import Util.DBConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ResultatMapper {

    public void tilfoejMedlemTilResultat(Resultat resultat){

        String sqlQuery = "";
        Connection connection = DBConnector.getInstance().getConnection();
        try {
            Statement statement = connection.createStatement();

            sqlQuery = "insert into resultat(MedlemsID, Staevne, tid, distance, Disciplin) values ('"
                    + medlem.getId() + "',"
                    + resultat.getStaevne() + ","
                    + resultat.getTid() + ","
                    + resultat.getDistance() + ","
                    + resultat.getDisciplin() + ");";
            statement.executeUpdate(sqlQuery,Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            int medlemsID = resultSet.getInt(1);
        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
        }

    }

    //public ArrayList<>

    public ArrayList<Medlem> getAllKonkurencesvoemmere(){
        ArrayList<Medlem> konkurrencesvoemmer = new ArrayList<>();
        Medlem retMedlem = null;
        String sqlQuery = "";
        Connection connection = DBConnector.getInstance().getConnection();
        try {
            Statement statement = connection.createStatement();
            sqlQuery ="select * from ";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            //bearbejdning af resultset:
            while(resultSet.next()) {
                int Id = resultSet.getInt("MedlemsID");
                retMedlem = new Medlem();
                retMedlem.setId(Id);
                konkurrencesvoemmer.add(retMedlem);
            }
        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
        }

        return konkurrencesvoemmer;
    }
}
