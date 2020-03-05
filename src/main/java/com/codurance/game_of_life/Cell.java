package com.codurance.game_of_life;

public class Cell {

  private boolean alive;
  private Coordinate coordinate;

  public Cell(boolean alive, Coordinate coordinate) {
    this.alive = alive;
    this.coordinate = coordinate;
  }

  public boolean isAlive() {
    return alive;
  }

  public void tick(int neighbours) {
    if (neighbours < 2 || neighbours > 3){
      alive = false;
    }

    if (neighbours == 3 && isAlive() == false){
      alive = true;
    }

  }

  public boolean isNeighbour(Cell neighbour) {
    return coordinate.isNextTo(neighbour.getCoordinate());
  }

  public Coordinate getCoordinate() {
    return coordinate;
  }
}
