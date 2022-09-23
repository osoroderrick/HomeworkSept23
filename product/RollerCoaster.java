package product;

public class RollerCoaster implements RideAble{
    private String name;
    private int qty;
    private double price;
    private float speed;
    private double tax = 0.2;

    public RollerCoaster(String name, int qty, double price, float speed) {
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.speed = speed;
    }

    @Override
    public int milesPerHour() {
        return (int) this.speed;
    }

    public double totalBeforeTax(){
        return this.price * this.tax;
    }


    public double calTax(){
        return this.price * this.tax;
    }
    public void totalAfterTax(){
        System.out.println( calTax() + totalBeforeTax());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }


}
