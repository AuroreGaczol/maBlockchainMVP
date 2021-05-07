package com.oror.maBlockchain_MVP.bll;


import com.oror.maBlockchain_MVP.bo.User;
import com.oror.maBlockchain_MVP.dal.DAOFactory;
import com.oror.maBlockchain_MVP.dal.UserDAO;

public class UserManager {
    private UserDAO uDao;

    public UserManager(){
        uDao = DAOFactory.getUserDAO();
    }

    public void add(User u) throws BllException{
        System.out.println("on est dans User Manager");
        uDao.add(u);
    }
    public User selectByLoginAndPassword(String login, String password) throws BllException{
        System.out.println("on est dans le user manager select");
        if (login == null) {
            System.out.println("login == null");
            throw new BllException();
        }
        return uDao.selectByLoginAndPassword(login, password);
    }


//    private void validateUser(User u) throws BllException {
//        if (u!=null &&
//        u.getLogin() != null){
//
//        }else{
//            BllException exc = new BllException("Le formulaire n'est pas correctement rempli");
//            throw exc;
//        }
//    }
}
