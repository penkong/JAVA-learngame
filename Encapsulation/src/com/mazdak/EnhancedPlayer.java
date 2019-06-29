package com.mazdak;

public class EnhancedPlayer {
  private String name;
  private int healthed = 100;
  private String weapon;

  public EnhancedPlayer(String name, int healthed, String weapon) {
    this.name = name;
    if(healthed > 0 && healthed <= 100){
      this.healthed = healthed;
    }
    this.weapon = weapon;
  }

  public void loseHealth(int damage) {
    this.healthed = this.healthed - damage;
    if (this.healthed <= 0) {
      System.out.println("player knocked Out");

    }
  }

  public String getName() {
    return name;
  }

  public int getHealthed() {
    return healthed;
  }

  public String getWeapon() {
    return weapon;
  }
}
