import com.intellij.openapi.util.Pass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight, flight2;
    Passenger passenger;
    Bag bag;

    @Before
    public void before(){
        flight = new Flight(500, 2);
        passenger = new Passenger();
        bag = new Bag(20);
    }

    @Test
    public void canGetMaxLuggageCapacity(){
        assertEquals(500, flight.getMaxLuggageCapacity());
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
    public void canGetTotalBagWeight(){
        flight.checkInBag(bag);
        flight.checkInBag(bag);
        flight.checkInBag(bag);
        assertEquals(60, flight.totalBagWeight());
    }

    @Test
    public void cannotAddOverLuggageCapacity(){
        flight2 = new Flight(50, 40);
        flight2.checkInBag(bag);
        flight2.checkInBag(bag);
        flight2.checkInBag(bag);
        assertEquals(40, flight2.totalBagWeight());
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
    public void canRemoveBag(){
        flight.checkInBag(bag);
        flight.removeBag(bag);
        assertEquals(0, flight.countBagList());
    }

    @Test
    public void canRemoveAllPassengers(){
        flight.checkInPassenger(passenger);
        flight.removeAllPassengers();
        assertEquals(0, flight.countPassengerList());
    }

    @Test
    public void canRemoveAllBags(){
        flight.checkInBag(bag);
        flight.removeAllBags();
        assertEquals(0, flight.countBagList());
    }

    @Test
    public void canRemovePassengerWithBag(){
        flight.checkInBag(bag);
        flight.checkInPassenger(passenger);
        flight.removePassengerWithBag(passenger, bag);
        assertEquals(0, flight.countPassengerList());
        assertEquals(0, flight.countBagList());
    }

    @Test
    public void canGetMaxPassengers(){
        assertEquals(2, flight.getMaxPassengers());
    }

    @Test
    public void canNotAddMoreThanMaxPassengers(){
        flight.checkInPassenger(passenger);
        flight.checkInPassenger(passenger);
        flight.checkInPassenger(passenger);
        assertEquals(2, flight.countPassengerList());
    }

    @Test
    public void canTakeOff(){
        assertEquals("Whooooosh!!", flight.takeOff());
    }



    //Can add 1k passengers to flight

}
