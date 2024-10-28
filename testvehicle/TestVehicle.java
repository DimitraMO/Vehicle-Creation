//ΟΝΟΜΑΤΕΠΩΜΥΜΟ: ΜΩΡΑΪΤΗ ΔΗΜΗΤΡΑ
//Α.Μ: 3119104
package testvehicle;

import java.util.Scanner;

public class TestVehicle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            //ΓΙΑ ΤΗΝ ΔΗΜΙΟΥΡΓΙΑ ΤΟΥ 1ου ΑΥΤΟΚΙΝΗΤΟΥ
            //ΚΑΙ ΓΙΑ ΤΗΝ ΕΙΣΟΔΟ ΤΩΝ ΣΤΟΙΧΕΙΩΝ ΤΟΥ ΟΔΗΓΟΥ ΑΠΟ ΤΟ ΠΛΗΚΤΡΟΛΟΓΙΟ ΕΧΟΥΜΕ:
            System.out.println("First car's driver name: ");
            String n1 = in.next();
            System.out.println("First car's driver surname: ");
            String s1 = in.next();
            System.out.println("Give the first car driver's ID: ");
            int dId1 = in.nextInt(); //ΟΠΟΥ dID --> driversID
            System.out.println("First car's vehicle ID: ");
            String ID1 = in.next();

            //ΔΗΜΙΟΥΡΓΟΥΜΕ ΑΝΤΙΚΕΙΜΕΝΟ ΤΥΠΟΥ driver ΠΟΥ ΔΕΧΕΤΑΙ ΩΣ ΟΡΙΣΜΑΤΑ ΤΑ 2 ΑΠΟ ΤΑ 3 ΣΤΟΙΧΕΙΑ 
            //(n1, s1) ΤΟΥ ΟΔΗΓΟΥ ΠΟΥ ΘΑ ΔΙΝΕΙ Ο ΧΡΗΣΤΗΣ ΑΠΟ ΤΟ ΠΛΗΚΤΡΟΛΟΓΙΟ, ΤΟ ΟΠΟΙΟ ΚΑΙ ΘΑ
            //ΧΡΗΣΙΜΟΠΟΙΗΣΟΥΜΕ ΓΙΑ ΤΗΝ ΔΗΜΙΟΥΡΓΙΑ ΤΟΥ ΑΝΤΙΚΕΙΜΕΝΟΥ ΤΥΠΟΥ car 
            Driver d1 = new Driver(n1, s1, dId1);

            //ΔΗΜΙΟΥΡΓΟΥΜΕ ΑΝΤΙΚΕΙΜΕΝΟ ΤΥΠΟΥ cs (δηλαδη curpeed) ΤΟ ΟΠΟΙΟ ΘΑ ΔΕΧΕΤΑΙ ΜΙΑ ΤΥΧΑΙΑ 
            //ΑΚΕΡΑΙΑ (int) ΤΙΜΗ ΜΕΤΑΞΥ ΤΩΝ ΤΙΜΩΝ [10,150] ΚΑΙ ΤΟ ΟΠΟΙΟ ΘΑ ΑΝΤΙΠΡΟΣΩΠΕΥΕΙ ΜΙΑ ΤΥΧΑΙΑ ΤΑΧΥΤΗΤΑ ΓΙΑ ΤΗΝ ΤΡΕΧΟΥΣΑ ΤΑΧΥΤΗΤΑ 
            int cs1 = (int) (Math.random() * 141 + 10);

            //ΔΗΜΙΟΥΡΓΙΑ ΤΟΥ ΑΝΤΙΚΕΙΜΕΝΟΥ car
            Car car1 = new Car(d1, ID1, 200, cs1, "BMW");

            //ΕΚΤΥΠΩΣΗ ΤΟΥ ΑΝΤΙΚΕΙΜΕΝΟΥ ΣΤΗΝ ΟΘΟΝΗ
            System.out.println(car1);

            //ΓΙΑ ΤΗΝ ΔΗΜΙΟΥΡΓΙΑ ΤΟΥ 2ου ΑΥΤΟΚΙΝΗΤΟΥ ΚΑΙ ΟΜΟΙΑ ΜΕ ΤΑ ΠΑΡΑΠΑΝΩ ΕΧΟΥΜΕ 
            System.out.println("\n\nSecond car's driver name: ");
            String n2 = in.next();
            System.out.println("Second car's driver surname:  ");
            String s2 = in.next();
            System.out.println("Give the second car driver's ID: ");
            int dId2 = in.nextInt();
            System.out.println("Second car's ID:  ");
            String ID2 = in.next();

            Driver d2 = new Driver(n2, s2, dId2);
            int cs2 = (int) (Math.random() * 141 + 10);
            Car car2 = new Car(d2, ID2, 250, cs2, "Audi");

            System.out.println("\n" + car2);

            //ΓΙΑ ΤΗΝ ΔΗΜΙΟΥΡΓΙΑ ΤΟΥ 1ου ΦΟΡΤΗΓΟΥ
            System.out.println("\nFirst truck's driver name: ");
            String n3 = in.next();
            System.out.println("First truck's driver surname:  ");
            String s3 = in.next();
            System.out.println("Give the first truck driver's ID: ");
            int dId3 = in.nextInt();
            System.out.println("First truck's ID: ");
            String ID3 = in.next();

            Driver d3 = new Driver(n3, s3, dId3);
            int cs3 = (int) (Math.random() * 141 + 10);
            Truck t1 = new Truck(d3, ID3, 300, cs3, 15, 450);

            System.out.println("\n" + t1);

            //ΓΙΑ ΤΗΝ ΔΗΜΙΟΥΡΓΙΑ ΤΟΥ 2ου ΦΟΡΤΗΓΟΥ
            System.out.println("\nSecond truck's driver name: ");
            String n4 = in.next();
            System.out.println("Second truck's driver surname: ");
            String s4 = in.next();
            System.out.println("Give the second truck driver's ID: ");
            int dId4 = in.nextInt();
            System.out.println("Second truck's ID: ");
            String ID4 = in.next();

            Driver d4 = new Driver(n4, s4, dId4);
            int cs4 = (int) (Math.random() * 141 + 10);
            Truck t2 = new Truck(d4, ID4, 300, cs4, 15, 450);

            System.out.println("\n" + t2 + "\n");

            //ΑΥΞΗΣΗ ΚΑΙ ΜΕΙΩΣΗ ΤΗΣ ΤΥΧΑΙΑΣ ΤΑΧΥΤΗΤΑΣ ΤΩΝ ΑΥΤΟΚΙΝΗΤΩΝ
            car1.accelerate(60);
            car2.accelerate(60);

            car1.brake(20);
            car2.brake(20);

            //ΑΥΞΗΣΗ ΚΑΙ ΜΕΙΩΣΗ ΤΗΣ ΤΥΧΑΙΑΣ ΤΑΧΥΤΗΤΑΣ ΤΩΝ ΦΟΡΤΗΓΩΝ
            t1.accelerate(30);
            t2.accelerate(30);

            t1.brake(10);
            t2.brake(10);

            //ΕΛΕΓΧΟΣ ΤΑΧΥΤΗΤΑΣ ΑΥΤΟΚΙΝΗΤΩΝ
            car1.checkspeed();
            car2.checkspeed();

            //ΕΛΕΓΧΟΣ ΤΑΧΥΤΗΤΑΣ ΦΟΡΤΗΓΩΝ 
            t1.checkspeed();
            t2.checkspeed();

            //ΕΛΕΓΧΟΣ ΤΑΧΥΤΗΤΑΣ ΑΥΤΟΚΙΝΗΤΩΝ
            System.out.println("From the speed's check occurs that the 1st car's speed is: " + car1.getCurSpeed() + " km/h");
            System.out.println(car1.checkspeed());

            System.out.println("From the speed's check occurs that the 2nd car's speed is: " + car2.getCurSpeed() + " km/h");
            System.out.println(car2.checkspeed());

            //ΕΛΕΓΧΟΣ ΤΑΧΥΤΗΤΑΣ ΦΟΡΤΗΓΩΝ
            System.out.println("From the speed's check occurs that the 1st truck's speed is: " + t1.getCurSpeed() + " km/h");
            System.out.println(t1.checkspeed());

            System.out.println("From the speed's check occus that the 2nd truck's speed is: " + t2.getCurSpeed() + " km/h");
            System.out.println(t2.checkspeed());

            //ΕΛΕΓΧΟΣ ΓΙΑ ΤΟ ΑΝ ΚΑΠΟΙΟΣ ΟΔΗΓΟΣ ΟΔΗΓΕΙ ΠΑΡΑΠΑΝΩ ΑΠΟ 2 ΟΧΗΜΑΤΑ
            if ((dId1 == dId2) && (dId1 == dId3) && (dId1 == dId4)) {
                System.out.println("\nThe driver with ID " + dId1 + " drives 4 vehicle's(all 4 vehicle's)!");
            } else if ((dId1 == dId2) && (dId1 == dId3)) {
                System.out.println("\nThe driver with ID " + dId1 + " drives 3 vehicle's!");
            } else if ((dId1 == dId2) && (dId2 == dId4)) {
                System.out.println("\nThe driver with ID " + dId1 + " drives 3 vehicle's!");
            } else if ((dId1 == dId3) && (dId1 == dId4)) {
                System.out.println("\nThe driver with ID " + dId1 + " drives 3 vehicle's!");
            } else if ((dId2 == dId3) && (dId2 == dId4)) {
                System.out.println("\nThe driver with ID " + dId2 + " drives 3 vehicle's!");
            }

        } catch (Exception e) {
            System.out.println("Invalid input! " + e);
        }

    }

}
