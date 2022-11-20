package com.bitcero.test;

import javax.naming.*;

import com.bitcero.beans.HelloWorldEjbRemote;

public class TestHelloWorldEJB {
  public static void main(String[] args) {
    System.out.println("Start EJB client");

    try {
      Context jndi = new InitialContext();
      HelloWorldEjbRemote helloWorldEJB = (HelloWorldEjbRemote) jndi.lookup("java:global/HelloWorldEJB/HelloWorldEjbImpl!com.bitcero.beans.HelloWorldEjbRemote");

      int result = helloWorldEJB.add(2, 2);

      System.out.println("Result: " + result);

    } catch (NamingException e) {
      e.printStackTrace(System.out);
    }
  }
}
