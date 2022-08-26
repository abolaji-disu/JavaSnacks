package WeekendSnack;

import java.util.Objects;

public class palindromeCheck {
    public static boolean checkPalindrome(String str){
        for (int i = str.length() -1, j = 0; i >= 0 ; i--, j++) {
            if(str.charAt(i) != str.charAt(j)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "dad";
        System.out.println(checkPalindrome(str));
    }
}
