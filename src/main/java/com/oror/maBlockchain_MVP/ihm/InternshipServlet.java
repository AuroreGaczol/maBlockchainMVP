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
        System.out.println("on est dans le servlet pour afficher les voitures");
        try {
            CarManager cm = new CarManager();
        List<Car> cars = cm.lister();
        request.setAttribute("cars", cars);
        } catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/internship.jsp");
        rd.forward(request, response);


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}