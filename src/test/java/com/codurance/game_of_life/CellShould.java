package com.codurance.game_of_life;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellShould {
  private Coordinate coordinate;

  @BeforeEach
  void setUp() {
    coordinate = new Coordinate(1, 1);
  }

  @Test
  void is_alive() {
    Cell cell = new Cell(true, coordinate);

    assertEquals(true, cell.isAlive());
  }

  @Test
  void is_dead() {
    Cell cell = new Cell(false, coordinate);

    assertEquals(false, cell.isAlive());
  }

  @Test
  void next_generation_alive_less_than_2_dies() {
    Cell cell = new Cell(true, coordinate);

    cell.nextGeneration(1);
    assertEquals(false, cell.isAlive());
  }

  @Test
  void next_generation_alive_more_than_3_dies() {
    Cell cell = new Cell(true, coordinate);

    cell.nextGeneration(4);
    assertEquals(false, cell.isAlive());
  }

  @Test
  void next_generation_dead_exactly_3_lives() {
    Cell cell = new Cell(false, coordinate);

    cell.nextGeneration(3);
    assertEquals(true, cell.isAlive());
  }

  @Test
  void cell_should_say_whether_another_cell_is_neighbour() {
    Coordinate coordinate2 = new Coordinate(1,2);
    Cell cell = new Cell(false, coordinate);
    Cell neighbour = new Cell(false, coordinate2);

    assertEquals(true, cell.isNeighbour(neighbour));
  }

  @Test
  void cell_should_return_position() {
    Cell cell = new Cell(false, coordinate);
    Cell neighbour = new Cell(false, coordinate);

    assertEquals(coordinate, cell.getCoordinate());
  }
}
