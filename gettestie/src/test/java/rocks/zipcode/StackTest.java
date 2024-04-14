package rocks.zipcode;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class StackTest {
    @Test
    public void stackTest1() {
        Stack<String> stack1 = new Stack<>();
        stack1.push("Good afternoon");
        assertEquals(false, stack1.isEmpty()); // false
    }

    @Test
    public void stackTest2() {
        Stack<String> stack2 = new Stack<>();
        stack2.push("afternoon");
        stack2.pop();
        assertEquals(true, stack2.isEmpty());

    }
}
