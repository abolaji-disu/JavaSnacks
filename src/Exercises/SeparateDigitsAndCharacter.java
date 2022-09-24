package Exercises;

import java.util.Scanner;

public class SeparateDigitsAndCharacter {
    public static String extractCharacter(String words){
        char[] newArray = new char[words.length()];
        char[] sepDigits = new char[words.length()];
        char[] sepChar = new char[words.length()];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = words.charAt(i);
        }

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (Character.isDigit(newArray[i])){
                j++;
                sepDigits[j] = newArray[i];
            }
        }

        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (Character.isLetter(newArray[i])){
                j++;
                sepChar[j] = newArray[i];
            }
        }

        String letters =  String.join("", String.valueOf(sepChar).trim());
        String digits =  String.join("", String.valueOf(sepDigits).trim());
        return letters + " " + digits;

    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the character mixed value");
        String name = userInput.next();
        System.out.println(extractCharacter(name));
    }

}
