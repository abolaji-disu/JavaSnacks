package WeekendSnack;

import java.util.Arrays;

public class reverseList {
    public static String[] reverseArray(String[] list) {
        String[] reversed = new String[list.length];
        for(int i = list.length -1, j = 0;  i >= 0; i--, j++){
            reversed[j] = list[i];
        }
        return reversed;
    }

}
