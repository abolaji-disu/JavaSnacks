package SeptemberLeaveSnack.TicTacToe;

import SeptemberLeaveSnack.TicTacToe.ErrorModule.IllegalEntryException;
import SeptemberLeaveSnack.TicTacToe.ErrorModule.IllegalValueException;

public class Player {
//    private final GameBoard gameBoard = new GameBoard();
    TicTacToeReferee referee = new TicTacToeReferee();

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
        if (referee.checkWinInFirstRow()) return true;
        if (referee.checkWinInSecondRow()) return true;
        if (referee.checkWinInThirdRow()) return true;

        if (referee.checkWinInFirstColumn())return true;
        if (referee.checkWinInSecondColumn()) return true;
        if (referee.checkWinInThirdColum()) return true;

        if (referee.checkWinInFirstDiagonal()) return true;
        if (referee.checkWinInSecondDiagonal()) return true;
        return referee.checkTie();
    }


}


