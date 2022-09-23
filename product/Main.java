package product;



public class Main {


    public static void main(String[] args) {

        Engine engine1 = new Engine(6);
        Engine engine2 = new Engine(10);
       Car car = new Car("Honda",1,30000,120f,engine1 );
       Horse horse = new Horse("Charlie", 1,20000,40f);
       Bike bike = new Bike("Ben", 1, 2000,25f);
       Truck truck = new Truck("Trevor", 1,120000,70f,engine2);

       RollerCoaster rollerCoaster = new RollerCoaster("Thriller",1,10,60f);


       Vehicle [] vehicles = {car,bike,horse,truck};
        for (Vehicle x : vehicles){
            System.out.println("Total Before Tax:");
            System.out.println(x.totalBeforeTax(vehicles[3]));
            System.out.println("Total After Tax:");
           x.totalAfterTax(vehicles[3]);
        }

        RideAble [] rideAbles = {bike,horse,rollerCoaster};


        VehicleApp.printVehicleName(vehicles);
        VehicleApp.getSpeedOfRideableObjects(rideAbles);

    }
}
