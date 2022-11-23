package com.bitcero.sga.service;

import java.util.List;

import javax.ejb.Local;

import com.bitcero.sga.domain.User;

@Local
public interface UserService {
  public List<User> listAllUsers();
  public User findUserById(User user);
  public void addUser(User user);
  public void updateUser(User user);
  public void deleteUser(User user);
}
