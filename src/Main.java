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
        Doctor mydoctor=new Doctor("JHON PABON","PEDIATRA");
        System.out.println(mydoctor.name);
        System.out.println(mydoctor.especiality);

        Patient patient=new Patient("mafernanda","mafe@gmail.com");
        patient.setWeight(70);
        patient.setPhoneNumber("12312311");
        System.out.println(patient.getPhoneNumber());
        System.out.println(patient.getName());
        System.out.println(patient.getWeight());
    }

}