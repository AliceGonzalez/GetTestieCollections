package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class TreeMapTest {
    @Test
    public void addTest() {
        Map<String, Integer> treeMap = new TreeMap<>();
        int expected = 3;

        treeMap.put("Landon", 1);
        treeMap.put("Carlos", 3);
        treeMap.put("Bendon", 2);

        int actual = treeMap.get("Carlos");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lastKeyTest() {
        TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();


        treemap.put(1, "Book");
        treemap.put(2, "Pencil");
        treemap.put(3, "Eraser");
        treemap.put(4, "Paper");

        int actual = treemap.lastKey();
        int expected = 4;
        Assert.assertEquals(expected, actual);

    }
}
