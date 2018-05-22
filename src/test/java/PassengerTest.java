import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;
    Flight flight;

    @Before
    public void before(){
        passenger = new Passenger(10);
    }

    @Test
    public void canGetMoney(){
        assertEquals(10, passenger.getMoney(), 0.1);
    }

    @Test
    public void canPayMoney(){
        passenger.payMoney(5);
        assertEquals(5, passenger.getMoney(), 0.1);
    }




}
