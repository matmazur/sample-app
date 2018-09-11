package com.someapp.servlets;

import com.someapp.DAO.DAOFactory;
import com.someapp.DAO.MysqlDAOFactory;
import com.someapp.DAO.modelDAO.interfaces.UserDAO;
import com.someapp.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/register-servlet")
public class RegisterServlet extends HttpServlet {

   DAOFactory factory;



    @Override
    public void init() throws ServletException {


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {




    }
}
