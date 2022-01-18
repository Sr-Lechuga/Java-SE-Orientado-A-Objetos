import model.Doctor;
import model.Nurse;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();


        Doctor myDoctor = new Doctor("Anahi", "anahi@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()){
            System.out.println(availableAppointment.getDate() + " "
                + availableAppointment.getTime());
        }
        System.out.println("\n\n" + myDoctor);

        int i = 0;
        int b = i;
        //b = 0;
        /*Primitives lives in stack memory*/

        System.out.println("\n\n");
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");

        System.out.println(patient);

        System.out.println("\n\n");
        /*It is possible to create different object from an abstract class. Changing assignation, different inherited
        * objects will be created. And different behaviors will be seen in the method showDataUser*/
        User user = new Nurse("Daniel","daniel@daniel.com");

        user.showDataUser();
    }
}

