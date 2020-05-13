package Mapper;

import Model.Medlem;
import Util.DBConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ResultatMapper {

    public void tilfoejMedlemTilKonkurrencesvoemmer(Medlem medlem){
        String sqlQuery = "";
        Connection connection = DBConnector.getInstance().getConnection();
        try {
            Statement statement = connection.createStatement();

            sqlQuery = "insert into konkurrencesvoemmer(MedlemsID) values ('"
                    + medlem.getId() + ");";
            statement.executeUpdate(sqlQuery,Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            int medlemsID = resultSet.getInt(1);
        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
        }

    }

    public ArrayList<Medlem> getAllKonkurrencesvoemmere(){
        ArrayList<Medlem> konkurrencesvoemmer = new ArrayList<>();
        Medlem retMedlem = null;
        String sqlQuery = "";
        Connection connection = DBConnector.getInstance().getConnection();
        try {
            Statement statement = connection.createStatement();
            sqlQuery ="select * from konkurrencesvoemmer";
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
