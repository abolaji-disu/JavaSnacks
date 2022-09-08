package WeekendSnack;

import java.util.Arrays;

public class PrintTicTacToeSketchPad {

    private static final String[][] ticTacToeBoard = new String[3][3];

    public static void fillBoardRowOne(){
        ticTacToeBoard[0][0] = "x |";
        ticTacToeBoard[0][1] = " o ";
        ticTacToeBoard[0][2] = "| x";
    }

    public static void fillBoardRowTwo(){
        ticTacToeBoard[1][0] = "o |";
        ticTacToeBoard[1][1] = " x |";
        ticTacToeBoard[1][2] = " o";
    }

    public static void fillBoardRowThree(){
        ticTacToeBoard[2][0] = "x |";
        ticTacToeBoard[2][1] = " x |";
        ticTacToeBoard[2][2] = " o";
    }

    public static void displayBoard(){
        for (int row = 0; row < ticTacToeBoard.length; row++) {
            for(int col = 0; col < ticTacToeBoard[row].length; col++){
                System.out.print(ticTacToeBoard[row][col]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        fillBoardRowOne();
        fillBoardRowTwo();
        fillBoardRowThree();
        displayBoard();
    }
}
