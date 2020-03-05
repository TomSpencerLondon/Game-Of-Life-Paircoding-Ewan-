package com.codurance.game_of_life;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Board {
  private final int[][] board;

  public Board(int[][] array){
    this.board = array;
  }

  public int[][] getBoard() {
    return board;
  }

  public int getCellState(int row, int column){
    return board[row][column];
  }

  public Board createClone() {
    return new Board(board);
  }

  public Board nextGeneration() {
    int livingNeighbours = getNeighbours(1, 1);

    board[1][1] = board[1][1] == 1 ? tickLivingCell(livingNeighbours) : tickDeadCell(livingNeighbours);

    return this;
  }

  private int getNeighbours(int x, int y) {
    int neighbours = 0;
    for (int i = x - 1; i <= x + 1; i++) {
      for (int j = y - 1; j <= y + 1; j++) {
        if (i == x && j == y){
          continue;
        }
        neighbours += board[i][j];
      }
    }
    return neighbours;
  }


  private int tickDeadCell(int livingNeighbours) {
    return livingNeighbours == 3 ? 1 : 0;
  }

  private int tickLivingCell(int livingNeighbours) {
    return livingNeighbours >= 2 && livingNeighbours <= 3 ? 1 : 0;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;

    if (o == null || getClass() != o.getClass()) return false;

    Board board1 = (Board) o;

    return new EqualsBuilder()
            .append(board, board1.board)
            .isEquals();
  }
}
