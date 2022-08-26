package WeekendSnack;

public class computeNumberAllLoops {

    //for loops
    public static int computeNumForLoops(int[] arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
        }
        return num;
    }

    // while loops
    public static int computeNumWhileLoops(int[] arr){
        int num = 0;
        int i = 0;
        while (i < arr.length){
            num += arr[i];
            i++;
        }
        return num;
    }

    //do..while
    public static int computeNumDoWhile(int[] arr){
       int i= 0;
        int num = 0;
        do{
            num += arr[i];
            i++;
        }while (i < arr.length);
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8,9};
        System.out.println(computeNumWhileLoops(arr));
        System.out.println(computeNumDoWhile(arr));
        System.out.println(computeNumDoWhile(arr));
    }
}
