package com.codurance.game_of_life;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellShould {
  @Test
  void is_alive() {
    Cell cell = new Cell(true, 1, 1);

    assertEquals(true, cell.isAlive());
  }

  @Test
  void is_dead() {
    Cell cell = new Cell(false, 1, 1);

    assertEquals(false, cell.isAlive());
  }

  @Test
  void next_generation_alive_less_than_2_dies() {
    Cell cell = new Cell(true, 1, 1);

    cell.nextGeneration(1);
    assertEquals(false, cell.isAlive());
  }

  @Test
  void next_generation_alive_more_than_3_dies() {
    Cell cell = new Cell(true, 1, 1);

    cell.nextGeneration(4);
    assertEquals(false, cell.isAlive());
  }

  @Test
  void next_generation_dead_exactly_3_lives() {
    Cell cell = new Cell(false, 1, 1);

    cell.nextGeneration(3);
    assertEquals(true, cell.isAlive());
  }

  @Test
  void cell_should_say_whether_another_cell_is_neighbour() {
    Cell cell = new Cell(false, 0, 0);
    Cell neighbour = new Cell(false, 0, 1);

    assertEquals(true, cell.isNeighbour(neighbour));
  }
}
