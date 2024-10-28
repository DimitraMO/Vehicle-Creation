//ΟΝΟΜΑΤΕΠΩΜΥΜΟ: ΜΩΡΑΪΤΗ ΔΗΜΗΤΡΑ
//Α.Μ: 3119104
package testvehicle;

abstract class Vehicle {

    private Driver vehicleDriver;
    private String VehicleID;
    private int maxSpeed;
    private int curSpeed;

    public Vehicle(Driver vehicleDriver, String VehicleID, int maxSpeed, int curSpeed) {
        this.vehicleDriver = vehicleDriver;
        this.VehicleID = VehicleID;
        this.maxSpeed = maxSpeed;
        this.curSpeed = curSpeed;
    }

    public void setVehicleDriver(Driver vehicleDriver) {
        this.vehicleDriver = vehicleDriver;
    }

    public void setVehicleID(String VehicleID) {
        this.VehicleID = VehicleID;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setCurSpeed(int curSpeed) {
        this.curSpeed = curSpeed;
    }

    public Driver getVehicleDriver() {
        return vehicleDriver;
    }

    public String getVehicleID() {
        return VehicleID;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurSpeed() {
        return curSpeed;
    }

    @Override
    public String toString() {
        return "\n" + vehicleDriver + "\nThe vehicle's ID is: " + VehicleID + "\nThe vehicle's maximum speed is:" + maxSpeed + " km/h\nThe vehicle's current speed is: " + curSpeed + " km/h";
    }

    public int accelerate(int a) {
        this.curSpeed += a;
        return this.curSpeed;
    }

    public int brake(int b) {
        this.curSpeed -= b;
        return this.curSpeed;
    }
}
