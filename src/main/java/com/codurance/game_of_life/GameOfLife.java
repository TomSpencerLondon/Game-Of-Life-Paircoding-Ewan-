package com.codurance.game_of_life;

public class GameOfLife {

  private Board board;

  public GameOfLife(Board board) {
    this.board = board;
  }

  public Board nextGen() {
    return board = board.nextGeneration();
  }
}

