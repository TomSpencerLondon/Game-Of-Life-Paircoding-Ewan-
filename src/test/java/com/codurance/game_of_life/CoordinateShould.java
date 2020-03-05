package com.codurance.game_of_life;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoordinateShould {
  @Test
  void return_true_if_next_to_other_coordinate() {
    Coordinate coordinate = new Coordinate(1, 1);
    Coordinate coordinate1 = new Coordinate(1, 2);

    assertTrue(coordinate.isNextTo(coordinate1));
  }

  @Test
  void return_false_if_not_next_to_other_coordinate() {
    Coordinate coordinate = new Coordinate(1, 1);
    Coordinate coordinate1 = new Coordinate(1, 3);

    assertFalse(coordinate.isNextTo(coordinate1));
  }

  @Test
  void return_false_if_same_coordinate() {
    Coordinate coordinate = new Coordinate(1, 1);
    Coordinate coordinate1 = new Coordinate(1, 1);

    assertFalse(coordinate.isNextTo(coordinate1));
  }

  @Test
  void return_true_if_coordinate_diagonally_adjacent() {
    Coordinate coordinate = new Coordinate(1, 1);
    Coordinate coordinate1 = new Coordinate(2, 2);

    assertFalse(coordinate.isNextTo(coordinate1));
  }
}
