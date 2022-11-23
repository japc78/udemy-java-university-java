package com.bitcero.sga.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;

import com.bitcero.sga.domain.User;

@Stateless
public class UserDaoImpl implements UserDao {

  @PersistenceContext(unitName = "PersonPU")
  EntityManager em;

  @Override
  public List<User> findAllUsers() {
    return em.createNamedQuery("User.findAll").getResultList();
  }

  @Override
  public User findUserById(User user) {
    return em.find(User.class, user.getId());
  }

  @Override
  public void addUser(User user) {
    em.persist(user);

  }

  @Override
  public void updateUser(User user) {
    em.merge(user);

  }

  @Override
  public void delete(User user) {
    em.remove(em.merge(user));
  }
}
