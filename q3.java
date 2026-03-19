package com.serv;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/convert")
public class q3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double celsius = Double.parseDouble(request.getParameter("celsius"));

        // Formula: F = (C × 9/5) + 32
        double fahrenheit = (celsius * 9/5) + 32;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Conversion Result</h2>");
        out.println("Celsius: " + celsius + " °C<br>");
        out.println("Fahrenheit: " + fahrenheit + " °F");
        out.println("</body></html>");
    }
}