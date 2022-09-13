package Exercises;

import java.util.Arrays;
import java.util.Random;

public class UniqueArray {

    public static int[] generateUniqueSet(int numberRange){
        Random rand = new Random();
        int[] storeSet = new int[numberRange];
        int count = 0;

        for (int i = 0; i < storeSet.length; i++) {
            int newRand = 1 + rand.nextInt(numberRange);
            storeSet[i] = newRand;
        }

       for (int i = 0; i < storeSet.length; i++) {
            for (int j = i + 1; j < storeSet.length; j++) {
                if(storeSet[i] == storeSet[j]) {
                    storeSet[i] += 1+ rand.nextInt(numberRange) + j;
                    count += 1;
                }

            }
        }


//        for (int i = 0; i < storeSet.length; i++) {
////            if (storeSet[i] == 0){
////                int newRand  = 1 + rand.nextInt(numberRange);
////                int newRandModified = newRand + (i + 1);
////                storeSet[i] = newRandModified;
////            }
//            int newRand  = 1 + rand.nextInt(numberRange);
//            while(storeSet[i] == newRand){
//                newRand = 1 + rand.nextInt(numberRange);
//                if(storeSet[i] == 0){
//                    storeSet[i] = newRand;
//                }
//            }
//
//        }


//        for (int i = 0; i < storeSet.length; i++) {
//            if(storeSet[i] == 0){
//                storeSet[i] = 1 + rand.nextInt(numberRange) + 5;
//            }
//        }
        return storeSet;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generateUniqueSet(5)));
        System.out.println(Arrays.toString(generateUniqueSet(10)));
        System.out.println(Arrays.toString(generateUniqueSet(15)));
        System.out.println(Arrays.toString(generateUniqueSet(20)));
        System.out.println(Arrays.toString(generateUniqueSet(25)));

//        System.out.println(Arrays.toString(generateUniqueSet(5)));
//        System.out.println(Arrays.toString(generateUniqueSet(5)));
//        System.out.println(Arrays.toString(generateUniqueSet(5)));
//        System.out.println(Arrays.toString(generateUniqueSet(5)));
//        System.out.println(Arrays.toString(generateUniqueSet(5)));
//        int newRand;
//        Random rand   = new Random();
//        int[] storeSet = new int[10];
//        int count;
//
//
//        for (int i = 0; i < storeSet.length; i++){
//            newRand = 1 + rand.nextInt(10);
//            storeSet[i] = newRand;
//        }
//
//        for (int i = 0; i < storeSet.length; i++) {
//            if(storeSet[i] )
//        }
//
//        System.out.println(Arrays.toString(storeSet));
    }
}
