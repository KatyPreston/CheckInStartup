import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagTest {
    Bag bag;

    @Before
    public void before(){
        bag = new Bag(20);
    }

    @Test
    public void canGetWeight(){
        assertEquals(20, bag.getWeight());
    }
}
