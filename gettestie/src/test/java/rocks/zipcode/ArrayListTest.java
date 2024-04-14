package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class ArrayListTest {
    @Test
    public void isEmptyTest(){
        ArrayList<Integer> array = new ArrayList<Integer>();
        Assert.assertTrue(array.isEmpty());

    }

    @Test
    public void addTest(){
        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(3);
        array.add(5);

        Integer[] actual = array.toArray(new Integer[0]);
        Integer[] expected = {3,5};
        Assert.assertArrayEquals(expected, actual);

    }



}
