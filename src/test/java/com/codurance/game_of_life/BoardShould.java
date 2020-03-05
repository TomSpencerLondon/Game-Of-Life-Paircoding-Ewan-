package com.codurance.game_of_life;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardShould {
  @Test
  void have_array_of_empty_cells() {
    Board board = new Board();
    HashMap cells = new HashMap();
    Cell cell = new Cell(true);
    cells.put("1:1", cell);

    assertEquals(cell, board.getCell(1, 1));
  }
}
