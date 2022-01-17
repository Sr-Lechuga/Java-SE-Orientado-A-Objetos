public class Doctor {
    static int id = 0;//Autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Building Doctor object");
        id++;
    }

    Doctor(String name){
        System.out.println("The name of the assigned Doctor is: " + name);
    }

    //Behaviors
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("Doctor ID: " + id);
    }
}
