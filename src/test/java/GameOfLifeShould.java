import Board.Board;
import GameOfLife.GameOfLife;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameOfLifeShould {
  @Test
  public void live_cell_with_zero_live_neighbours_dies() {

    int[][] array = {{0, 0, 0},{0, 1, 0},{0, 0, 0}};
    Board start = new Board(array);

    GameOfLife gameOfLife = new GameOfLife(start);

    assertEquals(0, gameOfLife.nextGen().getBoard()[1][1]);
  }

  @Test
  public void live_cell_with_one_live_neighbours_dies() {

    int[][] array = {{0, 0, 0},{0, 1, 1},{0, 0, 0}};
    Board start = new Board(array);

    GameOfLife gameOfLife = new GameOfLife(start);

    assertEquals(0, gameOfLife.nextGen().getBoard()[1][1]);
  }

  @Test
  public void live_cell_with_two_live_neighbours_stays_alive() {


    int[][] array = {{0, 0, 0},{1, 1, 1},{0, 0, 0}};
    Board start = new Board(array);

    GameOfLife gameOfLife = new GameOfLife(start);

    assertEquals(1, gameOfLife.nextGen().getBoard()[1][1]);
  }

  @Test
  public void live_cell_with_three_live_neighbours_stays_alive() {


    int[][] array = {{0, 1, 0},{1, 1, 1},{0, 0, 0}};
    Board start = new Board(array);

    GameOfLife gameOfLife = new GameOfLife(start);

    assertEquals(1, gameOfLife.nextGen().getBoard()[1][1]);
  }

  @Test
  public void live_cell_with_more_than_three_live_neighbours_dies() {

    int[][] array = {{0, 1, 0},{1, 1, 1},{0, 1, 0}};
    Board start = new Board(array);

    GameOfLife gameOfLife = new GameOfLife(start);

    assertEquals(0, gameOfLife.nextGen().getBoard()[1][1]);
  }

  @Test
  public void dead_cell_with_exactly_three_live_neighbours_lives() {

    int[][] array = {{0, 1, 0},{1, 0, 1},{0, 0, 0}};
    Board start = new Board(array);

    GameOfLife gameOfLife = new GameOfLife(start);

    assertEquals(1, gameOfLife.nextGen().getBoard()[1][1]);
  }

  @Test
  public void dead_cell_with_exactly_three_diagonal_live_neighbours_lives() {

    int[][] array = {{1, 0, 1},{0, 0, 0},{1, 0, 0}};
    Board start = new Board(array);

    GameOfLife gameOfLife = new GameOfLife(start);

    assertEquals(1, gameOfLife.nextGen().getBoard()[1][1]);
  }
}
