package TurtleGame;

public class SketchPad {
    private int[][] floor;
    public SketchPad(int noOfRows, int noOfColumns) {
        floor = new int[noOfRows][noOfColumns];
    }

    public int[][] getFloor() {
        return floor;
    }

    public void displayBoard(){
        for(int i = 0; i < floor.length; i++){
            for (int  j = 0; j < floor[i].length; j++){
                if(floor[i][j] == 1){
                    System.out.print(" *");
                }else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
    }

}
