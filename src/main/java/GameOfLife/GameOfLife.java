package GameOfLife;

import Board.Board;

public class GameOfLife {

  private Board board;

  public Board nextGen(Board board) {
    this.board = board;

    int[][] nextGenArray = nextArray(board);
    return new Board(nextGenArray);
  }

  private int[][] nextArray(Board board){
    int livingNeighbours = getNeighbours(1, 1);
    int[][] nextArray = board.getBoard();

    if (livingNeighbours < 2) {
      nextArray[1][1] = 0;
    }
    return nextArray;
  }

  private int getNeighbours(int x, int y) {
    return board.getBoard()[x][y - 1] + board.getBoard()[x][y + 1];
  }
}
