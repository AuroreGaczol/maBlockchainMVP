
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/ScreenBDDS")
public class ScreenBDDServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("On est dans la servlet d'affichage");
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/internship.jsp");
        rd.forward(request, response);
    }
}
