//ΟΝΟΜΑΤΕΠΩΜΥΜΟ: ΜΩΡΑΪΤΗ ΔΗΜΗΤΡΑ
//Α.Μ: 3119104
package testvehicle;

public class Driver {

    private String name;
    private String surname;
    private int DriverID; //ΕΠΙΠΛΕΟΝ ΜΕΤΑΒΛΗΤΗ ΓΙΑ ΤΗΝ ΕΠΙΛΥΣΗ ΤΟΥ ΕΡΩΤΗΜΑΤΟΣ e.

    public Driver(String name, String surname, int DriverID) {
        this.name = name;
        this.surname = surname;
        this.DriverID = DriverID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setDriverID(int DriverID) {
        this.DriverID = DriverID;
    }

    public int getDriverID() {
        return DriverID;
    }

    @Override
    public String toString() {
        return "The driver's name and surname is: " + name + " " + surname;
    }

}
