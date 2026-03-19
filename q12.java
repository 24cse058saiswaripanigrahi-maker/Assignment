package com.serv;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;
@WebServlet("/student")
public class q12 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Student Details</h2>");
        out.println("Name: " + request.getParameter("name") + "<br>");
        out.println("Age: " + request.getParameter("age") + "<br>");
        out.println("Course: " + request.getParameter("course") + "<br>");
        out.println("Gender: " + request.getParameter("gender"));
    }
}