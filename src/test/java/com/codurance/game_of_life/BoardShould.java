package com.codurance.game_of_life;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardShould {
  @Test
  void store_a_collection_of_cells_on_initialisation() {
    Cell cell = new Cell(true);
    Board board = new Board(cell);
    List<Cell> cells = board.getCells();

    assertEquals(1, cells.size());
  }
}