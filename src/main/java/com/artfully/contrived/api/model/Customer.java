package com.artfully.contrived.api.model;

import org.springframework.stereotype.Repository;

@Repository
public class Customer {

  private String firstName;
  private String LastName;
  private String address;

  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @return the lastName
   */
  public String getLastName() {
    return LastName;
  }

  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    LastName = lastName;
  }

  /**
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
  }

}
