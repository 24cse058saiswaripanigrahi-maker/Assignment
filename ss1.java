package com.serv;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/step2")
public class ss1 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String college = request.getParameter("college");
        String branch = request.getParameter("branch");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Step 3</h2>");

        out.println("<form action='final' method='post'>");

        out.println("<input type='hidden' name='name' value='"+name+"'>");
        out.println("<input type='hidden' name='email' value='"+email+"'>");
        out.println("<input type='hidden' name='college' value='"+college+"'>");
        out.println("<input type='hidden' name='branch' value='"+branch+"'>");

        out.println("Skills: <input type='text' name='skills'><br><br>");

        out.println("<input type='submit' value='Submit'>");

        out.println("</form>");
        out.println("</body></html>");
    }
}