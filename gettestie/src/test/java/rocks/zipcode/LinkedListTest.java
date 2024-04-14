package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class LinkedListTest {
    LinkedList<String> list = new LinkedList<>();
    @Test
    public void indexOfTest() {
        list.add("Sammy");
        list.add("Carly");

        Integer expectedIndex = 1;
        Integer actualIndex = list.indexOf("Carly");

        Assert.assertEquals(expectedIndex, actualIndex);
    }
    @Test
    public void removeTest() {
        List<String> list = new ArrayList<>();

        list.add("Terry");
        list.add("Sarah");

        list.remove(0);

        int actual = list.indexOf("Sarah");

        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}
