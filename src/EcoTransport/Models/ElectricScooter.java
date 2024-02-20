package EcoTransport.Models;

public class ElectricScooter {

    private double maxSpeed, weightCapacity;

    public ElectricScooter(String ownerName, String vehicleType, String registrationNumber, double maxSpeed, double weightCapacity) {
        super();
        this.maxSpeed = maxSpeed;
        this.weightCapacity = weightCapacity;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(double weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", Electric Scooter mac Speed: " + maxSpeed + "km/h, " + "Weight Limit: " + weightCapacity + "kg";
    }
}
