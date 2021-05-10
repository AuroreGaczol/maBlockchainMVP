
import com.oror.maBlockchain_MVP.bll.BllException;
import com.oror.maBlockchain_MVP.bll.UserManager;
import com.oror.maBlockchain_MVP.bo.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String redirect = "/internship";
        RequestDispatcher rd = request.getRequestDispatcher(redirect);
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = null;
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        UserManager userManager = new UserManager();
        boolean isRemember = remember != null;

        try {
            user = userManager.selectByLoginAndPassword(login, password);
            if (isRemember) {
                System.out.println("on est dans le if cookie");
                Cookie cookie = new Cookie("login", login);
                cookie.setMaxAge(60 * 60 * 24 * 15);
                response.addCookie(cookie);
            }
            //ouverture de session
            HttpSession sessionUser = request.getSession(true);
            sessionUser.setAttribute("RegisteredUser", user);
            request.setAttribute("RegisteredUser", user);
            RequestDispatcher rd = request.getRequestDispatcher("/internship");
            System.out.println("on est dans le try LoginServlet");
            rd.forward(request, response);


        }catch (BllException e)  {
            System.out.println("Erreur lors de la récupération de l'utilisateur");
        }


            //ouverture de session
            HttpSession sessionUser = request.getSession(true);
            sessionUser.setAttribute("RegisteredUser", user);
            request.setAttribute("RegisteredUser", user);
            RequestDispatcher rd = request.getRequestDispatcher("/internship");
            rd.forward(request, response);
        }

    }

