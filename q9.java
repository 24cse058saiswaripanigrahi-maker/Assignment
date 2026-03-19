package com.serv;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/skills")
public class q9 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String[] skills = request.getParameterValues("skill");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h3>Selected Skills:</h3>");

        if (skills != null) {
            for (String s : skills) {
                out.println(s + "<br>");
            }
        } else {
            out.println("No skills selected");
        }
    }
}