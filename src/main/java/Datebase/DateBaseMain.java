package Datebase;

import java.sql.*;


public class DateBaseMain {

    public static void main(String[] args) {
//        Connection connection = null;
        String username = "postgres";
        String password = "admin";
        try (Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/sport_ru", "" + username + "", "" + password + "")) {
//            Class.forName("org.postgresql.Driver");
//            connection = DriverManager.getConnection(
//                    "jdbc:postgresql://localhost:5432/sport_ru", "" + username + "", "" + password + "");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM sportsman");
            while (resultSet.next()) {
                System.out.printf("%-5.5s  %-5.5s%n", resultSet.getString("sportsman_name"), resultSet.getString("country"));
            }
//        if (connection != null) {
//            System.out.println("Connection OK");
//        } else {
//            System.out.println("Connection Failed");
//        }
//    }

        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}







