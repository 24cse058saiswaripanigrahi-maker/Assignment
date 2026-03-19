package com.serv;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calc")
public class q2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double n1 = Double.parseDouble(request.getParameter("num1"));
        double n2 = Double.parseDouble(request.getParameter("num2"));
        String op = request.getParameter("op");

        double result = 0;
        String operationName = "";

        switch (op) {
            case "add":
                result = n1 + n2;
                operationName = "Addition";
                break;
            case "sub":
                result = n1 - n2;
                operationName = "Subtraction";
                break;
            case "mul":
                result = n1 * n2;
                operationName = "Multiplication";
                break;
            case "div":
                operationName = "Division";
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    response.getWriter().println("<h2>Cannot divide by zero</h2>");
                    return;
                }
                break;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Calculation Result</h2>");
        out.println("Number 1: " + n1 + "<br>");
        out.println("Number 2: " + n2 + "<br>");
        out.println("Operation: " + operationName + "<br>");
        out.println("<h3>Result = " + result + "</h3>");
        out.println("</body></html>");
    }
}