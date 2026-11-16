
public class Main {

    public static void main(String[] args) {

        // Create a Moped
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setNumberOfPassengers(2);
        slowRide.setCargoCapacity(50);

        // Create a Car
        Car familyCar = new Car();
        familyCar.setColor("Blue");
        familyCar.setFuelCapacity(15);
        familyCar.setNumberOfPassengers(5);
        familyCar.setCargoCapacity(500);

        // Create a SemiTruck
        SemiTruck bigTruck = new SemiTruck();
        bigTruck.setColor("White");
        bigTruck.setFuelCapacity(200);
        bigTruck.setNumberOfPassengers(2);
        bigTruck.setCargoCapacity(20000);

        // Create a Hovercraft
        Hovercraft airBoat = new Hovercraft();
        airBoat.setColor("Black");
        airBoat.setFuelCapacity(100);
        airBoat.setNumberOfPassengers(8);
        airBoat.setCargoCapacity(1000);

        // Print vehicle information
        System.out.println("Moped: " + slowRide.getColor());
        System.out.println("Fuel Capacity: " + slowRide.getFuelCapacity());

        System.out.println("\nCar: " + familyCar.getColor());
        System.out.println("Passengers: " + familyCar.getNumberOfPassengers());

        System.out.println("\nSemiTruck: " + bigTruck.getColor());
        System.out.println("Cargo Capacity: " + bigTruck.getCargoCapacity());

        System.out.println("\nHovercraft: " + airBoat.getColor());
        System.out.println("Passengers: " + airBoat.getNumberOfPassengers());
    }
}
