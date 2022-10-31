package BenimJava.J18_Constructor;

public class C02_Arac {
    String marka;
    String model;
    int km=10;
    double mtorHcm;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yil;

    public static void main(String[] args) {

        C02_Arac arac1 = new C02_Arac();// default cons ile arac1 objesi create ettik
        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50000;
        arac1.model="xc90";
        arac1.mtorHcm=2.4;
arac1.vitesAuto=false;
        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.km+" "+arac1.yil+" "+arac1.ikinciEl+" "+arac1.mtorHcm);

// task-> 2. bir aracın tum field larını atayarak print ediniz.
        C02_Arac mycar = new C02_Arac();// default cons ile arac1 objesi create ettik
        mycar.ikinciEl=false;
        mycar.marka="Honda";
        mycar.km=1000;
        mycar.model="Accord";
        mycar.mtorHcm=2.0;
arac1.vitesAuto=true;
arac1.yil=2022;

        System.out.println(mycar.marka+" "+mycar.model+" "+arac1.km+" "+mycar.yil+" "+mycar.ikinciEl+" "+mycar.mtorHcm+" "+mycar.yil+" "+mycar.vitesAuto);
        System.out.println("mycar "+mycar);


    }

    @Override
    public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", mtorHcm=" + mtorHcm +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil +
                '}';
    }
}
