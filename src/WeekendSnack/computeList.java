package WeekendSnack;

public class computeList {
    public static int compute(int[] arr){
        int len  = 0;
        for (int i = 0; i < arr.length; i++) {
            len += arr[i];
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,10};
        System.out.println(compute(arr));
    }
}
