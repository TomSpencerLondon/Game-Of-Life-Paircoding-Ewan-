package com.codurance.game_of_life;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardShould {
  @Test
  void store_a_collection_of_cells_on_initialisation() {
    Cell cell = new Cell(true);
    Board board = new Board(cell);

    assertEquals(cell, board.getCells().get(0));
  }
}