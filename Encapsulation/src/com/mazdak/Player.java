package com.mazdak;

public class Player {
  // can change name to fullName like bad practice
  public String name;
  public int health;
  public String weapon;

  public void loseHealth(int damage) {
    this.health = this.health - damage;
    if (this.health <= 0) {
      System.out.println("player knocked Out");

    }
  }

  public int healthRemain() {
    return this.health;
  }
}
