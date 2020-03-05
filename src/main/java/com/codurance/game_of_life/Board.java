package com.codurance.game_of_life;

public class Board {

  private final int[][] cells;

  public Board() {
    this.cells = new int[][]{{},{},{}};
  }

  public int[][] cells() {
    return cells;
  }

  public Object getCell(int i, int i1) {
    throw new UnsupportedOperationException();
  }

  public void addCell(Cell cell) {
    throw new UnsupportedOperationException();
  }
}
