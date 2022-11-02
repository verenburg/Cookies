package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        Cookie[] cookies = request.getCookies();

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        for (Cookie cookie: cookies) {
            pw.println("<h1> Наименование куки: " + cookie.getName() + " Значение куки: " + cookie.getValue() + "</h1>");
        }
        pw.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
