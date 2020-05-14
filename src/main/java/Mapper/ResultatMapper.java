package Mapper;

import Model.*;
import Util.DBConnector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ResultatMapper {

    public void tilfoejResultat(Resultat resultat){
        Medlem medlem = new Medlem();
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



    public ArrayList<Resultat> getAllResultater(){
        ArrayList<Resultat> resultater = new ArrayList<>();
        Resultat retResultat = null;
        String sqlQuery = "";
        Medlem medlem;
        MedlemsBog medlemsBog;
        Connection connection = DBConnector.getInstance().getConnection();
        try {
            Statement statement = connection.createStatement();
            sqlQuery ="select * from resultat";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            //bearbejdning af resultset:
            while(resultSet.next()) {
                int MedlemsID = resultSet.getInt("MedlemsID");
                medlemsBog = new MedlemsBog();
                medlem = medlemsBog.getMedlemById(MedlemsID);
                int ResultatID = resultSet.getInt("resultatid");
                String Staevne = resultSet.getString("Staevne");
                int Tid = resultSet.getInt("Tid");
                Distance distance = convertToLiteral(resultSet.getString("distance"));
                Disciplin disciplin = Disciplin.valueOf(resultSet.getString("Disciplin"));
                retResultat = new Resultat();
                retResultat.setMedlem(medlem);
                retResultat.setResultatid(ResultatID);
                retResultat.setStaevne(Staevne);
                retResultat.setTid(Tid);
                retResultat.setDistance(distance);
                retResultat.setDisciplin(disciplin);
                resultater.add(retResultat);
                //Printer resultaterne
                //System.out.format("%s, %s, %s, %s, %s", Id, );
            }
        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
        }

        return resultater;
    }

    private Distance convertToLiteral(String distance) {
        Distance result = null;
        switch(distance){
            case "50": result = Distance.HALVTREDS;
            break;
            case "100": result = Distance.HUNDREDE;
                break;
            case "200": result = Distance.TOHUNDREDE;
                break;
            case "400": result = Distance.FIREHUNDREDE;
                break;
            case "800": result = Distance.OTTEHUNDREDE;
                break;
            case "1500": result = Distance.FEMTENHUNDREDE;
                break;
            default:
                break;
        }
        return result;
    }
}
