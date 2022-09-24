package Exercises;

import java.util.ArrayList;

public class WordCombinator {
    public static ArrayList generateEveryPossibleCombinationLetters(String words, int wordLen){
        String[] spWords = words.split("");
        ArrayList<String> combinedWords = new ArrayList<>();
        String newFormedWords = "";
        long combination = factorial(words.length()) / factorial((words.length() - wordLen)) * factorial(wordLen);

        for (int i = 0; i < combination; i++) {
            for (int j = 2; j < wordLen +1; j++) {
                newFormedWords += spWords[i];
                for (int k = 1; k < wordLen; k++) {
                    newFormedWords += spWords[k];
                    if (j == 3) {
                        combinedWords.add(newFormedWords);
                        newFormedWords = "";
                    }
                }
            }
        }
        return combinedWords;
    }

    public static long factorial(int num){
        long calculateFactorial = 1;
        for (int i = 1; i <= num ; i++) {
            calculateFactorial *= i;
        }
        return calculateFactorial;
    }

    public static void main(String[] args) {
        System.out.println(generateEveryPossibleCombinationLetters("bathe", 3));
    }
}
