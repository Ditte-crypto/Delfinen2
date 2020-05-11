package Mapper;

import Model.Medlem;
import Util.DBConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MedlemsMapper {

    //Tilføj medlem
    public void lavNytMedlem(Medlem medlem) {
        String sqlQuery = "";
        Connection connection = DBConnector.getInstance().getConnection();
        try {
            Statement statement = connection.createStatement();
            sqlQuery = "insert into pizzaer(Pizzanavn,Ingredienser,Pris) values ('"
                    + medlem.getNavn() + "','"
                    + medlem.getAargang() + "',"
                    + medlem.getBetalt() + ");"
                    + medlem.get() + ");";
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
        }
    }
}
