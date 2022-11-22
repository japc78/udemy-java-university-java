package com.bitcero.sga.dao;

import java.util.List;

import com.bitcero.sga.domain.Person;

public interface PersonDao {
  public List<Person> findAllPersons();
  public Person findPersonById(Person person);
  public Person findPersonByEmail(Person person);
  public void addPerson(Person person);
  public void updatePerson(Person person);
  public void delete(Person person);
}
