package com.codurance.game_of_life;

import java.util.HashMap;
import java.util.List;

public class Board {

  private final HashMap<String, Cell> cells;

  public Board(Cell cell) {
    this.cells = new HashMap();
  }

  public Cell getCell(int i, int i1) {
    return cells.get("1:1");
  }

  public void addCell(Cell cell) {
    cells.put("1:1", cell);
  }

  public List<Object> getCells() {
    throw new UnsupportedOperationException();
  }
}
