package com.mazdak;

public class Monitor {

  private String model;
  private String manufacturer;
  private int size;
  // Resolution is going to be a class
  // this is composition monitor isn't resolution but it has resolution
  private Resolution nativeResolution;

  public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.size = size;
    this.nativeResolution = nativeResolution;
  }

  public void drawPixelAt(int x, int y, String color) {
    System.out.println("drawing pixel at " + x + "," + y + " in color" + color);

  }

  public String getModel() {
    return model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public int getSize() {
    return size;
  }

  public Resolution getNativeResolution() {
    return nativeResolution;
  }
}
