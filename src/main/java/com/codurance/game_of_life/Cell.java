package com.codurance.game_of_life;

public class Cell {

  private boolean alive;
  private int x;
  private int y;

  public Cell(boolean alive, int x, int y) {
    this.alive = alive;
    this.x = x;
    this.y = y;
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
    return (Math.abs(x - neighbour.getX()) == 1 ||
            Math.abs(y - neighbour.getY()) == 1);
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}
