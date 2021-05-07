package com.oror.maBlockchain_MVP.ihm;


import org.example.Car;
import org.example.CarManager;

import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/internship")
public class InternshipServlet extends HttpServlet {
//
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        CarManager cm = new CarManager();
        List<Car> cars = cm.lister();
        request.setAttribute("cars", cars);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/internship.jsp");
        rd.forward(request, response);


    }

}