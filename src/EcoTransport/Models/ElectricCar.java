package EcoTransport.Models;


public class ElectricCar {

    private double batteryCapacity, range;

    public ElectricCar(String ownerName, String vehicleType, String registrationNumber, double batteryCapacity, double range) {
        super();
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }


    @Override
    public String toString() {
        return super.toString() + ", Electric Car " + "Battery Capacity: " + batteryCapacity + " kWh," + "Range: " + range + "km";


    }
}
