package com.mazdak;

public class Main {

    public static void main(String[] args) {
      // oop is from state and behavior
      // class blue print for making obj
      // encapsulation not allow people mutate obj
      Car porsche = new Car();
      Car holden = new Car();
      porsche.setModel("careera");
//      System.out.println("model is " + porsche.getModel());
      porsche.setModel("911");

      Bank roberto = new Bank(1243,200,
              "maz","fdf@email.com",0124543453);

//      roberto.setCustomerName("roberto");
//      roberto.setBalance(255.5);
//      roberto.setEmail("roberto@email.com");
//      roberto.setNumber(988929492);
      roberto.deposite(200);
//      System.out.println(roberto.getBalance());
      roberto.withdraw(400);
//      System.out.println(roberto.getBalance());
      roberto.withdraw(333);
      System.out.println(roberto.getBalance());

      VipCustomer person3 = new VipCustomer();


    }
}
