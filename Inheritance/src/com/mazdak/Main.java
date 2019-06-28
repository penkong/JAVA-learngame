package com.mazdak;

public class Main {

  public static void main(String[] args) {

    Animal animal = new Animal("animal", 1, 1, 3, 15);
    Dog dog = new Dog("yogi", 8, 20, 2, 4, 1, 34, "hap");
    dog.eat();
    dog.walk();
    dog.run();
  }
}
