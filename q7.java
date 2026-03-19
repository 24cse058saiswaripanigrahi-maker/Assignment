package com.serv;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/hidden")
public class q7 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String userId = request.getParameter("userId");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Received Data</h2>");
        out.println("Name: " + name + "<br>");
        out.println("User ID: " + userId);
    }
}