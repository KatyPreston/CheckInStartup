import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengerList;
    private ArrayList<Bag> bagList;

    public Flight(){
        this.passengerList = new ArrayList<>();
        this.bagList = new ArrayList<>();
    }



    public void checkInPassenger(Passenger passenger) {
        this.passengerList.add(passenger);
    }

    public int countPassengerList() {
       return this.passengerList.size();
    }

    public void checkInBag(Bag bag) {
        this.bagList.add(bag);
    }


    public int countBagList() {
        return this.bagList.size();
    }

    public void removePassenger(Passenger passenger){
        passengerList.remove(passenger);
    }
}
