package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class HashSetTest {
    HashSet<String> hashSet = new HashSet<>();
    @Test
    public void addTest() {
        hashSet.add("Luna");
        hashSet.add("Olly");

        boolean actualInHashset = hashSet.contains("Luna");

        Assert.assertTrue(actualInHashset);
        hashSet.clear();
    }

    @Test
    public void isEmptyTest() {
        hashSet.add("Mandy");
        hashSet.add("Freddy");

        hashSet.clear();
        boolean actualInHashset = hashSet.isEmpty();

        Assert.assertTrue(actualInHashset);
    }

}
