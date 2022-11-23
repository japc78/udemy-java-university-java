package com.bitcero.sga.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQueries({
  @NamedQuery(name="Person.findAll", query="SELECT p FROM Person p ORDER BY p.id")
})
@Table(name="person")
public class Person implements Serializable {

  private static final long serialVersionUID = -8923404059714150531L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  private String name;
  private String surname;
  private String email;
  @Column(name = "phone_number")
  private String phoneNUmber;

  @OneToMany(mappedBy = "person")
  private List<User> userList;


  public Person() {
  }

  public Person( String name, String surname, String email, String phoneNUmber) {
    this.name = name;
    this.surname = surname;
    this.email = email;
    this.phoneNUmber = phoneNUmber;
  }

  /**
   * @return the serialversionuid
   */
  public static long getSerialversionuid() {
    return serialVersionUID;
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
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the surname
   */
  public String getSurname() {
    return surname;
  }

  /**
   * @param surname the surname to set
   */
  public void setSurname(String surname) {
    this.surname = surname;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the phoneNUmber
   */
  public String getPhoneNUmber() {
    return phoneNUmber;
  }

  /**
   * @param phoneNUmber the phoneNUmber to set
   */
  public void setPhoneNUmber(String phoneNUmber) {
    this.phoneNUmber = phoneNUmber;
  }

  /**
   * @return the userList
   */
  public List<User> getUserList() {
    return userList;
  }

  /**
   * @param userList the userList to set
   */
  public void setUserList(List<User> userList) {
    this.userList = userList;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */

  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + ", phoneNUmber="
        + phoneNUmber + "]";
  }

  /* (non-Javadoc)
   * @see java.lang.Object#hashCode()
   */

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((email == null) ? 0 : email.hashCode());
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
    Person other = (Person) obj;
    if (id != other.id)
      return false;
    if (email == null) {
      if (other.email != null)
        return false;
    } else if (!email.equals(other.email))
      return false;
    return true;
  }


}
