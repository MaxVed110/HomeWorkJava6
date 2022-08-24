package parkingsystem;

public class Main {
    public static void main(String[] args) {
        ParkingSystem parking = new ParkingSystem(1, 2, 1);
        System.out.println(parking.addCar(1));
        System.out.println(parking.addCar(1));
        System.out.println(parking.addCar(2));
        System.out.println(parking.addCar(2));
    }
}
