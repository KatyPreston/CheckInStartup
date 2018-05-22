import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {
    Airport airport;

    @Before
    public void before(){
        airport = new Airport(0);
    }


    @Test
    public void canGetMoney(){
        assertEquals(0, airport.getMoney(), 0.1);
    }
}
