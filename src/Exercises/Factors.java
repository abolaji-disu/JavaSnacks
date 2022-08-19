package Exercises;



public class Factors {

    public static int factors(int numbers) {
        int count = 0;
        for (int i = 1; i <= numbers; i++) {
            if (numbers % i == 0) {
                count++;
            }
        }
        return count;
    }


}