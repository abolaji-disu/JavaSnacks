package Exercises;


import java.util.Arrays;
import Exercises.MaxNumber;
import Exercises.MinNumber;

public class ArrayAveragesSum {
    public static int[] findHigh(int[] array) {
        int calculateNum = 0;
        int[] saveTotal = new int[array.length];
        int count = 0;

        while (count < array.length) {
            for (int i = 0; i < array.length; ) {
                calculateNum += array[i];
                i++;
            }

            for (int k = 0; k < array.length; k++) {
                saveTotal[k] = calculateNum - array[k];
                count++;
            }

        }

        return saveTotal;

    }


    public static void main(String[] args) {
        int[] arr2 = {2, 3, 1, 5, 4};
        System.out.println(Arrays.toString(ArrayAveragesSum.findHigh(arr2)));
        System.out.println(Arrays.toString(new int[]{MaxNumber.findMax(ArrayAveragesSum.findHigh(arr2))}));
        System.out.println(Arrays.toString(new int[]{MinNumber.findMin(ArrayAveragesSum.findHigh(arr2))}));

    }
}

