package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// Định tuyến URL nhận request từ action="login" của Form
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    // Sử dụng doPost để bắt dữ liệu từ form có method="POST"
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        // 1. Lấy dữ liệu người dùng nhập từ Form (qua thuộc tính 'name' của input)
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login Result</title>");
            out.println("<meta charset='UTF-8'>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; display: flex; justify-content: center; align-items: center; min-height: 100vh; background: linear-gradient(135deg, #667eea 0%, #764ba2 100%); margin: 0; }");
            out.println(".result-container { background: white; padding: 40px; border-radius: 12px; box-shadow: 0 20px 40px rgba(0,0,0,0.2); text-align: center; max-width: 500px; }");
            out.println("h1 { margin-bottom: 20px; }");
            out.println(".success { color: #28a745; }");
            out.println(".error { color: #dc3545; }");
            out.println("a { display: inline-block; margin-top: 20px; padding: 10px 20px; background: #667eea; color: white; text-decoration: none; border-radius: 6px; }");
            out.println("a:hover { background: #764ba2; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='result-container'>");
            
            // 2. Kiểm tra điều kiện logic (admin/admin)
            if ("admin".equals(user) && "admin".equals(pass)) {
                out.println("<h1 class='success'>✅ Welcome admin to website</h1>");
            } else {
                out.println("<h1 class='error'>❌ Login Error</h1>");
            }
            
            out.println("<a href='index.jsp'>← Go back</a>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    // Xử lý GET: chuyển hướng về trang login
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }
}