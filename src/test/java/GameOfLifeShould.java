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

    GameOfLife gameOfLife = new GameOfLife();

    assertEquals(0, gameOfLife.nextGen(start).getBoard()[1][1]);
  }

  @Test
  public void live_cell_with_one_live_neighbours_dies() {

    int[][] array = {{0, 0, 0},{0, 1, 1},{0, 0, 0}};
    Board start = new Board(array);

    GameOfLife gameOfLife = new GameOfLife();

    assertEquals(0, gameOfLife.nextGen(start).getBoard()[1][1]);
  }

  @Test
  public void live_cell_with_two_live_neighbours_stays_alive() {


    int[][] array = {{0, 0, 0},{1, 1, 1},{0, 0, 0}};
    Board start = new Board(array);

    GameOfLife gameOfLife = new GameOfLife();

    assertEquals(1, gameOfLife.nextGen(start).getBoard()[1][1]);
  }

  @Test
  public void live_cell_with_three_live_neighbours_stays_alive() {


    int[][] array = {{0, 1, 0},{1, 1, 1},{0, 0, 0}};
    Board start = new Board(array);

    GameOfLife gameOfLife = new GameOfLife();

    assertEquals(1, gameOfLife.nextGen(start).getBoard()[1][1]);
  }
}
