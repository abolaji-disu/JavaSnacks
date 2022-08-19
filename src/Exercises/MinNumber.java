package Exercises;



public class MinNumber {
    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr2 = {2, 3, 1, 5, 4};
        System.out.println(MinNumber.findMin(arr2));
    }
}