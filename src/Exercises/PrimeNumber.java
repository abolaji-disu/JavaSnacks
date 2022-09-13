package Exercises;

class PrimeNumbers{
    private static int i = 2;
    public static boolean checkPrime(int number) {
        if (number == 0 || number == 1) return false;
        if (number == i) return true;
        if (number % i == 0)  return false;
        i++;
        return checkPrime(number);
    }

    public static void printPrimes(int number){
//        boolean checkForOne = number == 0 || number == 1;
//        boolean checkForTwo = number == 2;
//
//        if(checkForOne){
//            System.out.println("Not a Prime");;
//        }
//        if(checkForTwo){
//            System.out.println("Its a prime");
//        }
//
//        for (int j = 2; j < number; ++j) {
//            if(number % j == 0 ){
//                System.out.println(j);
//            }
//        }

        for (int j = 0; j < number; j++) {

        }
    }
    public static void main(String[] args){
        if (checkPrime(11))  System.out.print("Its a Prime");
            else System.out.print("Not a Prime");
//        System.out.println(checkPrime(37));

//        printPrimes(50);
    }
}

