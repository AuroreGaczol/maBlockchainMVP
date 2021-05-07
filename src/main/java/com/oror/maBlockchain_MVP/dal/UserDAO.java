package com.oror.maBlockchain_MVP.dal;


import com.oror.maBlockchain_MVP.bo.User;

public interface UserDAO {
    void add(User u);
    User selectByLoginAndPassword(String login, String password);
}