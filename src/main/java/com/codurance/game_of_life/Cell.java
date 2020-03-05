package com.codurance.game_of_life;

public class Cell {

  private boolean alive;
  private int x;
  private int y;

  private Coordinate coordinate;

  public Cell(boolean alive, Coordinate coordinate) {
    this.alive = alive;
    this.x = coordinate.getX();
    this.y = coordinate.getY();
    this.coordinate = coordinate;
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

  public Coordinate getCoordinate() {
    return coordinate;
  }
}
