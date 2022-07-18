package meyerBriggs;

import java.util.Objects;
import java.util.Scanner;

public class Briggs {
    static Scanner userInput = new Scanner(System.in);
    static int[][] storeInput = new int[4][2];

    public static void questions() {

            //ROW1
           // Q1
            System.out.println("A. Expend energy, energy groups\nB. Conserve energy, Enjoy one-on-one");
            String qOne = userInput.nextLine();
            if (Objects.equals(qOne, "a")) { storeInput[0][0]++;}
            else { storeInput[0][1]++;}
            // Q5
            System.out.println("A. More outgoing\nB. Thinking out loud");
            String qTwo = userInput.nextLine();
            if (Objects.equals(qTwo, "a")) { storeInput[0][0]++;}
            else { storeInput[0][1]++;}
            //Q9
            System.out.println("A. Seek many tasks, activities, interaction with others\nB. Seek Private, solitary activities, with quiet to concentrate");
            String qThree = userInput.nextLine();
            if (Objects.equals(qThree, "a")) {storeInput[0][0]++;}
            else{storeInput[0][1]++; }
            //Q13
            System.out.println("A. External communicative\nB.Internal, reticent, keep to yourself ");
            String qFour = userInput.nextLine();
            if (Objects.equals(qFour, "a")){storeInput[0][0]++;}
            else{storeInput[0][1]++; }
            //Q17
            System.out.println("A. active, initiate\nB. Reflective, deliberate");
            String qFive = userInput.nextLine();
            if (Objects.equals(qFive, "a")){storeInput[0][0]++; }
            else{ storeInput[0][1]++; }

            //ROW2
            //Q2
            System.out.println("interpret literally\nB. Look for meaning and possibilities");
            String qSix = userInput.nextLine();
            if (Objects.equals(qSix,"a")){storeInput[1][0]++;}
            else{ storeInput[1][1]++;}
            //Q6
            System.out.println("A. Logical, thinking, questioning\nB. Imaginative, innovative, theoretical");
            String qSeven = userInput.nextLine();
            if (Objects.equals(qSeven,"a")){storeInput[1][0]++;}
            else{storeInput[1][1]++;}
            //Q10
            System.out.println("A. Standard, usual, conventional\nB. Different, novel, unique");
            String qEight = userInput.nextLine();
            if (Objects.equals(qEight,"a")){storeInput[1][0]++;}
            else{storeInput[1][1]++;}
            //Q14
            System.out.println("A. Focus on here and now\nB. Look to the future, global perspective, 'big picture' ");
            String qNine = userInput.nextLine();
            if (Objects.equals(qNine,"a")){storeInput[1][0]++;}
            else{storeInput[1][1]++;}
            //Q18
            System.out.println("A. Facts, things, 'what is'\nB. Ideas, dreams, 'what could be', philosophical");
            String qTen = userInput.nextLine();
            if (Objects.equals(qTen,"a")){storeInput[1][0]++;}
            else{storeInput[1][1]++;}

            //ROW3
            //Q3
            System.out.println("A. Logical, thinking, question\nB. Empathetic, feeling, accommodating");
            String qEleven = userInput.nextLine();
            if (Objects.equals(qEleven,"a")){storeInput[2][0]++;}
            else{storeInput[2][1]++;}
            //Q7
            System.out.println("Candid, Straight forward, frank\nB. Tactful, kind, encouraging");
            String qTwelve = userInput.nextLine();
            if (Objects.equals(qTwelve,"a")){ storeInput[2][0]++;}
            else{storeInput[2][1]++;}
            //Q11
            System.out.println("Firm, tend to criticize, hold the line\nB. Gentle, tend to appreciate, conciliate");
            String qThirteen = userInput.nextLine();
            if (Objects.equals(qThirteen, "a")){storeInput[2][0]++;}
            else{storeInput[2][1]++;}
            //Q15
            System.out.println("Tough minded, just\nB. Tender-hearted, merciful");
            String qFourteen = userInput.nextLine();
            if (Objects.equals(qFourteen, "a")){storeInput[2][0]++;}
            else {storeInput[2][1]++;}
            //Q19
            System.out.println("A. Matter of fact, issue-oriented\nB. Sensitive, people-oriented, compassionate");
            String qFifteen = userInput.nextLine();
            if (Objects.equals(qFifteen , "a")){storeInput[2][0]++;}
            else{storeInput[2][1]++;}

            //ROW4
            //Q4
            System.out.println("A. Organized, orderly\nB. Flexible, adaptable");
            String qSixteen = userInput.nextLine();
            if (Objects.equals(qSixteen,"a")){storeInput[3][0]++;}
            else {storeInput[3][1]++;}
            //Q8
            System.out.println("A. Plan schedule\nB. Tactful, kind, encouraging");
            String qSeventeen = userInput.nextLine();
            if (Objects.equals(qSeventeen,"a")){storeInput[3][0]++;}
            else{storeInput[3][1]++;}
            //Q12
            System.out.println("A. Regulated, Structure\nB. Easygoing, 'live' and 'let live'");
            String qEighteen = userInput.nextLine();
            if (Objects.equals(qEighteen, "a")){storeInput[3][0]++;}
            else {storeInput[3][1]++;}
            //Q16
            System.out.println("A. Preparation, plan ahead\nB. Go with the flow, adapt as you go");
            String qNineteen = userInput.nextLine();
            if (Objects.equals(qNineteen, "a")){ storeInput[3][0]++;}
            else {storeInput[3][1]++; }
            //Q20
            System.out.println("A. Control, given\nB. Latitude, freedom");
            String qTwenty = userInput.nextLine();
            if (Objects.equals(qTwenty,"a")){storeInput[3][0]++;}
            else {storeInput[3][1]++;}

            printPersonalty();
    }

    public static void printPersonalty(){

        System.out.println();
        System.out.print("Your personalty Code is: ");

        if (storeInput[0][0] > storeInput[0][1]) { System.out.print("E");}
        else {System.out.print("I"); }

        if (storeInput[1][0] > storeInput[1][1]){System.out.print("S");}
        else {System.out.print("N");}

        if (storeInput[2][0] > storeInput[2][1]){System.out.print("T");}
        else{System.out.print("F");}

        if (storeInput[3][0] > storeInput[3][1]){System.out.print("J");}
        else{System.out.print("P");}
    }

    public static void main (String[]args){
        Briggs.questions();
    }
}