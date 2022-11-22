package com.bitcero.sga.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.bitcero.sga.dao.PersonDao;
import com.bitcero.sga.domain.Person;

@Stateless
public class PersonServiceImpl implements PersonServiceRemote, PersonServiceLocal{

  @Inject
  private PersonDao personDao;

  @Override
  public List<Person> listAllPerson() {
    return personDao.findAllPersons();
  }

  @Override
  public Person findPersonById(Person person) {
    return personDao.findPersonById(person);
  }

  @Override
  public Person findPersonByEmail(Person person) {
    return personDao.findPersonByEmail(person);
  }

  @Override
  public void addPerson(Person person) {
    personDao.addPerson(person);

  }

  @Override
  public void updatePerson(Person person) {
    personDao.updatePerson(person);
  }

  @Override
  public void deletePerson(Person person) {
    personDao.delete(person);
  }
}
