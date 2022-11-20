package com.bitcero.beans;

import javax.ejb.Stateless;

@Stateless
public class HelloWorldEjbImpl implements HelloWorldEjbRemote{

  @Override
  public int add(int a, int b) {
    System.out.println("Run add method");
    return a + b;
  }
}
