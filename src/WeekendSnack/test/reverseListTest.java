package WeekendSnack.test;

import WeekendSnack.reverseList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class reverseListTest {
    private reverseList list;

    @Test
    public void testIfListReversedIsCorrect(){
        String[] list = {"cat" , "dog", "rat"};
        String[] reversed = {"rat" , "dog", "cat"};
        assertArrayEquals(reversed, reverseList.reverseArray(list));
    }
}
