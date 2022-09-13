package SeptemberLeaveSnack.TicTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TicTacToeTest {
    private Player player;
    private GameBoard board;

    @BeforeEach
    void setGameUp(){
        player = new Player();
    }

    @Test
    public void testThatThereIsAPlayer(){
        assertNotNull(player);
    }

//    @Test
//    public void testThatPlayerOneCanMoveOnBoard(){
//        //we have a board
//
//        // when playerOnePlays
//        player.move();
//        // board space = playerOne
//    }
}
