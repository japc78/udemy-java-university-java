package com.bitcero.sga.dao;

import java.util.List;

import com.bitcero.sga.domain.User;

public interface UserDao {
  public List<User> findAllUsers();
  public User findUserById(User user);
  public void addUser(User user);
  public void updateUser(User user);
  public void delete(User user);
}
