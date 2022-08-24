package WeekendSnack;

public class checkElementInList {
    public static boolean checkElem(int[] array, int num) {
        for (int j : array) {
            if (j == num) {
                return true;
            }
        }
        return false;
    }


}
