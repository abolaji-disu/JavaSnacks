package WeekendSnack.test;

import WeekendSnack.PrintOdds;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrintOddElementTest {
    private PrintOdds odds;

    @Test
    public void testForOddPosition(){
        int[] nums = {2,5,4,7};
        assertEquals(3,PrintOdds.printOddElementPosition(nums));
    }
}
