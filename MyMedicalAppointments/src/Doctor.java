import javax.print.Doc;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    private String speciality;

    Doctor(String name, String email){
        super(name,email);
        System.out.println("The name of the assigned Doctor is: " + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Behaviors

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void  addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable " + availableAppointments.toString();
    }

    public static class AvailableAppointment{
        private  int id;
        private Date date;
        private String time;
        /*Since the appointments only exist if a doctor exists, and it only exists for doctor to use
        * we use an internal class*/

        /*We use them, when we need a complex entity related to the object, and it's existence
        * depends on the existence of the object. A weak entity*/

        /*Note that static internal classes, doesn't need to be instanced*/

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

        @Override
        public String toString() {
            return "Available Appointment \nDate: " + date + "\nTime: " + time;
        }
    }
}
