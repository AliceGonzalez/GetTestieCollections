package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class VectorTest {
    Vector<Integer> vector = new Vector<Integer>();
    @Test
    public void testremoveAll() {
        vector.add(1);
        vector.add(2);

        System.out.println("Vector: " + vector);

    }
    @Test
    public void testAdd()
    {
        Integer expected = 2;

        vector.add(3);
        vector.add(42);

        Integer actual = vector.size();

        Assert.assertEquals(expected, actual);
    }

}
