package TurtleGame;


import static TurtleGame.Direction.*;

public class Turtle {
    private boolean isPenUp;
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);

    public void penUp() {
        isPenUp = true;
    }

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == WEST) face(NORTH);
        else if ((currentDirection == SOUTH)) face(WEST);
        else if (currentDirection == EAST) face(SOUTH);
        else {
            face(EAST);
        }
    }

    private void face(Direction newDirection){
        currentDirection = newDirection;
    }

    public void turnLeft() {
        if (currentDirection == WEST) face(SOUTH);
        else if (currentDirection == NORTH) face(WEST);
        else if (currentDirection == EAST) face(NORTH);
        else {
            face(EAST);
        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    private void move(int noOfSteps) {
        if(currentDirection == NORTH) moveSteps(noOfSteps);
        if (currentDirection == WEST) moveSteps(noOfSteps);
        if (currentDirection == EAST) moveSteps(noOfSteps);
        if (currentDirection == SOUTH) moveSteps(noOfSteps);


    }

    private void moveSteps(int noOfSteps) {

        if (noOfSteps > 1) {
            int newColumn = currentPosition.getColumn() + noOfSteps;
            currentPosition.setColumn(newColumn);
        }
        if (noOfSteps  == 1){
            int newRow = currentPosition.getRow() + noOfSteps;
            currentPosition.setRow(newRow);
        }
    }

    public void move(int noOfSteps, SketchPad sketchPad) {
        noOfSteps = noOfSteps - 1;
        if(!penIsUp()) writeOn(noOfSteps, sketchPad);
        move(noOfSteps);
    }

    private void writeOn(int noOfSteps, SketchPad sketchPad) {
        var floor = sketchPad.getFloor();
        int currentRow = currentPosition.getRow();
        int currentColumn = currentPosition.getColumn();

        if (currentDirection == EAST) {
            for (int i = 0; i <= noOfSteps; i++ ) {
                floor[currentRow][currentColumn++] = 1;
            }
        }
    }

    private boolean penIsUp() {
        return isPenUp;
    }


//    public void move(int rows, int columns) {
//        if (currentDirection == NORTH) moveSteps(rows, columns);
//        if (currentDirection == WEST)  moveSteps(rows, columns);
//        if (currentDirection == EAST)  moveSteps(rows, columns);
//        if (currentDirection == SOUTH) moveSteps(rows, columns);
//    }
//
//    private void moveSteps(int rows, int columns) {
//            int newColumn = currentPosition.getColumn() + columns;
//            int newRows = currentPosition.getRow() + rows;
//            currentPosition.setColumn(newColumn);
//            currentPosition.setRow(newRows);
//
//    }


}
