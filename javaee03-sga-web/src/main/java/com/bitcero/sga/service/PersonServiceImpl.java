package com.bitcero.sga.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.bitcero.sga.domain.Person;

@Stateless
public class PersonServiceImpl implements PersonServiceRemote, PersonServiceLocal{

  @Override
  public List<Person> listAllPerson() {
    List<Person> listPerson = new ArrayList<>();
    listPerson.add(new Person(1, "User1", "User1 Surname1", "user1@test.com", "777555999"));
    listPerson.add(new Person(2, "User2", "User2 Surname2", "user2@test.com", "999777333"));
    return listPerson;
  }

  @Override
  public Person findPersonById(Person person) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Person findPersonByEmail(Person person) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void addPerson(Person person) {
    // TODO Auto-generated method stub

  }

  @Override
  public void updatePerson(Person person) {
    // TODO Auto-generated method stub

  }

  @Override
  public void deletePerson(Person person) {
    // TODO Auto-generated method stub
  }
}
