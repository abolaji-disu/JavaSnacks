package Exercises;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class FactorsTest {

     @Test
        public void checkFactors(){
            int checkTotalLength = Factors.factors(6);
            assertEquals(4,checkTotalLength);
        }
        @Test
        public void checkPrime(){
            int checkTotalLength = Factors.factors(2);
            boolean isPrime = checkTotalLength == 2;
            assertTrue(isPrime);

        }
    }


