package com.oror.maBlockchain_MVP.dal;


import com.oror.maBlockchain_MVP.dal.Jdbc.UserDAOJdbcImpl;


public class DAOFactory {
    public static UserDAO getUserDAO(){
        return new UserDAOJdbcImpl();
    }

}
