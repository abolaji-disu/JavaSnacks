package FM_Algo;

import java.util.Arrays;

public class BasicAlgos {

        public static int findMin(int[] arr){
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i]) arr[i] = min;
            }
            return min;
        }

        public static int findMax(int[] arr){
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) max = arr[i];
            }
            return max;
        }

        public static int[] sortAscending(int[] arr){
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length ; j++) {
                    if(arr[j] > arr[i]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            return arr;
        }

        public static int[] sortDescending(int[] arr){
            int nTemp = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length ; j++) {
                    if(arr[j] < arr[i]){
                        nTemp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = nTemp;
                    }
                }
            }
            return arr;
        }

//        public int[] reverseArray(int[] arr){
//
//        }
        public static void main(String[] args) {

            int[] arr  = {1,2,3,4,5,6,7,8,9,10};
            int[] arr1 = {2,3,1,4,5};

            System.out.println(findMin(arr));
            System.out.println(findMax(arr));
            System.out.println(Arrays.toString(sortAscending(arr1)));
            System.out.println(Arrays.toString(sortDescending(arr1)));
        }
    }


