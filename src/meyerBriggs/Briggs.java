package meyerBriggs;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Briggs {

        //E I Column
        static String [][] colA = new String[5][2];
        // S N Column
        static String [][] colB = new String[5][2];
        // T F Column
        static String [][] colC = new String[5][2];
        // J P Column
        static String [][] colD = new String[5][2];

        static String[] result = new String[4];

        static Scanner userInput = new Scanner(System.in);
        static int counterA = 0;
        static int counterB = 0;

        static void askQuestions(){
            System.out.println("Kindly Choose A or B for the following question");
            System.out.println("A. Expend energy, enjoy groups\nB. Conserve energy, enjoy one-on-one");
            System.out.print("Kindly enter a or b: ");
            String questionOne = userInput.nextLine();

            if (questionOne.equals("a")){ colA[0][0] = "a"; } else if (questionOne.equals("b")) { colA[0][1] = "b"; }

            System.out.println("A. Interpret literally\nB. looking for meaning and possibilities");
            System.out.print("Kindly enter a or b: ");
            String questionFive = userInput.nextLine();

            if (questionFive.equals("a")){colA[1][0] = "a"; } else if (questionFive.equals("b")) { colA[1][1] ="b"; }

            for (int rows = 0; rows < colA.length; rows++){if (Objects.equals(colA[0][0], "a")){ counterA++;
            } else if (colA[0][1].equals("b")) { counterB++; }

                if (Objects.equals(colA[1][0], "a")){ counterA++; } else if (colA[1][1].equals("b")) {counterB++; }

                if (counterA > counterB){ result[0] = "E";} else result[0] = "I";

            }
            System.out.println(Arrays.toString(result));
        }

        public static void main(String[] args) {
            Briggs.askQuestions();
        }
    }

