package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class HashMapTest {
    @Test
    public void mapSizeTest(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(6, 7);
        map.put(8, 9);

        Assert.assertEquals(2, map.size());
    }

    @Test
    public void putTest() {
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("Color", "Red");

        Assert.assertFalse(hashMap.isEmpty());
    }
}
