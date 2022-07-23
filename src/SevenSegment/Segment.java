package SevenSegment;

public class Segment {

    private static final int[][] fillBoxes = new int[5][4];

    static void fillBoxesA() {
        fillBoxes[0][0] = 1;
        fillBoxes[0][1] = 1;
        fillBoxes[0][2] = 1;
        fillBoxes[0][3] = 1;
    }

    static void fillBoxesB() {
        fillBoxes[0][3] = 1;
        fillBoxes[1][3] = 1;
        fillBoxes[2][3] = 1;
    }

    static void fillBoxesC() {
        fillBoxes[2][3] = 1;
        fillBoxes[3][3] = 1;
        fillBoxes[4][3] = 1;
    }

    static void fillBoxesD() {
        fillBoxes[4][0] = 1;
        fillBoxes[4][1] = 1;
        fillBoxes[4][2] = 1;
        fillBoxes[4][3] = 1;
    }

    static void fillBoxesE() {
        fillBoxes[2][0] = 1;
        fillBoxes[3][0] = 1;
        fillBoxes[4][0] = 1;
    }

    static void fillBoxesF() {
        fillBoxes[0][0] = 1;
        fillBoxes[1][0] = 1;
        fillBoxes[2][0] = 1;
    }

    static void fillBoxesG() {
        fillBoxes[2][0] = 1;
        fillBoxes[2][1] = 1;
        fillBoxes[2][2] = 1;
        fillBoxes[2][3] = 1;
    }


    static void enterSwitch(int one, int two, int three, int four, int five, int six, int seven){
        if (one == 1){
            fillBoxesA();
        }
        if (two == 1){
            fillBoxesB();
        }
        if (three == 1){
            fillBoxesC();
        }
        if (four == 1){
            fillBoxesD();

        }
        if (five == 1){
            fillBoxesE();
        }
        if (six == 1){
            fillBoxesF();
        }
        if (seven == 1){
            fillBoxesG();
        }

    }

    static void showBoxes() throws InterruptedException {
        for (int[] rows : fillBoxes) {
            for (int elements : rows) {
                if (elements == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                Thread.sleep(300);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Segment.enterSwitch(1,1,1,1,0,0,1);
        Segment.showBoxes();
    }
}


