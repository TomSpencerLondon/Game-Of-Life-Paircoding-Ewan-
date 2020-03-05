package com.codurance.game_of_life;

public class Cell {

  private boolean alive;

  public Cell(boolean alive) {
    this.alive = alive;
  }

  public Cell(boolean b, int i, int i1) {

  }

  public boolean isAlive() {
    return alive;
  }

  public void nextGeneration(int neighbours) {

    if (neighbours < 2 || neighbours > 3){
      alive = false;
    }

    if (neighbours == 3 && isAlive() == false){
      alive = true;
    }

  }

  public boolean isNeighbour(Cell neighbour) {
    throw new UnsupportedOperationException();
  }
}
