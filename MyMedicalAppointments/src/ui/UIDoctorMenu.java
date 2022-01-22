package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu(){
        int response;
        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome: " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My Scheduled Appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = sc.nextByte();

            switch (response){
                case 1:
                    showAvailableAppointmentMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }
        }while (response != 0);
    }

    private static void showAvailableAppointmentMenu(){
        int response;
        do{
            System.out.println("\n");
            System.out.println(":: Add Available Appointment");
            System.out.println(":: Select a Month");
            for (int i = 0; i < 3; i++) {
                int j = i +1;
                System.out.println(j + "." + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if(response > 0 && response <4){
                //1,2,3
                int monthSelected = response;//Change name to be more descriptive
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected-1]);
                System.out.println("Insert the date available: [dd/mm/yyyy]");

                String date = sc.nextLine();

                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if (responseDate == 2) continue;//Keep on cycle, but jump over next lines

                int responseTime ;
                String time;
                do {
                    System.out.println("Insert the time available for date: " + date +
                            " [hh:mm]");
                    time = sc.nextLine();

                    System.out.println("Your time is: " + time + "\n 1. Correct \n 2. Change time");
                    responseTime = Integer.valueOf(sc.nextLine());
                }while (responseTime == 2);
                //If responseTime is 2 (Change time) it keeps on cycle for time selection, but keep date unchanged

                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);
            }else if (response == 0){
                showDoctorMenu();
            }
        }while (response != 0);
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppointments().size() > 0
            && !doctorsAvailableAppointments.contains(doctor)) {
            //it should be added only one time
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
