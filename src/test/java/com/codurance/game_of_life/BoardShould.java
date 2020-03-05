package com.codurance.game_of_life;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardShould {
  @Test
  void have_array_of_empty_cells() {
    Board board = new Board();
    Cell cell = new Cell(true);
    board.addCell(cell);

    assertEquals(cell, board.getCell(1, 1));
  }
}
