import java.util.Date;

import static  ui.UiMenu.*;

public class Main {
    public static void main(String[] args) {
       /** Doctor myDoctor=new Doctor();
        myDoctor.name="jhon jairo";
        myDoctor.showName();
        myDoctor.showId();
        //System.out.println(Doctor.id);

        //Doctor.id++;

        Doctor myDoctorAnn=new Doctor();
        myDoctor.showId();
        //System.out.println(Doctor.id);*/

        //showMenu();
        Doctor mydoctor=new Doctor("JHON PABON","pabongamamas@gmail.com");
        mydoctor.addAvailableAppointment(new Date(),"4pm");
        mydoctor.addAvailableAppointment(new Date(),"12pm");
        mydoctor.addAvailableAppointment(new Date(),"1pm");
        System.out.println(mydoctor.getAvailableAppointments());
        /*
        for (Doctor.AvailableAppointment aA:mydoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate()+" "+aA.getTime());
        }*/
        System.out.println(mydoctor);

        /**System.out.println(mydoctor.name);
        System.out.println(mydoctor.especiality);*/

        Patient patient=new Patient("mafernanda","mafe@gmail.com");
        System.out.println(patient);
        patient.setWeight(70);
        patient.setPhoneNumber("12312311");
        System.out.println(patient.getPhoneNumber());
        System.out.println(patient.getName());
        System.out.println(patient.getWeight());

    }

}