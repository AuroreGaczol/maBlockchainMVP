package com.oror.maBlockchain_MVP.dal.Jdbc;


import com.oror.maBlockchain_MVP.bo.User;
import com.oror.maBlockchain_MVP.dal.ConnectionProvider;
import com.oror.maBlockchain_MVP.dal.UserDAO;

import java.sql.*;

public class UserDAOJdbcImpl implements UserDAO {
    private final String INSERT = "INSERT INTO user (login, password, email) VALUES (?, ?, ?);";
    private final String SELECT_BY_LOGIN_AND_PASSWORD = "SELECT * FROM user WHERE login = ? AND password =?;";

    @Override
    public void add(User u) {
        try (Connection cnx = ConnectionProvider.getConnection()) {
            System.out.println("on est dans le try de la connection");
            PreparedStatement pstt = cnx.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
            pstt.setString(1, u.getLogin());
            pstt.setString(2, u.getPassword());
            pstt.setString(3, u.getEmail());
            pstt.executeUpdate();

            ResultSet rsInsert = pstt.getGeneratedKeys();
            if (rsInsert.next()) {
                int id = rsInsert.getInt(1);
                u.setId(id);
            }

            pstt.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("on est dans le catch de la connexion");
            e.printStackTrace();
        }
    }

    @Override
    public User selectByLoginAndPassword(String login, String password) {
        User u = null;

        try (Connection cnx = ConnectionProvider.getConnection()) {
            PreparedStatement pstt = cnx.prepareStatement(SELECT_BY_LOGIN_AND_PASSWORD);
            pstt.setString(1, login);
            pstt.setString(2, password);
            ResultSet rs = pstt.executeQuery();

            while (rs.next()) {
                login = rs.getString(1);
                password = rs.getString(2);


                u = new User(login, password);
            }

            pstt.close();

        } catch (Exception e) {
//			System.out.println("Erreur lors de la récupération de l'utilisateur (UtilisateurDaoJdbcImpl --> selectByEmailEtMdp)");
            e.printStackTrace();
        }

        return u;
    }

}
