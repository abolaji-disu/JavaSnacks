package TurtleGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static TurtleGame.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    Turtle ijapa;
    SketchPad sketchPad;

    @BeforeEach
    public void jennyWantsThis(){

        ijapa = new Turtle();
        sketchPad = new SketchPad(5, 5);
    }


    @Test
    public void thereIsATurtle(){
        Turtle ijapa = new Turtle();
        assertNotNull(ijapa);
    }

    @Test
    public void turtleCanMovePenUpTest(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void turtleCanMovePenDownTest(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());

        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void turtleCanTurnRight_whileFacingEastTest(){
        assertEquals(EAST, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRight_whileFacingSouthTest(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRight_whileFacingWestTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRight_whileFacingNorthTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }


    @Test
    public void turtleCanTurnLeft_whileFacingEastTest() {
        assertEquals(EAST, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeft_whileFacingNorthTest(){
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeft_whileFacingWestTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection() );

        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeft_whileFacingSouthTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());

        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }


    @Test
    public void turtleCanMoveWhileFacingEastAndPenIsUpTest(){
    assertEquals(new Position(0,0), ijapa.getCurrentPosition());
    ijapa.penUp();
    ijapa.move(3, sketchPad);
    assertEquals(new Position(0,2), ijapa.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveWhileFacingSouthAndPenIsUpTest(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.penUp();
        ijapa.move(2,sketchPad );
        assertEquals(new Position(1, 0), ijapa.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveWhileFacingWestAndPenIsUpTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.penUp();
        ijapa.move(5, sketchPad);
        assertEquals(new Position(0, 4),  ijapa.getCurrentPosition());
    }

    @Test
    public void turtleCanMoveWhileFacingNorthAndPenIsUpTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.penUp();
        ijapa.move(2, sketchPad);
        ijapa.move(2, sketchPad);
        ijapa.move(2, sketchPad);
        assertEquals(new Position(3,0), ijapa.getCurrentPosition());
        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.move(4, sketchPad);
        assertEquals(new Position(3,3), ijapa.getCurrentPosition());
    }

//    @Test
//    public void turtleCanMoveWhileFacingEastTest(){
//    assertEquals(new Position(0,0), ijapa.getCurrentPosition());
//    ijapa.move(0,3);
//    assertEquals(new Position(0,3), ijapa.getCurrentPosition());
//}
//
//    @Test
//    public void turtleCanMoveWhileFacingSouthTest(){
//        ijapa.turnRight();
//        assertEquals(SOUTH, ijapa.getCurrentDirection());
//        ijapa.move(5,5);
//        assertEquals(new Position(5, 5), ijapa.getCurrentPosition());
//    }
//
//    @Test
//    public void turtleCanMoveWhileFacingWestTest(){
//        ijapa.turnRight();
//        ijapa.turnRight();
//        assertEquals(WEST, ijapa.getCurrentDirection());
//        ijapa.move(3,5);
//        assertEquals(new Position(3, 5),  ijapa.getCurrentPosition());
//    }
//
//    @Test
//    public void turtleCanMoveWhileFacingNorthTest(){
//        ijapa.turnRight();
//        ijapa.turnRight();
//        ijapa.turnRight();
//        assertEquals(NORTH, ijapa.getCurrentDirection());
//        ijapa.move(1,3);
//        ijapa.move(1,7);
//        ijapa.move(2,6);
//        assertEquals(new Position(4,16), ijapa.getCurrentPosition());
//        ijapa.turnRight();
//        assertEquals(EAST, ijapa.getCurrentDirection());
//        ijapa.move(0,5);
//        assertEquals(new Position(4,21), ijapa.getCurrentPosition());
//    }
//
    @Test
    public void turtleCanWriteWhenPenIsDownAndPenIsUpTest(){
        ijapa.penDown();
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
        assertFalse(ijapa.isPenUp());

        ijapa.move(3, sketchPad);
        assertEquals(new Position(0, 2), ijapa.getCurrentPosition());

        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, floor[0][3]);

        ijapa.penDown();
        sketchPad.displayBoard();
    }
}
