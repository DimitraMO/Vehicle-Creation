//ΟΝΟΜΑΤΕΠΩΜΥΜΟ: ΜΩΡΑΪΤΗ ΔΗΜΗΤΡΑ
//Α.Μ: 3119104
package testvehicle;

public class Car extends Vehicle implements VehicleSpeed {

    private String model;

    public Car(Driver vehicleDriver, String VehicleID, int maxSpeed, int curSpeed, String model) {
        super(vehicleDriver, VehicleID, maxSpeed, curSpeed);
        this.model = model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "" + super.toString() + "\nThe car's model is: " + model;
    }

    @Override
    public int accelerate(int a) {
        return super.accelerate(a);
    }

    @Override
    public int brake(int b) {
        return super.brake(b);
    }

    @Override
    public String checkspeed() {
        if (super.getCurSpeed() <= 130) {
            return "Αποδεκτη ταχυτητα!";
        } else {
            return "Μη αποδεκτη ταχυτητα!";
        }
    }

}
