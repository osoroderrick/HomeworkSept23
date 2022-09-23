package product;

public class Car extends Vehicle{


    public Car(String name, int qty, double price, float speed, Engine engine) {
        super(name, qty, price, speed, engine);
    }

    @Override
    public void totalAfterTax(Vehicle car) {
        System.out.println(calTax(car) + totalBeforeTax(car));
    }


    @Override
    public double totalBeforeTax(Vehicle car) {
        return super.totalBeforeTax(car);
    }

    @Override
    public double calTax(Vehicle car) {
        return super.calTax(car);
    }
}
