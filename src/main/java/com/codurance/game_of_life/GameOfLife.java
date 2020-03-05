package com.codurance.game_of_life;

public class GameOfLife {

  private Board board;

  public GameOfLife(Board board) {
    this.board = board;
  }

  public Board nextGen() {
    int[][] nextGenArray = nextArray();
    return board = new Board(nextGenArray);

//    return board = nextBoard();
  }

//  private Board nextBoard() {
//    Board nextBoard = board.createClone();
//    return nextBoard.
//    int nextCellState = nextBoard.getCellState(1,1) == 1 ? tickLivingCell(livingNeighbours) : tickDeadCell(livingNeighbours);
//    nextCellState == 1 ? nextBoard.cellAlive(1,1) : nextBoard.cellDead(1,1);
//  }

  private int[][] nextArray(){
    int[][] nextArray = board.getBoard();
    int livingNeighbours = getNeighbours(1, 1);

    nextArray[1][1] = board.getCellState(1,1) == 1 ? tickLivingCell(livingNeighbours) : tickDeadCell(livingNeighbours);

    return nextArray;
  }

  private int tickDeadCell(int livingNeighbours) {
    return livingNeighbours == 3 ? 1 : 0;
  }

  private int tickLivingCell(int livingNeighbours) {
    return livingNeighbours >= 2 && livingNeighbours <= 3 ? 1 : 0;
  }

  private int getNeighbours(int x, int y) {
    int neighbours = 0;
    for (int i = x - 1; i <= x + 1; i++) {
      for (int j = y - 1; j <= y + 1; j++) {
        if (i == x && j == y){
          continue;
        }
        neighbours += board.getCellState(i, j);
      }
    }
    return neighbours;
  }
}

