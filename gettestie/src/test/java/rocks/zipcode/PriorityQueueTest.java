package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class PriorityQueueTest {
    @Test
    public void peekTest()
    {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        priorityQueue.add(87);
        priorityQueue.add(45);
        priorityQueue.add(4);

        int actual = priorityQueue.peek();
        Assert.assertEquals(4, actual);
    }

    @Test
    public void pollTest()
    {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

        priorityQueue.add(300);
        priorityQueue.add(5);
        priorityQueue.add(8);

        int actual = priorityQueue.poll();
        Assert.assertEquals(5, actual);
    }
}
