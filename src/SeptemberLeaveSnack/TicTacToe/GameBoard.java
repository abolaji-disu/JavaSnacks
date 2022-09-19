package SeptemberLeaveSnack.TicTacToe;

import SeptemberLeaveSnack.TicTacToe.ErrorModule.IllegalValueException;

import java.util.InputMismatchException;
import java.util.Objects;

public class GameBoard {
    private PlayerMark playerMark;
    public static PlayerMark[][] board;
    private PlayerMark boardState;
    private static int countCols;

    public GameBoard(){
        board = new PlayerMark[3][3];
        gameBoardDefaultFill();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameBoard gameBoard = (GameBoard) o;
        return playerMark == gameBoard.playerMark;
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerMark);
    }

    public void gameBoardDefaultFill(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = PlayerMark.E;
            }
        }
    }

    public static void displayBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                countCols++;
                System.out.print(" | ");
            }
            System.out.println();
        }
    }


    public PlayerMark[][] getBoard() {
        return board;
    }
}
