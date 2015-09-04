package com.artfully.contrived.api.model;

import org.springframework.stereotype.Repository;

@Repository
public class BankAccount {

  private long amount;
  private String currency;
  private Customer customer;

  /**
   * @return the amount
   */
  public long getAmount() {
    return amount;
  }

  /**
   * @param amount the amount to set
   */
  public void setAmount(long amount) {
    this.amount = amount;
  }

  /**
   * @return the currency
   */
  public String getCurrency() {
    return currency;
  }

  /**
   * @param currency the currency to set
   */
  public void setCurrency(String currency) {
    this.currency = currency;
  }

  /**
   * @return the customer
   */
  public Customer getCustomer() {
    return customer;
  }

  /**
   * @param customer the customer to set
   */
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

}
