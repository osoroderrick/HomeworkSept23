package product;

public class Horse extends Vehicle implements RideAble{


    public Horse(String name, int qty, double price, float speed) {
        super(name, qty, price, speed);
    }

    @Override
    public double totalBeforeTax(Vehicle horse) {
        return super.totalBeforeTax(horse);
    }

    @Override
    public double calTax(Vehicle horse) {
        return super.calTax(horse);
    }

    @Override
    public void totalAfterTax(Vehicle horse) {
        System.out.println(calTax(horse) + totalBeforeTax(horse));
    }

    @Override
    public int milesPerHour() {
        return (int) this.getSpeed();
    }


}
