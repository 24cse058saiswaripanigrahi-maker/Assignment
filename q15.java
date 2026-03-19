package com.serv;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/employee")
public class q15 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        PrintWriter out = response.getWriter();

        out.println("<table border='1'>");
        out.println("<tr><th>Name</th><th>Salary</th><th>Dept</th></tr>");
        out.println("<tr>");
        out.println("<td>"+request.getParameter("name")+"</td>");
        out.println("<td>"+request.getParameter("salary")+"</td>");
        out.println("<td>"+request.getParameter("dept")+"</td>");
        out.println("</tr></table>");
    }
}