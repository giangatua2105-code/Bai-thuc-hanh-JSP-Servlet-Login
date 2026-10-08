package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head><meta charset='UTF-8'><title>Result</title>");
            out.println("<style>body{font-family:Arial;display:flex;justify-content:center;align-items:center;min-height:100vh;background:linear-gradient(135deg,#667eea,#764ba2);margin:0;}.box{background:white;padding:40px;border-radius:12px;text-align:center;}a{color:#1b2a7a;}</style>");
            out.println("</head><body><div class='box'>");
            
            if ("admin".equals(user) && "admin".equals(pass)) {
                out.println("<h1 style='color:green;'>Welcome admin to website</h1>");
            } else {
                out.println("<h1 style='color:red;'>Login Error</h1>");
            }
            out.println("<br><a href='index.jsp'>Go back</a></div></body></html>");
        }
    }
}
