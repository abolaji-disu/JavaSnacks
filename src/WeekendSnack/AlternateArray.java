package WeekendSnack;

import java.util.Arrays;

public class AlternateArray {

    public static String[] alternate(int[] arr1, String[] arr2){

        String[] collectArr = new String[arr1.length + arr2.length];

        for(int i= 0, j = 0; i < collectArr.length; i += 2, j++)
            collectArr[i] = arr1[j] + "";

        for(int i = 1, j = 0; i < collectArr.length; i +=2, j++ )
            collectArr[i] = arr2[j] + "";

        return collectArr;
    }




    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"a", "b", "c", "d", "e"};
        System.out.println(Arrays.toString(alternate(arr1, arr2)));
    }
}
