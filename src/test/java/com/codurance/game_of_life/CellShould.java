package com.codurance.game_of_life;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellShould {
  private Coordinate coordinate;

  @BeforeEach
  void setUp() {
    coordinate = new Coordinate(1, 1);
  }

  @Test
  void is_alive() {
    Cell cell = new Cell(true, coordinate);

    assertTrue(cell.isAlive());
  }

  @Test
  void is_dead() {
    Cell cell = new Cell(false, coordinate);

    assertFalse(cell.isAlive());
  }

  @Test
  void next_generation_alive_less_than_2_dies() {
    Cell cell = new Cell(true, coordinate);

    cell.tick(1);
    assertFalse(cell.isAlive());
  }

  @Test
  void next_generation_alive_more_than_3_dies() {
    Cell cell = new Cell(true, coordinate);

    cell.tick(4);
    assertFalse(cell.isAlive());
  }

  @Test
  void next_generation_dead_exactly_3_lives() {
    Cell cell = new Cell(false, coordinate);

    cell.tick(3);
    assertTrue(cell.isAlive());
  }

  @Test
  void cell_should_say_whether_another_cell_is_neighbour() {
    Coordinate coordinate2 = new Coordinate(1,2);
    Cell cell = new Cell(false, coordinate);
    Cell neighbour = new Cell(false, coordinate2);

    assertTrue(cell.isNeighbour(neighbour));
  }

  @Test
  void cell_should_return_position() {
    Cell cell = new Cell(false, coordinate);
    Cell neighbour = new Cell(false, coordinate);

    assertEquals(coordinate, cell.getCoordinate());
  }
}
