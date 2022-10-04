package Exercises;

public class FindSecondLargestValue {
    /**
     * MaxNumber.findMax() is a predefined method in MaxNumber Class
     * This class simply calls the method to find the maximum value
     * You Can find the method in this streams package on this repo
     */
    public static int findSecondLargest(int[] arr){
        int smallest = Integer.MIN_VALUE;
        int firstLargestValue = MaxNumber.findMax(arr);

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == firstLargestValue) arr[i] = smallest;

        return MaxNumber.findMax(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8};
        int secondLargest = findSecondLargest(arr);
        System.out.println(secondLargest);
    }
}
