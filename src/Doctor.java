import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    /**
     * si la variable esta con static podemos obtener el valor desde cualquier clase y si este se modifica va conservar ese valor
     * si no lo es , cada instancia de la clase hacia esa variable no va modificar ni a conservar ese valor
     * el ejemplo de aca era que al hacer static el id podemos modificarlos desde otra clase y va conservar ese valor
     * */
    static int id=0;
    private String name;
    private String email;
    private String especiality;



    Doctor(){
        System.out.println("construyendo el objeto doctor");
        //id++;
    }
    Doctor(String name,String especiality){
        id++;
        this.name=name;
        this.especiality=especiality;
        System.out.println("el nombre del doctor es "+name);
    }
    //comportamientos
    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: "+id);
    }


    ArrayList<AvailableAppointment> availableAppointments=new ArrayList<>();
    public void addAvailableAppointment(Date date,String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        public AvailableAppointment(Date date,String time){
            this.date=date;
            this.time=time;
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
