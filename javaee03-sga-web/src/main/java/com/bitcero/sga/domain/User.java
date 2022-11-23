package com.bitcero.sga.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@NamedQueries({
  @NamedQuery(name="User.findAll", query="SELECT u FROM User u ORDER BY u.id")
})
public class User implements Serializable{

  private static final long serialVersionUID = 4210513668545258160L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  private int id_user;
  private String userName;
  private String password;

  @JoinColumn(name = "id_person", referencedColumnName = "id")
  @ManyToOne
  private Person person;

  /**
   *
   */
  public User() {
  }

  /**
   * @param id_user
   * @param userName
   * @param password
   * @param person
   */
  public User(int id_user, String userName, String password, Person person) {
    this.id_user = id_user;
    this.userName = userName;
    this.password = password;
    this.person = person;
  }

  /**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return the id_user
   */
  public int getId_user() {
    return id_user;
  }

  /**
   * @param id_user the id_user to set
   */
  public void setId_user(int id_user) {
    this.id_user = id_user;
  }

  /**
   * @return the userName
   */
  public String getUserName() {
    return userName;
  }

  /**
   * @param userName the userName to set
   */
  public void setUserName(String userName) {
    this.userName = userName;
  }

  /**
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * @param password the password to set
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * @return the person
   */
  public Person getPerson() {
    return person;
  }

  /**
   * @param person the person to set
   */
  public void setPerson(Person person) {
    this.person = person;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */

  @Override
  public String toString() {
    return "User [id=" + id + ", id_user=" + id_user + ", userName=" + userName + ", password=" + password + ", person="
        + person + "]";
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    return result;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#equals(java.lang.Object)
   */

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    User other = (User) obj;
    if (id != other.id)
      return false;
    return true;
  }



}
