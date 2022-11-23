package com.bitcero.sga.web;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bitcero.sga.domain.Person;
import com.bitcero.sga.domain.User;
import com.bitcero.sga.service.PersonServiceLocal;
import com.bitcero.sga.service.UserService;

@WebServlet("/users")
public class UserServlet extends HttpServlet {

  private static final long serialVersionUID = 718695834870912649L;

  @Inject
  UserService userService;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    List<User> listUsers = userService.listAllUsers();
    System.out.println(("listUsers -> " + listUsers));

    request.setAttribute("listUsers", listUsers);
    request.getRequestDispatcher("/listUsers.jsp").forward(request, response);
  }
}
