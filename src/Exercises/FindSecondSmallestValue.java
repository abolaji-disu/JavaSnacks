package Exercises;

public class FindSecondSmallestValue {
    /**
     * MinNumber.findMin() is a predefined method in MaxNumber Class
     * This class simply calls the method to find the maximum value
     * You Can find the method in this streams package on this repo
     */
    public static int findSecondSmallest(int[] arr){
        int largest = Integer.MAX_VALUE;
        int firstSmallest = MinNumber.findMin(arr);

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == firstSmallest) arr[i] = largest;

        return MinNumber.findMin(arr);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,4,3,5,6,1,3,5,8,9,2};
        System.out.println(findSecondSmallest(arr));
    }
}
