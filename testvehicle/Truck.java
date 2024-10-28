//ΟΝΟΜΑΤΕΠΩΜΥΜΟ: ΜΩΡΑΪΤΗ ΔΗΜΗΤΡΑ
//Α.Μ: 3119104
package testvehicle;

public class Truck extends Vehicle implements VehicleSpeed {

    private int wheels;
    private int cargoSpace;

    public Truck(Driver vehicleDriver, String VehicleID, int maxSpeed, int curSpeed, int wheels, int cargoSpace) {
        super(vehicleDriver, VehicleID, maxSpeed, curSpeed);
        this.wheels = wheels;
        this.cargoSpace = cargoSpace;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setCargoSpace(int cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCargoSpace() {
        return cargoSpace;
    }

    @Override
    public String toString() {
        return "" + super.toString() + "\nThe dimention of the wheels is: " + wheels + " mm\nThe cargo space of the truck is: " + cargoSpace + " lt";
    }

    @Override
    public int accelerate(int h) { //h = high speed
        return super.accelerate(h);
    }

    @Override
    public int brake(int l) { //l= low speed
        return super.brake(l);
    }

    @Override
    public String checkspeed() {
        if (super.getCurSpeed() <= 90) {
            return "Αποδεκτη ταχυτητα!";
        } else {
            return "Μη αποδεκτη ταχυτητα!";
        }
    }

}
