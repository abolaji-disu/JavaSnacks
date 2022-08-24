package WeekendSnack.test;

import WeekendSnack.maxNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class maxNumberTest {
    private maxNumber num;

    @Test
    public void testForLargestNumber(){
        int[] nums = {2,5,6,8};
        assertEquals(8, maxNumber.max(nums));
    }
}
