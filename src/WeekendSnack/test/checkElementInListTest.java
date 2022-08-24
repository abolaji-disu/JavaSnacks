package WeekendSnack.test;

import WeekendSnack.checkElementInList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class checkElementInListTest {
    private checkElementInList list;

    @Test
    public void checkIfElementIsInList(){
        int[] nums = {1,2,3,4,5,6,7,8,9};
        assertTrue(checkElementInList.checkElem(nums, 1));
    }

}
