package product;

public class Bike extends Vehicle implements RideAble{


    public Bike(String name, int qty, double price, float speed) {
        super(name, qty, price, speed);
    }

    @Override
    public void totalAfterTax(Vehicle bike) {
        System.out.println(totalBeforeTax(bike) + calTax(bike));
    }

    @Override
    public double totalBeforeTax(Vehicle bike) {
        return super.totalBeforeTax(bike);
    }

    @Override
    public double calTax(Vehicle bike) {
        return super.calTax(bike);
    }

    @Override
    public int milesPerHour() {
        return (int) this.getSpeed();
    }
}
