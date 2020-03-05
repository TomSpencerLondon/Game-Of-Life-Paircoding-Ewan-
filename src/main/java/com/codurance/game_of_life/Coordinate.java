package com.codurance.game_of_life;

public class Coordinate {
  private int x;
  private int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public boolean isNextTo(Coordinate other) {
    if (this.equals(other)) return false;

    return (Math.abs(x - other.x) <= 1 &&
            Math.abs(y - other.y) <= 1);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Coordinate that = (Coordinate) o;
    return x == that.x &&
            y == that.y;
  }
}
