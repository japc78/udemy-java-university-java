package com.bitcero.sga.service;

import java.util.List;

import javax.ejb.Local;

import com.bitcero.sga.domain.Person;
@Local
public interface PersonServiceLocal {
  public List<Person> listAllPerson();
  public Person findPersonById(Person person);
  public Person findPersonByEmail(Person person);
  public void addPerson(Person person);
  public void updatePerson(Person person);
  public void deletePerson(Person person);
}
