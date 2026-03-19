package com.serv;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/area")
public class q19 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        int l = Integer.parseInt(request.getParameter("l"));
        int b = Integer.parseInt(request.getParameter("b"));

        response.getWriter().println("Area = "+(l*b));
    }
}