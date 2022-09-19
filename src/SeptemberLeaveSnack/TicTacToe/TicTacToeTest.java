package SeptemberLeaveSnack.TicTacToe;


import SeptemberLeaveSnack.TicTacToe.ErrorModule.IllegalValueException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static SeptemberLeaveSnack.TicTacToe.GameBoard.board;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private GameBoard gameBoard;
    private Player player;

    @BeforeEach
    void setUp(){
        gameBoard = new GameBoard();
        player = new Player();
    }

    @Test
    void testThatThereIsAPlayerClassExist(){
        assertNotNull(player);
    }

    @Test
    void testThatThereIsAGameBoard(){
        assertNotNull(gameBoard);
    }

    @Test
    void testThatAllGameBoardAreInitializedToEmpty(){

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                assertEquals(PlayerMark.E, board[i][j]);
            }
        }
    }

    @Test
    void testThatPlayerCannotPlayOutOfBoardIndex(){
        assertThrows(IllegalValueException.class, ()-> player.setPlayerPosition(10));
    }

    @Test
    void testThatPlayerCanSwitchTurns(){
        player.setPlayerPosition(1);
        assertEquals(PlayerMark.X, player.getPlayerState());
        player.setPlayerPosition(2);
        assertEquals(PlayerMark.O, player.getPlayerState());
        player.setPlayerPosition(3);
        assertEquals(PlayerMark.X, player.getPlayerState());

        player.setPlayerPosition(4);
        assertEquals(PlayerMark.O, player.getPlayerState());
        player.setPlayerPosition(5);
        assertEquals(PlayerMark.X, player.getPlayerState());
        player.setPlayerPosition(6);
        assertEquals(PlayerMark.O, player.getPlayerState());

        player.setPlayerPosition(7);
        assertEquals(PlayerMark.X, player.getPlayerState());
        player.setPlayerPosition(8);
        assertEquals(PlayerMark.O, player.getPlayerState());
        player.setPlayerPosition(9);
        assertEquals(PlayerMark.X, player.getPlayerState());
        GameBoard.displayBoard();

    }

    @Test
    void testThatPlayerCanOnlyPlayOnceOnACellPosition(){
    player.setPlayerPosition(1);
    player.setPlayerPosition(2);
    player.setPlayerPosition(5);
    assertEquals(PlayerMark.X, player.getPlayerState());
    }

    @Test
    void testThatPlayerCanWinInRowOne(){
    player.setPlayerPosition(1);
    player.setPlayerPosition(4);
    player.setPlayerPosition(2);
    player.setPlayerPosition(5);
    player.setPlayerPosition(3);
    GameBoard.displayBoard();
    assertTrue(player.checkWinner());
    }

    @Test
    void testThatPlayerCanWinInRowTwo(){
        player.setPlayerPosition(7);
        player.setPlayerPosition(4);
        player.setPlayerPosition(2);
        player.setPlayerPosition(5);
        player.setPlayerPosition(3);
        player.setPlayerPosition(6);
        GameBoard.displayBoard();
        assertTrue(player.checkWinner());
    }

    @Test
    void testThatPlayerCanWinInRowThree(){
        player.setPlayerPosition(1);
        player.setPlayerPosition(7);
        player.setPlayerPosition(4);
        player.setPlayerPosition(8);
        player.setPlayerPosition(3);
        player.setPlayerPosition(9);
        GameBoard.displayBoard();
        assertTrue(player.checkWinner());
    }






}
