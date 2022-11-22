package com.bitcero.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bitcero.domain.Person;

public class ClientEntityPerson {
  static Logger log = LogManager.getFormatterLogger();

  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonPU");

    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();

    tx.begin();

    Person p = new Person("User5", "test5", "user5@test.com", "555777999");
    log.debug("Object to persist" + p);

    em.persist(p);

    tx.commit();
    log.debug("Objet persisted" +  p);

    em.close();

  }
}
