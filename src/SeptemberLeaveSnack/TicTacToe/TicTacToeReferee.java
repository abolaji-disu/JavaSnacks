package SeptemberLeaveSnack.TicTacToe;

import static SeptemberLeaveSnack.TicTacToe.GameBoard.board;

public class TicTacToeReferee {
    public boolean checkWinInFirstRow() {
        boolean firstRowO = board[0][0] == PlayerMark.O && board[0][1] == PlayerMark.O && board[0][2] == PlayerMark.O;
        boolean firstRowX = board[0][0] == PlayerMark.X && board[0][1] == PlayerMark.X && board[0][2] == PlayerMark.X;
        if (firstRowX) System.out.println("Player >>X<< Wins !!!");
        if (firstRowO) System.out.println("Player >>0<< Wins !!!");
        return firstRowX || firstRowO;
    }

    public boolean checkWinInSecondRow() {
        boolean firstRowO = board[1][0] == PlayerMark.O && board[1][1] == PlayerMark.O && board[1][2] == PlayerMark.O;
        boolean firstRowX = board[1][0] == PlayerMark.X && board[1][1] == PlayerMark.X && board[1][2] == PlayerMark.X;
        if (firstRowX) System.out.println("Player >>X<< Wins !!!");
        if (firstRowO) System.out.println("Player >>0<< Wins !!!");
        return firstRowX || firstRowO;
    }

    public boolean checkWinInThirdRow() {
        boolean firstRowO = board[2][0] == PlayerMark.O && board[2][1] == PlayerMark.O && board[2][2] == PlayerMark.O;
        boolean firstRowX = board[2][0] == PlayerMark.X && board[2][1] == PlayerMark.X && board[2][2] == PlayerMark.X;
        if (firstRowX) System.out.println("Player >>X<< Wins !!!");
        if (firstRowO) System.out.println("Player >>0<< Wins !!!");
        return firstRowX || firstRowO;
    }

    public boolean checkWinInFirstColumn() {
        boolean firstRowO = board[0][0] == PlayerMark.O && board[1][0] == PlayerMark.O && board[2][0] == PlayerMark.O;
        boolean firstRowX = board[0][0] == PlayerMark.X && board[1][0] == PlayerMark.X && board[2][0] == PlayerMark.X;
        if (firstRowX) System.out.println("Player >>X<< Wins !!!");
        if (firstRowO) System.out.println("Player >>0<< Wins !!!");
        return firstRowX || firstRowO;
    }

    public boolean checkWinInSecondColumn() {
        boolean firstRowO = board[0][1] == PlayerMark.O && board[1][1] == PlayerMark.O && board[2][1] == PlayerMark.O;
        boolean firstRowX = board[0][1] == PlayerMark.X && board[1][1] == PlayerMark.X && board[2][1] == PlayerMark.X;
        if (firstRowX) System.out.println("Player >>X<< Wins !!!");
        if (firstRowO) System.out.println("Player >>0<< Wins !!!");

        return firstRowX || firstRowO;
    }

    public boolean checkWinInThirdColum() {
        boolean firstRowO = board[0][2] == PlayerMark.O && board[1][2] == PlayerMark.O && board[2][2] == PlayerMark.O;
        boolean firstRowX = board[0][2] == PlayerMark.X && board[1][2] == PlayerMark.X && board[2][2] == PlayerMark.X;
        if (firstRowX) System.out.println("Player >>X<< Wins !!!");
        if (firstRowO) System.out.println("Player >>0<< Wins !!!");
        return firstRowX || firstRowO;
    }

    public boolean checkWinInFirstDiagonal() {
        boolean firstRowO = board[0][0] == PlayerMark.O && board[1][1] == PlayerMark.O && board[2][2] == PlayerMark.O;
        boolean firstRowX = board[0][0] == PlayerMark.X && board[1][1] == PlayerMark.X && board[2][2] == PlayerMark.X;
        if (firstRowX) System.out.println("Player >>X<< Wins !!!");
        if (firstRowO) System.out.println("Player >>0<< Wins !!!");
        return firstRowX || firstRowO;
    }

    public boolean checkWinInSecondDiagonal() {
        boolean firstRowO = board[0][2] == PlayerMark.O && board[1][1] == PlayerMark.O && board[2][0] == PlayerMark.O;
        boolean firstRowX = board[0][2] == PlayerMark.X && board[1][1] == PlayerMark.X && board[2][0] == PlayerMark.X;
        if (firstRowX) System.out.println("Player >>X<< Wins !!!");
        if (firstRowO) System.out.println("Player >>0<< Wins !!!");
        return firstRowX || firstRowO;
    }

    public boolean checkTie(){
        boolean row = (checkWinInFirstRow() && checkWinInSecondRow() && checkWinInThirdColum());
        boolean col = checkWinInFirstColumn() && checkWinInSecondColumn() && checkWinInThirdColum();
        boolean diagonal = checkWinInFirstDiagonal() && checkWinInSecondDiagonal();
        boolean isWinner = !(row && col && diagonal);

        if (isWinner && !checkEmptyCell()){
            System.out.println("Game is a tie");
            return true;
        }
        return false;
    }

    private boolean checkEmptyCell(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == PlayerMark.E){
                    return true;
                }
            }
        }
        return false;
    }

}
