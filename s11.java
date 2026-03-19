package com.serv;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/step1")
public class s11 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Step 2</h2>");

        out.println("<form action='step2' method='post'>");

        out.println("<input type='hidden' name='name' value='"+name+"'>");
        out.println("<input type='hidden' name='email' value='"+email+"'>");

        out.println("College: <input type='text' name='college'><br><br>");
        out.println("Branch: <input type='text' name='branch'><br><br>");

        out.println("<input type='submit' value='Next'>");

        out.println("</form>");
        out.println("</body></html>");
    }
}