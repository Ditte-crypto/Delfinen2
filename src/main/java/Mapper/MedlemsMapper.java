package Mapper;

import Util.DBConnector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MedlemsMapper {

    //Tilføj medlem
    public void createPizzaInDB(Pizza pizza) {
        String sqlQuery = "";
        Connection connection = DBConnector.getInstance().getConnection();
        try {
            Statement statement = connection.createStatement();
            sqlQuery = "insert into pizzaer(Pizzanavn,Ingredienser,Pris) values ('"
                    + pizza.getNavn() + "','"
                    + pizza.getIngredienser() + "',"
                    + pizza.getPris() + ");";
            statement.executeUpdate(sqlQuery);
        } catch (SQLException e) {
            System.out.println("Fejl: " + e.getMessage());
        }
    }
}
