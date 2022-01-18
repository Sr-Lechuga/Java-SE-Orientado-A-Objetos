import model.*;

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

        /*It makes a "custom" User. It means that the methods available for User, are overwritten as we please.
        * It has a short lifetime*/
        User userTest = new User("Daniel","dani@daniel.com") {
            @Override
            public void showDataUser() {
                System.out.println("\n\n");
                System.out.println("Doctor");
                System.out.println("Works in hospital Blue Cross");
                System.out.println("Department: Nourishing");
            }
        };

        userTest.showDataUser();

        /*Also work with Interfaces*/
        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };
    }
}

