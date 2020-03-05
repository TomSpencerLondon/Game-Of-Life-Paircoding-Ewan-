package Board;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Board {
  private final int[][] board;

  public Board(int[][] array){
    this.board = array;
  }

  public int[][] getBoard() {
    return board;
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
