package com.mazdak;


class Movie {
  private String name;

  public Movie(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String plot() {
    return "NO plot here";
  }
}


class Jaws extends Movie {

  public Jaws() {
    super("Jaws");
  }

  public String plot() {
    return "A Shart eats lots of people";
  }
}


class IndependenceDay extends Movie {

  public IndependenceDay() {
    super("Independence day");
  }

  @Override
  public String plot() {
    return "Aliens attempt to take over planet earth";
  }
}


class MazeRunner extends Movie {
  public MazeRunner() {
    super("Maze Runner");
  }

  @Override
  public String plot() {
    return "kids try and escape a maze.";
  }
}

class StarWars extends Movie {
  public StarWars() {
    super("Star Wars");
  }

  @Override
  public String plot() {
    return "imperial forces try to take over the universe";
  }
}

class Forgetable extends Movie {
  public Forgetable() {
    super("forgatable");
  }
  // not method;
}


public class Main {

  public static void main(String[] args) {
    // mechanism allow actions to act differently based on object
    for (int i = 1; i < 11 ; i++) {
      Movie movie = randomMovie();
      System.out.println("Movie # " + i + " : " + movie.getName() + "\n" +
              "Plot" + movie.plot() + "\n");
    }
  }

  public static Movie randomMovie() {
    int randomNum = (int) (Math.random() * 5) + 1;
    System.out.println("Random Number generrated " + randomNum );

    switch (randomNum) {
      case 1:
        return new Jaws();
      case 2:
        return new IndependenceDay();
      case 3:
        return new MazeRunner();
      case 4:
        return new StarWars();
      case 5:
        return new Forgetable();
    }
    return null;
  }

}
