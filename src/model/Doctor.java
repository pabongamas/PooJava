package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends  User{
    /**
     * si la variable esta con static podemos obtener el valor desde cualquier clase y si este se modifica va conservar ese valor
     * si no lo es , cada instancia de la clase hacia esa variable no va modificar ni a conservar ese valor
     * el ejemplo de aca era que al hacer static el id podemos modificarlos desde otra clase y va conservar ese valor
     * */

    private String especiality;
    private ArrayList<AvailableAppointment> availableAppointments=new ArrayList<>();

    public Doctor(String name, String email){
        super(name,email);
        this.especiality=especiality;
       /** System.out.println("el nombre del doctor es "+name);*/
    }

    public String getEspeciality() {
        return especiality;
    }

    public void setEspeciality(String especiality) {
        this.especiality = especiality;
    }


    //comportamientos


    public void addAvailableAppointment(String date,String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Speciality: "+especiality+" \nAvailable: "+availableAppointments.toString();
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        public AvailableAppointment(String date,String time){
            try {
                this.date=format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time=time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }
        public String getDate() {
            return format.format(date);
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
            return "Available Appointments \nDate: "+date+"\nTime: "+time;
        }
    }

}
