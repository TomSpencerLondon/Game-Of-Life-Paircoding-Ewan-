package com.codurance.game_of_life;

import java.util.List;

public class Board {

  private List cells;

  public Board(Cell cell) {
    this.cells = List.of(cell);
  }

  public List<Object> getCells() {
    return cells;
  }
}
