package com.serv;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hobby")
public class q16 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        String[] h = request.getParameterValues("hobby");

        PrintWriter out = response.getWriter();
        for(String s : h) {
            out.println(s+"<br>");
        }
    }
}