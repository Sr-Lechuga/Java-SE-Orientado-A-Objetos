package model;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable{
    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    public AppointmentDoctor(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getTime() {
        return time + " hrs.";
    }
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    /*This will be the main road to set  time, in constructor of appointment with doctor
    * you only set the pair of patient-doctor*/
    public void schedule(Date date, String time) {
        this.date = date;
        this.time = time;
    }
}
