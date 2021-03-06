/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordfrequency.dao;

/**
 *Deal with the connection to the DB
 * @author david
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnect {


    private static Connection conn = null;
    final static String URL = "jdbc:mysql://localhost/WordFrequency";
/**
 * this method will connect to the DB
 * 
 * replace  **user ** and *** password *** by the credential of the DB to be used
 * @return : connection to be use to all DB access
 */
    public static Connection getConnection() {

        if (conn == null) {

            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection(URL, "**user**", "****password****");// credential DB
            } catch (SQLException sqlE) {
                System.out.println("Sql Erreur " + sqlE.getMessage());
                throw new RuntimeException();
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
        return conn;
    }
}