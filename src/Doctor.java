public class Doctor {
    /**
     * si la variable esta con static podemos obtener el valor desde cualquier clase y si este se modifica va conservar ese valor
     * si no lo es , cada instancia de la clase hacia esa variable no va modificar ni a conservar ese valor
     * el ejemplo de aca era que al hacer static el id podemos modificarlos desde otra clase y va conservar ese valor
     * */
    static int id=0;
    String name;
    String email;
    String especiality;

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

}
