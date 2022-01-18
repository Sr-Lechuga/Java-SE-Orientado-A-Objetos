import javax.print.Doc;
import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Anahi", "Cardiologist");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        for (Doctor.AvailableAppointment availableAppointment : myDoctor.getAvailableAppointments()){
            System.out.println(availableAppointment.getDate() + " "
                + availableAppointment.getTime());
        }


        int i = 0;
        int b = 2;
        //b = 0;
        /*Primitives lives in stack memory*/

        System.out.println("\n\n");
        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");

        System.out.println(patient.toString());
    }
}

