package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class TreeSetTest {
    TreeSet<Integer> set= new TreeSet<>();
    @Test
    public void firstTest() {
        set.add(4);
        set.add(1);
        set.add(7);

        Integer expectedValue = 1;
        Integer actualValue = set.first();

        Assert.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void lastTest() {
        set.add(1);
        set.add(2);
        set.add(3);

        Integer expectedValue = 3;
        Integer actualValue = set.last();

        Assert.assertEquals(expectedValue, actualValue);
    }

}
