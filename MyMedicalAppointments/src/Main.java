import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        /*Instances of User cannot be created. But...*/
        User user = new Doctor("Anahi", "anahi@anahi.com") {
            @Override
            public int getId() {
                return super.getId();
            }
        };

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
    }
}

