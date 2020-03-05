package com.codurance.game_of_life;

import java.util.List;

public class Board {

  private List<Cell> cells;

  public Board(Cell ...cells) {
    this.cells = List.of(cells);
  }

  public List<Cell> getCells() {
    return cells;
  }

  public Board nextGeneration() {
    cells.get(0).nextGeneration(neighbourCount());
    return this;
  }

  private int neighbourCount() {
    return cells.size() - 1;
  }
}
