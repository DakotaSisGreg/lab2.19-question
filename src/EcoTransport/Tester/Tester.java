package EcoTransport.Tester;
import EcoTransport.Models.*;


public class Tester {

    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar("Alice", "Electric Car", "ECO123", 85.0, 250.0);
        Bicycle myBicycle = new Bicycle("Bob", "Bicycle", "BIC456", true, 18);
        ElectricScooter myElectricScooter = new ElectricScooter("Charlie", "Electric Scooter", "SCO789", 25.0, 150.0);

        System.out.println(myElectricCar);
        System.out.println(myBicycle);
        System.out.println(myElectricScooter);
    }
}
