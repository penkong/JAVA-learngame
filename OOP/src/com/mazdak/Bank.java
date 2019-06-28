package com.mazdak;

public class Bank {

  private int number;
  private double balance;
  private String customerName;
  private String email;
  private int phoneNumber;

  // make constructor
  public Bank(){
    // empty values means call constructor with default vals
    // call another constructor
    this(444,10.0, "default Nam","defaut add", 014444);
    System.out.println("from first constructor");
  }

  public Bank(int number, double balance, String customerName, String email, int phoneNumber) {
    // we can have multi constructor
    // with constructor init we dont need setter any more
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public Bank(String customerName, String email, int phoneNumber) {
    // make 2 inputs default
    this(444,10.0, customerName, email, phoneNumber);
  }

  //  public void setNumber(int number){
//    this.number = number;
//  }
//  public int getNumber(){
//    return this.number;
//  }

//
//  public void setBalance(double balance){
//    this.balance = balance;
//  }
  public double getBalance(){
    return  this.balance;
  }
  public double deposite(double balance){
    this.balance += balance;
    return getBalance();
  }
  public double withdraw(double balance){
    if(balance <= this.balance) {
      this.balance -= balance;
    } else {
      System.out.println("insufficient balance");
    }
    return getBalance();
  }
//
//  public void setCustomerName(String customerName){
//    this.customerName = customerName;
//  }
//  public String getCustomerName(){
//    return  this.customerName;
//  }
//
//
//  public void setEmail(String email){
//    this.email = email;
//  }
//  public String getEmail(){
//    return this.email;
//  }
//
//
//  public void setPhoneNumber(int phoneNumber){
//    this.phoneNumber = phoneNumber;
//  }
//  public int getPhoneNumber(){
//    return this.phoneNumber;
//  }


}
