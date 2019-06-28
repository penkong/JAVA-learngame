package com.mazdak;

public class Dog extends Animal {

  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;


  public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
    super(name, 1, 1, size, weight);
    this.eyes = eyes;
    this.legs = legs;
    this.tail = tail;
    this.teeth = teeth;
    this.coat = coat;
  }

  @Override
  public void eat() {
    System.out.println("dog.eat()");
    chew();
    super.eat();
  }

  private void chew(){
    System.out.println("dog.chew()");

  }
  public void walk(){
    System.out.println("dog.walk()");
    move(5);
  }

  private void moveLegs(int speed){

  }

  public void run(){
    System.out.println("dog.run()");
    move(12);
  }

}
