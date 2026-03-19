package com.serv;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/si")
public class q6 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double p = Double.parseDouble(request.getParameter("p"));
        double r = Double.parseDouble(request.getParameter("r"));
        double t = Double.parseDouble(request.getParameter("t"));

        double si = (p * r * t) / 100;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Simple Interest Result</h2>");
        out.println("Principal: " + p + "<br>");
        out.println("Rate: " + r + "<br>");
        out.println("Time: " + t + "<br>");
        out.println("Simple Interest = " + si);
    }
}