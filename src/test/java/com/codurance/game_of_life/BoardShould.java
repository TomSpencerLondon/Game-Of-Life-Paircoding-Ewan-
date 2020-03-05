package com.codurance.game_of_life;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardShould {
  @Test
  void store_a_collection_of_cells_on_initialisation() {
    Cell cell = new Cell(true, 1, 1);
    Board board = new Board(cell);
    List<Cell> cells = board.getCells();

    assertEquals(1, cells.size());
  }

  @Test
  void should_contain_a_dead_cell_if_it_has_no_neighbours() {
    Cell cell = new Cell(true, 1, 1);
    Board board = new Board(cell);
    Board nextBoard = board.nextGeneration();
    assertEquals(false, cell.isAlive());
  }
}