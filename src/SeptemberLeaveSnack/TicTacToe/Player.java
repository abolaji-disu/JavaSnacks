package SeptemberLeaveSnack.TicTacToe;

import SeptemberLeaveSnack.TicTacToe.ErrorModule.IllegalEntryException;
import SeptemberLeaveSnack.TicTacToe.ErrorModule.IllegalValueException;

import static SeptemberLeaveSnack.TicTacToe.GameBoard.board;

public class Player {
//    private final GameBoard gameBoard = new GameBoard();
    TicTacToeReferee refree = new TicTacToeReferee();

    private int stateCounter = 1;
    GameBoard gameBoard = new GameBoard();
    PlayerMark[][] board = gameBoard.getBoard();
    private PlayerMark gameState;
    private int playerCellState;

    public void setPlayerPosition(int cellNumber) {
        playerCellState = cellNumber;
        validatePositionEntry();
        validatePlayerForDoubleEntry(gameBoard);
        stateCounter++;
        fillEntry(cellNumber, gameBoard);
    }


    private PlayerMark playerOneMark() {
        return PlayerMark.X;
    }

    private PlayerMark playerTwoMark() {
        return PlayerMark.O;
    }

    private PlayerMark choosePlayerMark() {
        if (gameState == playerOneMark()) {
            gameState = playerTwoMark();
            return gameState;
        }
        if (gameState == null || gameState == playerTwoMark()) {
            gameState = playerOneMark();
            return gameState;
        }

        return null;
    }

    private void fillEntry(int cellNumber, GameBoard gameBoard) {
        var board = gameBoard.getBoard();
//        cellNumber++;
        switch (cellNumber) {
            case 1 -> board[0][0] = choosePlayerMark();
            case 2 -> board[0][1] = choosePlayerMark();
            case 3 -> board[0][2] = choosePlayerMark();

            case 4 -> board[1][0] = choosePlayerMark();
            case 5 -> board[1][1] = choosePlayerMark();
            case 6 -> board[1][2] = choosePlayerMark();

            case 7 -> board[2][0] = choosePlayerMark();
            case 8 -> board[2][1] = choosePlayerMark();
            case 9 -> board[2][2] = choosePlayerMark();
        }

    }

    public PlayerMark getPlayerState() {
        return gameState;
    }

    private void validatePositionEntry() {
        if (playerCellState > 9 || playerCellState < 1)
            throw new IllegalValueException("Cell Position Should be Between 1 and 9 ");
    }


    private void validatePlayerForDoubleEntry(GameBoard gameBoard) {
        int row = 0, col = 0;

        if (playerCellState >= 1 && playerCellState <= 3) col = playerCellState - 1;

        if (playerCellState > 3 && playerCellState <= 6) {
            row = 1;
            col = playerCellState - 4;
        }
        if (playerCellState > 6 && playerCellState <= 9) {
            row = 2;
            col = playerCellState - 7;
        }

        var board = gameBoard.getBoard();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[row][col] != PlayerMark.E)
                    throw new IllegalEntryException("Game Cell Has Been Filled!");
            }
        }
    }

    public void checkPlayerTurns(int cellNumber) {
        if (stateCounter % 2 == 0) System.out.println("Player One Playing");
        if (stateCounter % 2 == 1) System.out.println("Player two Playing");
        setPlayerPosition(cellNumber);
    }

    public boolean checkWinner() {
        if (refree.checkWinInFirstRow()) return true;
        if (refree.checkWinInSecondRow()) return true;
        if (refree.checkWinInThirdRow()) return true;

        if (refree.checkWinInFirstColumn())return true;
        if (refree.checkWinInSecondColumn()) return true;
        if (refree.checkWinInThirdColum()) return true;

        if (refree.checkWinInFirstDiagonal()) return true;
        return refree.checkWinInSecondDiagonal();
    }

    public boolean isATie(){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == PlayerMark.E ) {
//                    System.out.println("Game is a tie");
                    return true;
                }
            }
        }
        return false;
    }


    public boolean checkTie(){
        return !checkWinner() && !isATie();
    }
//    public boolean checkTie(){
//        return !checkWinner() || refree.checkTie();
//    }




}


//    public boolean checkWinInFirstRow() {
//        PlayerMark[] rowOneCheck = {board[0][0], board[0][1], board[0][2]};
//        int countX = 0, countO = 0;
//        for (PlayerMark playerMark : rowOneCheck) {
//            if (playerMark == PlayerMark.O) countO++;
//            if (playerMark == PlayerMark.X) countX++;
//        }
//        if (countX == 3) System.out.print("Player X  Wins");
//        if (countO == 3) System.out.print("Player O  Wins");
//        return countO == 3 || countX == 3;
//    }
//}
//
//// check winner loop method...will be done later...
////    public boolean checkWinner(GameBoard gameBoard) {
////        var board = gameBoard.getBoard();
////        int[][] winningCell = { {0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};
////
////        int countX = 0;
////        int countY = 0;
////
////        for(int a = 0; a <= 2; a++) {
////            for (int i = 0; i <= a; ) {
////                for (int j = 0; j < board[i].length; j++) {
////                    if (board[i][j] == PlayerMark.X) countX++;
////                    if (board[i][j] == PlayerMark.O) countY++;
////                    if (countX == 3 || countY == 3) return true;
////                    i++;
////                }
////            }
////        }
////        return false;
//
////    }


