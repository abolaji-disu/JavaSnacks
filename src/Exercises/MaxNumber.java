package Exercises;


import java.util.Arrays;

public class MaxNumber {
    public static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr2 = {2, 3, 1, 5, 4};
        System.out.println(MaxNumber.findMax(arr2));

    }
}