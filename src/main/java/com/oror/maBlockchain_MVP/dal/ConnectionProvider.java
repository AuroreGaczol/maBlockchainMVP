package com.oror.maBlockchain_MVP.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionProvider {


    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        /* Connexion à la base de données */
        System.out.println("on est dans ConnectionProvider");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver ok");
        } catch (ClassNotFoundException e) {
            System.out.println("echec driver");
        }
        Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/maBlockchain","root","admin");
            System.out.println("on est à la fin de connectionProvider");
            return cnx;
    }
}

