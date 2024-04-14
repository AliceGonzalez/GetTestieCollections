package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;
public class ComparableTest {
    @Test
    public void listEqualityTest(){
        List<String> expected = Arrays.asList("Milo", "Luna", "Olly");
        List<String> actual = new ArrayList<>(Arrays.asList("Milo", "Luna", "Olly"));

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void arraySortTest(){
      int[] actual =  new int[] {4,2,5,1,3};
      int[] expected = new int[] {1,2,3,4,5};

      Arrays.sort(actual);

      Assert.assertArrayEquals(expected,actual);

    }
}
