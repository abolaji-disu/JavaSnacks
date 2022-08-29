package WeekendSnack;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;

public class ReplaceFunction {
    public static String replace(String sentence, String findWord, String subWord){

        String[] splitSentence = sentence.split(" ");
        String saveSentence = "";
        int count = 0;

        for ( int i = 0; i < splitSentence.length; i++) {
            if(Objects.equals(splitSentence[i],findWord)){
                splitSentence[i] = subWord;
                break;
            }
            count++;
        }

        if ( count == splitSentence.length) return "input can't be found";

        for (String s : splitSentence) saveSentence += s + " ";

        return saveSentence;
    }

    public static void main(String[] args) {
        String word = "The name of my motor is Jaguar";
        System.out.println(ReplaceFunction.replace(word,"jaguar","Toyota"));
    }
}
