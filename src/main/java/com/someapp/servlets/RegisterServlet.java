package com.someapp.servlets;

import com.someapp.DAO.modelDAO.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register-servlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String email = request.getParameter("inputEmail");
        String username = request.getParameter("inputUsername");
        String password = request.getParameter("password");
        UserService service = new UserService();

        service.addUser(username,password,email);
        response.sendRedirect(request.getContextPath() + "/");

    }
}
