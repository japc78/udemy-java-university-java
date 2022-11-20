package com.bitcero.sga.client;

import java.util.List;

import javax.naming.*;

import com.bitcero.sga.domain.Person;
import com.bitcero.sga.service.PersonServiceRemote;


public class ClientPersonService {
  public static void main(String[] args) {
    System.out.println("Starting call to EJB from client");

    try {
      Context jndi = new InitialContext();
      PersonServiceRemote personService = (PersonServiceRemote) jndi.lookup("java:global/sga-jee/PersonServiceImpl!com.bitcero.sga.service.PersonServiceRemote");
      List<Person> listPerson = personService.listAllPerson();

     for (Person person : listPerson) {
      System.out.println(person);

     }

     System.out.println("\n Finish of call to client EJB");

    } catch (NamingException e) {
      e.printStackTrace(System.out);
    }
  }
}
