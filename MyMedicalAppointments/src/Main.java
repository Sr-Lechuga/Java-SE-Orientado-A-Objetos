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


        Patient patient = new Patient("Alejandra", "alejandra@gmail.com");
        Patient patient1 = new Patient("Anahi", "anahi@gmail.com");
        /*Objects live in heap memory
        * Only the memory direction is saves in stack memory*/

        System.out.println("\n \n" + patient.getName());
        System.out.println(patient1.getName());
        patient1 = patient;
        /*Asignate the same memory direction of patient to patient1*/

        System.out.println(patient.getName());
        System.out.println(patient1.getName());

        patient1.setName("Manuel");
        /*Asignation of objects make that any change that occurs in one, occurs in the other
        * Since they both are pointing at the same structure in memory*/
        System.out.println(patient.getName());
        System.out.println(patient1.getName());

        /*patient.setWeight(54.6);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("123456789");
        System.out.println(patient.getPhoneNumber());*/
    }
}

