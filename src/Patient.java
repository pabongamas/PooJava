public class Patient extends  User{
   
    private String birthday;
    private double weight;
    private double height;
    private String blood;



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

    Patient(String name, String email){
        super(name,email);
    }

    @Override
    public String toString() {
        return super.toString()+" Age: "+birthday+" weight "+getWeight()+" altura "+getHeight()+" blood "+blood;
    }
}
