package com.codurance.game_of_life;

public class Board {

  private final int[][] cells;

  public Board() {
    this.cells = new int[][]{{},{},{}};
  }

  public int[][] cells() {
    return cells;
  }
}
