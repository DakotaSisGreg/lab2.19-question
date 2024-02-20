package EcoTransport.Models;



public class Bicycle {


    private boolean hasGears;
    private int gearCount;

    public Bicycle(String ownerName, String vehicleType, String registrationNumber, boolean hasGears, int gearCount) {
        super();
        this.hasGears = hasGears;
        this.gearCount = gearCount;
    }


    @Override
    public String toString() {
        return super.toString() + ", Bike has gears: " + hasGears + ", Gear Count: " + gearCount;
    }
}
