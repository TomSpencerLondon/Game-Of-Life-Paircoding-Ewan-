package com.codurance.game_of_life;

public class Cell {

  private boolean alive;

  public Cell(boolean alive) {
    this.alive = alive;
  }

  public boolean isAlive() {
    return alive;
  }

  public void nextGeneration(int neighbours) {

    if(neighbours < 2 || neighbours > 3){
      alive = false;
    }
  }
}
