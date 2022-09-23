package homework2;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(2,4,8);
        Case case1 = new Case("strength","patience","outlet",dimensions);
        Motherboard motherboard = new Motherboard("gorilla","sprint", 5,9,"nonfiction");
        Resolution resolution = new Resolution(5,6);
        Monitor monitor = new Monitor("gigabyte","byte",resolution);
        PC pc1 = new PC(case1,motherboard,monitor);

        pc1.description();
        pc1.powerUp();



    }
}
