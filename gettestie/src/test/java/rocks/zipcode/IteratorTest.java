package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class IteratorTest {
    @Test
    public void iteratorTest() {

        ArrayList<Integer> iterator = new ArrayList<Integer>();
        iterator.add(10);
        iterator.add(3);
        iterator.add(54);

        Iterator <Integer> result = iterator.iterator();
        System.out.println(result.next());
    }

    @Test
    public void iteratorHasNextTest(){
        ArrayList<String> iteratorList = new ArrayList<>();
        Iterator<String> iterate;
        iteratorList.add("Wonder Woman");
        iteratorList.add("Super Man");
        iteratorList.add("Spider Man");
        iterate = iteratorList.iterator();

        Assert.assertTrue(iterate.hasNext());
    }
}
