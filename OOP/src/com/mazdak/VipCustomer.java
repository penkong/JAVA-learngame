package com.mazdak;

public class VipCustomer {
  private String name;
  private String emailAddress;
  private double creditLimit;

  public VipCustomer(){
    this("default name", "default email", 0.00);
  }

  public VipCustomer(String emailAddress, double creditLimit){
    this("default name", emailAddress, creditLimit);
  }

  public VipCustomer(String name, String emailAddress, double creditLimit) {
    this.name = name;
    this.emailAddress = emailAddress;
    this.creditLimit = creditLimit;
  }

  public String getName() {
    return name;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public double getCreditLimit() {
    return creditLimit;
  }
}
