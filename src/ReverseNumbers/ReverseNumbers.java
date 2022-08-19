package ReverseNumbers;

import java.util.Arrays;

public class ReverseNumbers {
//    public static String[] returnNumbers(int nums){
//        String numConv = Integer.toString(nums);
//        String[] numArr = numConv.split("");
//        String[] numsArrInt = new String[numArr.length];
//        for (int i = numArr.length-1 ; i > 0; i-- ){
//            numsArrInt[i] = numArr[i];
//        }
//        numsArrInt[0] = numArr[0];
//        return numsArrInt;
//    }

    public static char[] returnNumbers(int nums) {
        String numConv = Integer.toString(nums);
        char[] numArr = new char[numConv.length()];
        for (int i = numConv.length() - 1, j = 0; i >= 0; i--, j++) {
            numArr[j] = numConv.charAt(i);
        }
        return numArr;
    }


    public static void main(String[] args) {
        int nums = 34567801;
        System.out.println(returnNumbers(nums));
    }
}

