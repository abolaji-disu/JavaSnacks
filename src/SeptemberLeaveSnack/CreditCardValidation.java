package SeptemberLeaveSnack;

public class CreditCardValidation {

    public static boolean isValid(String number){
        boolean cardTypeIsValid = number.charAt(0) == '4' || number.charAt(0) == '5' || number.charAt(0) == '6';
        boolean lengthIsValid = number.length() >= 13 && number.length() <= 16 ;
        int totalCardNumber = sumOfDoubleEvenPlace(number) + sumOffOddPlaces(number);
        boolean totalCardNumberIsValid = totalCardNumber % 10 == 0;
        if (totalCardNumberIsValid && lengthIsValid && cardTypeIsValid) return true;
        return false;
    }
    public static int sumOfDoubleEvenPlace(String number){
//        String numberString = String.valueOf(number);
        String[] numSplit = number.split("");
        String[] numberStringArr = new String[numSplit.length];
        int[] numberIntArr = new int[numSplit.length];
        int[] saveDoubleDigits = new int[numberIntArr.length];
        int calculatedDoubleDigits;
        int calculatedSingleDigits;

        //saving input from the back
        saveArrayReverse(numSplit, numberStringArr);

        //converting each number to integer
        convertArrayElementToInteger(numberStringArr, numberIntArr);

        // double the values
        for (int i = 0; i < numberIntArr.length; i++){
            numberIntArr[i] = numberIntArr[i] * 2;
        }

        // collect for double digits
        for (int i = 0; i < numberIntArr.length; i++) {
            if (getDigits(numberIntArr[i]) > 1){
                saveDoubleDigits[i] = numberIntArr[i];
                numberIntArr[i] = 0;
            }
        }

        calculatedDoubleDigits = addDoubleDigits(saveDoubleDigits);
        calculatedSingleDigits = addSingleDigits(numberIntArr);

        return calculatedDoubleDigits + calculatedSingleDigits;

    }

    private static void convertArrayElementToInteger(String[] numberStringArr, int[] numberIntArr) {
        for (int i = 0; i < numberStringArr.length; i++) {
            numberIntArr[i] = Integer.parseInt(numberStringArr[i]);
        }
    }

    private static void saveArrayReverse(String[] numSplit, String[] numberStringArr) {
        for (int i = numSplit.length-2, j = 0; j < numSplit.length; i--, j++) {
            if (i % 2 == 0) numberStringArr[j] = numSplit[i];
            if(numberStringArr[j] == null) numberStringArr[j] = "0";
        }
    }

    public static int sumOffOddPlaces(String num){
        String[] splitNum = num.split("");
        int[] splitNumInt  = new int[num.length()];
        int calculateOddsNum = 0;

        convertArrayElementToInteger(splitNum, splitNumInt);

        for (int i = 0; i < splitNumInt.length; i++){
            if (i % 2 == 1) calculateOddsNum += splitNumInt[i];
        }

        return calculateOddsNum;
    }
    public static int addDoubleDigits(int[] num){
        String numStr = "";
        for (int i = 0; i < num.length; i++) {
            numStr += num[i];
        }

        int[] numStrArr = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            numStrArr[i] = Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }

        int addDoubleDigits = 0;

        for (int i = 0; i < numStrArr.length; i++) {
            addDoubleDigits += numStrArr[i];
        }

        return addDoubleDigits;
    }

    public static int addSingleDigits(int[] num){
        int addSingleDigits = 0;
        for(int i = 0; i < num.length; i++){
            addSingleDigits += num[i];
        }
        return addSingleDigits;
    }

    public static int getDigits(int num){
        int count = 0;
        while (num != 0){
            num = num / 10;
            count ++;
        }
        return count;
    }

    public static void main(String[] args){
        String validCardNumber = "4388576018410707";
        String invalidCardNumber = "4388576018402626";
        String myVisaCard = "4105400018034650";
        System.out.printf("Sum of card in Odd Places is %d%n",sumOfDoubleEvenPlace(myVisaCard));
        System.out.printf("Sum of card numbers in odd places is %d%n", sumOffOddPlaces(myVisaCard));
        System.out.printf("Your card status is %b",isValid(myVisaCard));
    }
}
