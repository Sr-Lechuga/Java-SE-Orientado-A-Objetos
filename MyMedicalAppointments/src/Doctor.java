import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id = 0; //Autoincrement
    private String name;
    private String email;
    private String speciality;


    Doctor(){
        System.out.println("Building Doctor object");
    }

    Doctor(String name, String speciality){
        System.out.println("The name of the assigned Doctor is: " + name);
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    //Behaviors
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Doctor ID: " + id);
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void  addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private  int id;
        private Date date;
        private String time;
        /*Since the appointments only exist if a doctor exists and it only exists for doctor to use
        * we use an internal class*/

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
