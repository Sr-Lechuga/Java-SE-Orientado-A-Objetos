public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String email;
    String speciality;

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
}
