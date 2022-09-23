package product;

public class Engine {

    public Engine(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    private int numberOfCylinders;

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }
}
