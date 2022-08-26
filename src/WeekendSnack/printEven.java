package WeekendSnack;

public class printEven {
    public static String evenNums(int[] arr){
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
            str += i;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,10};
        System.out.println(evenNums(arr));
    }
}
