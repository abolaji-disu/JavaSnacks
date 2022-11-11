
package SeptemberLeaveSnack.HugeInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class HugeIntegerTest {
    private  HugeInteger hugeInteger;

    @BeforeEach
    void setUp(){
        hugeInteger = new HugeInteger("2356789");
    }

    @Test
    void testThatThereIsAnHugeIntegerClass(){
        assertNotNull(hugeInteger);
    }

    @Test
    void testThatThereIsArrayOfDigits(){
        int[] integerArray = hugeInteger.getDigitsArray();
        assertNotNull(integerArray);
    }

    @Test
    void testThatTheArrayOfDigitsHasALengthOfForty(){
        int arrayLength = hugeInteger.getDigitsArray().length;
        assertEquals(40, arrayLength);
    }

    @Test
    void testThatHugeIntegerLengthCanBeValidated(){
        String parseString1 = "98999999999999999999999999999999999999999999999999999999999999999999999999999999998";
        assertThrows(HugeIntegerOutOfBoundsExceptionError.class, ()-> new HugeInteger(parseString1));
    }

    @Test
    void testThatStringHugeIntegerDigitsCanBeValidated(){
        String parseString1 = "9899999uuu";
        assertThrows(HugeIntegerMismatchException.class, ()-> new HugeInteger(parseString1));
    }

    @Test
    void testThatTheArrayMethodParseCanRemoveEachStringAndPassThemIntoTheArray(){
        String parseString = "1234567891011111314151617181920212223294";
        hugeInteger.parse(parseString);
        int[] hugeIntegerArray= hugeInteger.getHugeInteger();
        for (int i = 0; i < parseString.length(); i++)
            assertEquals(hugeIntegerArray[i], Integer.parseInt(String.valueOf(parseString.charAt(i))));
    }

    @Test
    void testThatWeCanAddTwoHugeIntegersObject(){

        String parseString = "8247860000000000000000000000000000000000";
        String parseString1 = "9542810000000000000000000000000000000000";

        HugeInteger hugeInteger1 = new HugeInteger(parseString);
        HugeInteger hugeInteger2 = new HugeInteger(parseString1);

        HugeInteger result = hugeInteger1.add(hugeInteger2);

        assertEquals(Arrays.toString(new int[]{17,7,9,0,6,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}),
                Arrays.toString(result.getDigitsArray()));
    }

    @Test
    void testThatWeCanSubtractTwoHugeIntegerObject(){
        String parseString1 = "71";
        String parseString2 = "98";

        HugeInteger hugeInteger1 = new HugeInteger(parseString1);
        HugeInteger hugeInteger2 = new HugeInteger(parseString2);

        HugeInteger result = hugeInteger1.subtract(hugeInteger2);

        assertEquals(Arrays.toString(new int[]{-2,7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}),
                Arrays.toString(result.getDigitsArray()));
    }

    @Test
    void testThatHugeIntegersAreEqualToOneAnother(){
        String parseString1 = "88888";
        String parseString2 = "88888";

        HugeInteger hugeInteger1 = new HugeInteger(parseString1);
        HugeInteger hugeInteger2 = new HugeInteger(parseString2);

        assertTrue(hugeInteger1.isEqualTo(hugeInteger2));
    }

    @Test
    void testThatHugeIntegerAreNotEqualsToOneAnother(){
        String parseString1 = "12345678";
        String parseString2 = "123456789";

        HugeInteger hugeInteger1 = new HugeInteger(parseString1);
        HugeInteger hugeInteger2 = new HugeInteger(parseString2);

        assertTrue(hugeInteger1.isNotEqualTo(hugeInteger2));
    }

    @Test
    void testThatTwoHugeIntegersObjectCanBeGreaterThanOneAnother(){
        String parseString1 = "9999";
        String parseString2 = "9989";

        HugeInteger hugeInteger1 = new HugeInteger(parseString1);
        HugeInteger hugeInteger2 = new HugeInteger(parseString2);

        assertTrue(hugeInteger1.isGreaterThan(hugeInteger2));
    }

    @Test
    void testThatTwoHugeIntegerObjectsCanBeLesserThanEachOther(){
        String parseString1 = "999999999999999999999999999999";
        String parseString2 = "997999999999999999999999999999";

        HugeInteger hugeInteger1 = new HugeInteger(parseString1);
        HugeInteger hugeInteger2 = new HugeInteger(parseString2);

        assertTrue(hugeInteger2.isLesserThan(hugeInteger1));
    }

    @Test
    void testThatHugeIntegerObjectsCanBeLesserThanOrEqualsToEachOther(){
        String parseString1 = "988";
        String parseString2 = "9889";

        HugeInteger hugeInteger1 = new HugeInteger(parseString1);
        HugeInteger hugeInteger2 = new HugeInteger(parseString2);

        assertTrue(hugeInteger1.isLesserThanOrEqualTo(hugeInteger2));
    }

    @Test
    void testThatHugeIntegerObjectsCanBeHigherThanOrEqualsToEachOther(){
        String parseString1 = "998";
        String parseString2 = "99";

        HugeInteger hugeInteger1 = new HugeInteger(parseString1);
        HugeInteger hugeInteger2 = new HugeInteger(parseString2);

        assertTrue(hugeInteger1.isGreaterThanOrEqualTo(hugeInteger2));
    }



}