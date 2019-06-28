package com.mazdak;

public class Car {
  // member var or fields
  // encapsulation means hide filed and ... to access public
  // these are states
  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String color;

  public void setModel(String model){
    //add validation
    String validModel = model.toLowerCase();
    if (validModel.equals("carrera") || validModel.equals("commodor")) {
      this.model = model;
    } else {
      this.model = "unknown";
    }
  }

  public String  getModel(){
    return this.model;
  }
}
