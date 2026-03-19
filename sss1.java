package com.serv;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/final")
public class sss1 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String college = request.getParameter("college");
        String branch = request.getParameter("branch");
        String skills = request.getParameter("skills");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Registration Summary</h2>");

        out.println("Name: " + name + "<br>");
        out.println("Email: " + email + "<br>");
        out.println("College: " + college + "<br>");
        out.println("Branch: " + branch + "<br>");
        out.println("Skills: " + skills + "<br>");

        out.println("</body></html>");
    }
}