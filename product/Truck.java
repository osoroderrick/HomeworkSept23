package product;

public class Truck extends Vehicle{


    public Truck(String name, int qty, double price, float speed, Engine engine) {
        super(name, qty, price, speed, engine);
    }

    @Override
    public void totalAfterTax(Vehicle truck) {
        System.out.println(totalBeforeTax(truck) + calTax(truck));
    }

    @Override
    public double totalBeforeTax(Vehicle truck) {
        return super.totalBeforeTax(truck);
    }

    @Override
    public double calTax(Vehicle truck) {
        return super.calTax(truck);
    }

    public void printVehicleName(){
        System.out.println();
    }




}
