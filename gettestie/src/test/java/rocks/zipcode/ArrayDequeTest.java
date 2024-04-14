package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class ArrayDequeTest {
    ArrayDeque<String> deque = new ArrayDeque<>();
    @Test
    public void getFirstTest() {
        deque.add("One");
        deque.add("Two");

        String expectedFirst = "One";
        String actualFirst = deque.getFirst();

        Assert.assertEquals(expectedFirst, actualFirst);
    }

    @Test
    public void getLastTest() {
        deque.add("Pedro");
        deque.add("Jose");
        deque.add("Maria");

        String expectedLast = "Maria";
        String actualLast = deque.getLast();

        Assert.assertEquals(expectedLast, actualLast);
    }
}
