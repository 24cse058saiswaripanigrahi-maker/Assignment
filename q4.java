package com.serv;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/student")
public class q4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String roll = request.getParameter("roll");
        String course = request.getParameter("course");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Student Details</h2>");
        out.println("<hr>");
        out.println("<b>Name:</b> " + name + "<br>");
        out.println("<b>Roll No:</b> " + roll + "<br>");
        out.println("<b>Course:</b> " + course);
        out.println("</body></html>");
    }
}