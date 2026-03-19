package com.serv;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/validate")
public class q17 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String name = request.getParameter("name");

        if(name==null || name.isEmpty()) {
            response.getWriter().println("<p style='color:red'>Name required!</p>");
        } else {
            response.getWriter().println("Hello "+name);
        }
    }
}