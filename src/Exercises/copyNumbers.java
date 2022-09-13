package Exercises;

import java.util.Arrays;

public class copyNumbers {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int len = numbers.length;

        int newNumbers[] = new int[len], i;
        int track = 0;
//        for (int i = numbers.length -1; i >= 0; i--) {
//            for(int j = 0; j < i; j++){
//                newNumbers[j] = numbers[i];
//            }
//        }
        for (i  = 0; i < numbers.length; i++ ){
            newNumbers[i] = numbers[len-i-1];
        }
        System.out.println(Arrays.toString(newNumbers));


        String name = "Hippopotamus";

        for (int j = 0; j < name.length(); j++) {
            if(name.charAt(j) == 'p') System.out.print(name.charAt(j));
        }
    }

}
