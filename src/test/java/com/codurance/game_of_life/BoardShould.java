package com.codurance.game_of_life;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardShould {
  @Test
  void store_a_collection_of_cells_on_initialisation() {
    Cell cell = new Cell(true, 1, 1);
    Board board = new Board(cell);
    List<Cell> cells = board.getCells();

    assertEquals(1, cells.size());
  }

  @Test
  void contain_a_dead_cell_if_it_has_no_neighbours() {
    Cell cell = new Cell(true, 1, 1);
    Board board = new Board(cell);
    Board nextBoard = board.nextGeneration();
    assertEquals(false, cell.isAlive());
  }

  @Test
  void pass_argument_of_2_if_two_neighbours_of_cell() {
    Cell cell1 = mock(Cell.class);
    Cell cell2 = mock(Cell.class);
    Cell cell3 = mock(Cell.class);

    given(cell1.isNeighbour(cell2)).willReturn(true);
    given(cell1.isNeighbour(cell3)).willReturn(true);

    Board board = new Board(cell1, cell2, cell3);
    board.nextGeneration();

    verify(cell1).nextGeneration(2);
  }
}