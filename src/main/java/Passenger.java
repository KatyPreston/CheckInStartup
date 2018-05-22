public class Passenger {
    private double money;

    public Passenger(double money){
        this.money = money;
    }


    public double getMoney() {
        return this.money;
    }

    public double payMoney(double fee){
        return this.money -= fee;
    }
}
