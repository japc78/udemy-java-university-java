package com.bitcero.beans;

import javax.ejb.Remote;

@Remote
public interface HelloWorldEjbRemote {
  public int add(int a, int b);
}
