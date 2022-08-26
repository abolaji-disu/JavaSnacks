package WeekendSnack;

import java.util.Arrays;

public class ReturnList {
    public static int[] returnList(int num){
        String numStr = String.valueOf(num);
        int[] numStrArr = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            numStrArr[i] = Integer.parseInt(String.valueOf((numStr.charAt(i))));
        }
        return numStrArr;
    }

    public static void main(String[] args) {
        int num = 34567;
        System.out.println(Arrays.toString(returnList(num)));
    }
}
