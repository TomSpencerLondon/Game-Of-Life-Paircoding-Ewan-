package com.codurance.game_of_life;

public class Coordinate {
  private int x;
  private int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public boolean isNextTo(Coordinate comparisonCoordinate) {
    return (Math.abs(x - comparisonCoordinate.getX()) == 1 ||
            Math.abs(y - comparisonCoordinate.getY()) == 1);
  }
}
