package BenimJava.j25_Encapsulation.encapsulation03;

public class Arac {

    private String model;
    private String renk;
    private int motor;
    private int yil;

public Arac(String model, String renk, int motor, int yil){
    this.model=model;
    this.renk=renk;
    //this.motor=motor;
    setMotor(motor);// set method call ettik
   setYil(yil);
    // this.yil=yil;
}
    public Arac(){

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
    if (motor<1000) {
        System.out.println("Ağam bisiklete bineydin daha hızlı giderdin :(");
        this.motor = motor+(1001-motor);}
    else
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
    if (yil<0) {
        this.yil = (-1) * yil;
        System.out.println("Ağam m.ö araba vardı da biz mi binemedik");
    } else this.yil = yil;





    }

    @Override
    public String toString() {
        return "Ağam tekere taş değmesin" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}

