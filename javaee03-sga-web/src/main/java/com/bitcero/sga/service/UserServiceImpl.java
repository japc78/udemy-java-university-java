package com.bitcero.sga.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.bitcero.sga.dao.UserDao;
import com.bitcero.sga.domain.User;

@Stateless
public class UserServiceImpl implements UserService{
  @Inject
  private UserDao userDao;

  @Override
  public List<User> listAllUsers() {
    return userDao.findAllUsers();
  }

  @Override
  public User findUserById(User user) {
    return userDao.findUserById(user);
  }

  @Override
  public void addUser(User user) {
    userDao.addUser(user);

  }

  @Override
  public void updateUser(User user) {
    userDao.updateUser(user);

  }

  @Override
  public void deleteUser(User user) {
    userDao.delete(user);
  }




}
