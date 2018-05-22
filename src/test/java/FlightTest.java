import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Passenger passenger;
    Bag bag;

    @Before
    public void before(){
        flight = new Flight();
        passenger = new Passenger();
        bag = new Bag();
    }

    @Test
    public void canCountBagList(){
        assertEquals(0, flight.countBagList());
    }

    @Test
    public void canCountPassengerList() {
        assertEquals(0, flight.countPassengerList());
    }

    @Test
    public void canCheckInPassengerToFlight(){
        flight.checkInPassenger(passenger);
        assertEquals(1, flight.countPassengerList());
    }
    @Test
    public void canAddBagToFlight(){
        flight.checkInBag(bag);
        assertEquals(1, flight.countBagList() );
    }

    @Test
    public void canRemovePassenger(){
        flight.checkInPassenger(passenger);
        flight.removePassenger(passenger);
        assertEquals(0, flight.countPassengerList());
    }

    @Test
    public void cantRemovePassengerNonExistant(){
        flight.checkInPassenger(passenger);
        flight.removePassenger(new Passenger());
        assertEquals(1, flight.countPassengerList());
    }

    @Test
    public void canRemoveAllPassengers(){
        
    }



    //Can add 1k passengers to flight

}
