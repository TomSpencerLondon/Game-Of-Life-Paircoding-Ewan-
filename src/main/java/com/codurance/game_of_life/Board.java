package com.codurance.game_of_life;

import java.util.List;

public class Board {

  private List cells;

  public Board(Cell ...cells) {
    this.cells = List.of(cells);
  }

  public List<Cell> getCells() {
    return cells;
  }
}
