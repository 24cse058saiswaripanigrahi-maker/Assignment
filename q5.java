package com.serv;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/greater")
public class q5 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int n1 = Integer.parseInt(request.getParameter("num1"));
        int n2 = Integer.parseInt(request.getParameter("num2"));

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (n1 > n2) {
            out.println("Greater number is: " + n1);
        } else if (n2 > n1) {
            out.println("Greater number is: " + n2);
        } else {
            out.println("Both numbers are equal");
        }
    }
}