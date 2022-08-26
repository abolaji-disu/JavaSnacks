package WeekendSnack;

import java.util.Arrays;

public class ArrayConcatenate {
//    public static String[] joinArray(String[] arr1, int[] arr2){
//        String[] newArray = new String[arr1.length + arr2.length];
//
//        for (int i = 0; i < arr1.length; i++) {
//            String collectElem = arr1[i] + "";
//            newArray[i] = String.valueOf(collectElem.charAt(i));
//        }
//
//        for (int i = arr1.length + 1; i < arr2.length; i++) {
//            String collectElem = arr2[i] + "";
//            newArray[i] = String.valueOf(collectElem.charAt(i));
//        }
//
//        return newArray;
//    }


    // using the in-built split function to return result
    public static String[] joinArrayA(int[] arr1, String[] arr2){
        String collectElem = "";

        for (int i = 0; i < arr1.length; i++) {
            collectElem += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            collectElem += arr2[i];
        }
        return collectElem.split("");
    }

    // using a string concatenation process of returning result
    public static String[] joinArray(int[] arr1, String[] arr2){
        var collectElem = "";

        for (int i = 0; i < arr1.length; i++) {
            collectElem += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            collectElem += arr2[i];
        }

        String[] collectArr = new String [collectElem.length()];

        for (int i = 0; i < collectArr.length ; i++) {
            collectArr[i] = String.valueOf(collectElem.charAt(i));

        }
        return collectArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"a", "b", "c", "d", "e"};

        System.out.println(Arrays.toString(joinArrayA(arr1, arr2)));
        System.out.println(Arrays.toString(joinArray(arr1, arr2)));
    }
}
