/*
package SeptemberLeaveSnack.HugeInteger;

import java.util.Arrays;

public class TestClassMain {
    public static int[] addArray(int[] arr1, int[] arr2){
        int sum =0;
        int remainder =0;
        int carry = 0;
        int[] result = new int[arr1.length];

        for (int i = arr1.length-1; i >= 0; i--) {
            sum = arr1[i] + arr2[i] + carry;
            if (sum > 9 && i == 0){
                result[i] = sum;
                break;
            }
            if(sum > 9){
                remainder = sum % 10;
                carry = sum /10;
                result[i] = remainder;
            } else{
                result[i] = sum;
                carry = 0;
            }
        }
        return result;
    }

    public static int[] subtractArray(int[]arr1, int[] arr2){
        int[] result = new int[arr1.length];

        for (int i = arr1.length-1; i >=0 ; i--) {
            if(arr1[i] < arr2[i] && i == 0 ){
                result[i] = arr1[i] - arr2[i];
                break;
            }
            if(arr1[i] < arr2[i]) {
                arr1[i] = arr1[i] + 10;
                arr1[i-1]--;
                result[i] = arr1[i] - arr2[i];
            }
            result[i] = arr1[i] - arr2[i];
            }


        return result;
        }




    public static void main(String[] args) {
//        int[] arr1 = {6,2,7,4,8,5,4,5,2,6,7,3,2,8,7};
//        int[] arr2 = {3,2,4,5,3,2,7,4,4,5,9,9,2,2,1};

        int[] arr1 = {4,5,4,7,8};
        int[] arr2 = {6,5,4,2,8};

//        System.out.println(arr1.length == arr2.length);
        System.out.println(Arrays.toString(addArray(arr1, arr2)));
        System.out.println(Arrays.toString(subtractArray(arr1, arr2)));
    }
}

*/


