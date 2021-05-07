package com.oror.maBlockchain_MVP.ihm;

import com.oror.maBlockchain_MVP.bll.BllException;
import com.oror.maBlockchain_MVP.bll.UserManager;
import com.oror.maBlockchain_MVP.bo.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/signin")
public class SigninServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/index.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        System.out.println("On est dans la servlet signin");
        ArrayList<String> erreurs = new ArrayList<>();
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        User user= new User(login, password, email);
        UserManager um = new UserManager();


        try{
            System.out.println("on est dans le try");
            if (login.equals("")){
                System.out.println("on est dans le if");
                erreurs.add("le login doit être renseigné");
            }
        } catch (Exception e){
            System.out.println("on est dans le catch");
            String erreur = e.getMessage();
            request.setAttribute("erreurs", erreur);
            System.out.println(erreur);
            e.printStackTrace();
        }
        if(erreurs.size()>0) {
            System.out.println("on est dans le tableau d'erreur s'il est rempli");
            request.setAttribute("erreurs", erreurs);
            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

        }
        else {
            System.out.println("rien dans le tableau d'erreur");
            request.setAttribute("User", user);
            try {
                um.add(user);
            } catch (BllException e) {
                e.printStackTrace();
                System.out.println("ça n'a pas été dans le add");
            }
            System.out.println(user.getLogin());
            RequestDispatcher dispatcher = request.getRequestDispatcher("internship.jsp");
            dispatcher.forward(request,response);
        }
    }
}
