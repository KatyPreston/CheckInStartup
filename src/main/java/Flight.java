import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengerList;
    private ArrayList<Bag> bagList;
    private int maxLuggageCapacity;
    private int totalBagWeight;
    private int maxPassengers;

    public Flight(int maxLuggageCapacity, int maxPassengers){
        this.passengerList = new ArrayList<>();
        this.bagList = new ArrayList<>();
        this.maxLuggageCapacity = maxLuggageCapacity;
        this.maxPassengers = maxPassengers;
    }


    public void checkInPassenger(Passenger passenger) {
        if(maxPassengers > this.countPassengerList()) {
            this.passengerList.add(passenger);
        }
    }

    public int countPassengerList() {
       return this.passengerList.size();
    }

    public void checkInBag(Bag bag) {
        if(this.maxLuggageCapacity >= this.totalBagWeight() + bag.getWeight()) {
            this.bagList.add(bag);
        }
    }

    public int countBagList() {
        return this.bagList.size();
    }

    public void removePassenger(Passenger passenger){
        passengerList.remove(passenger);
    }

    public void removeAllPassengers() {
        this.passengerList.clear();
    }

    public void removeAllBags() {
        this.bagList.clear();
    }

    public void removeBag(Bag bag) {
        this.bagList.remove(bag);
    }

    public void removePassengerWithBag(Passenger passenger, Bag bag){
         this.removePassenger(passenger);
         this.removeBag(bag);
    }

    public int getMaxLuggageCapacity() {
        return this.maxLuggageCapacity;
    }

    public int getMaxPassengers() {
        return this.maxPassengers;
    }

    public int totalBagWeight() {
        totalBagWeight = 0;
        for(Bag bag : this.bagList){
            totalBagWeight += bag.getWeight();
        }
        return totalBagWeight;
    }

    public String takeOff(){
        return "Whooooosh!!";
    }
}
