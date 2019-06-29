package com.mazdak;

public class Car extends Vehicle{
  private int doors;
  private int engineCapacity;

  public Car(String name, int doors, int engineCapacity) {
    super(name);
    this.doors = doors;
    this.engineCapacity = engineCapacity;
  }
  // car is vehicle is inheritance
  // Composition means it Has RelationSHip
  // modeling parts of obj
}
