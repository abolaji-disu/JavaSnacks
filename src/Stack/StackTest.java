package Stack;

import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class StackTest {
    private Stack items;

    @BeforeEach
    void setUp(){
        items = new Stack(2);
    }

    @Test
    public void checkStackExist() {
        Stack items = new Stack(1);
        assertNotNull(items);
    }

    @Test
    public void checkStackPushItems(){
        items = new Stack(2);
        String name = "Bola";
        String nameA = "Titi";
        String nameB = "Tade";
        String nameC = "Goke";
        String nameD = "Bisi";
        String nameE = "Sade";
        String nameF = "Kola";
        items.push(name);
        items.push(nameA);
        items.push(nameB);
        items.push(nameC);
        items.push(nameD);
        items.push(nameE);
        items.push(nameF);

        assertEquals(7,items.size());
    }

    @Test
    public void checkStackPopItems(){
        items = new Stack(2);
        String name = "Sola";
        String nameA = "Kola";
        String nameB = "Yemi";

        items.push(name);
        items.push(nameA);
        items.push(nameB);

        items.pop();

        assertEquals(2,items.size());

    }

    @Test
    public void checkStackPeek(){
        items = new Stack(2);
        String name = "Sola";
        String nameA = "Kola";
        String nameB = "Yemi";
        String nameC = "Femi";

        items.push(name);
        items.push(nameA);
        items.push(nameB);
        items.push(nameC);

        assertEquals("Femi", items.peek());

    }

    @Test
    public void checkStackSearch(){
        items = new Stack(2);
        String name = "Kola";
        String nameB = "Tayo";

        items.push(name);
        items.push(nameB);

        assertEquals("Tayo",items.search(1));
    }

    @Test
    public void checkStackIsEmpty(){
    items = new Stack(3);
    String name = "Titi";
   // items.push(name);
     assertTrue(items.empty());
    }

}
