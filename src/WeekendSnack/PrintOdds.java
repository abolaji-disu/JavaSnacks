package WeekendSnack;

public class PrintOdds {

    public static int printOddElementPosition(int[] nums){
        for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 1) return i;
        }
        return 0;

    }
}
