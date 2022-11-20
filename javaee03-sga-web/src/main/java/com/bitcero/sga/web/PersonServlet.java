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
import com.bitcero.sga.service.PersonServiceLocal;

@WebServlet("/persons")
public class PersonServlet extends HttpServlet {

  @Inject
  PersonServiceLocal personService;

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    List<Person> listPersons = personService.listAllPerson();
    System.out.println(("listPerson -> " + listPersons));

    request.setAttribute("listPersons", listPersons);
    request.getRequestDispatcher("/listPersons.jsp").forward(request, response);
  }
}
