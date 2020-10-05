package Datebase;

import java.sql.Connection;
import java.sql.DriverManager;


public class DateBaseMain {

    public static void main(String[] args) {
        Connection connection = null;
        String username = "postgres";
        String password = "admin";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/sport_ru", "" + username + "", "" + password + "");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (connection != null) {
            System.out.println("Connection OK");
        } else {
            System.out.println("Connection Failed");
        }
    }

}






