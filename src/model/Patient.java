package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends  User{
   
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<ApointmentDoctor> apointmentDoctors=new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses=new ArrayList<>();

    public ArrayList<ApointmentDoctor> getApointmentDoctors() {
        return apointmentDoctors;
    }

    public void addApointmentDoctors(Doctor doctor, Date date , String time) {
        ApointmentDoctor apointmentDoctor=new ApointmentDoctor(this,doctor);
        apointmentDoctor.schedule(date,time);
        apointmentDoctors.add(apointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return this.weight+" kg.";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return this.height+" Mts.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public Patient(String name, String email){
        super(name,email);
    }

    @Override
    public String toString() {
        return super.toString()+" Age: "+birthday+" weight "+getWeight()+" altura "+getHeight()+" blood "+blood;
    }
}
