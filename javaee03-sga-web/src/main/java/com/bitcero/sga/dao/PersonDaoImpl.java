package com.bitcero.sga.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import com.bitcero.sga.domain.Person;

@Stateless
public class PersonDaoImpl implements PersonDao{

  @PersistenceContext(unitName = "PersonPU")
  EntityManager em;

  @Override
  public List<Person> findAllPersons() {
    return em.createNamedQuery("Person.findAll").getResultList();
  }

  @Override
  public Person findPersonById(Person person) {
    return em.find(Person.class, person.getId());
  }

  @Override
  public Person findPersonByEmail(Person person) {
    Query query = em.createQuery("from Person p where p.email =: email");
    query.setParameter("email", person.getEmail());
    return (Person) query.getSingleResult();
  }

  @Override
  public void addPerson(Person person) {
    em.persist(person);
  }

  @Override
  public void updatePerson(Person person) {
    em.merge(person);
  }

  @Override
  public void delete(Person person) {
    em.remove(em.merge(person));
  }
}
