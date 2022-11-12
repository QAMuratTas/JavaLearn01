package BenimJava.j32_Abstract.Abstract_Teach.Ornek3;

public class YemekDunyasiMain {
    public static void main(String[] args) {


        Baklava bklv = new Baklava();
        bklv.madeIn();
        bklv.taste();

        CheeseCake chc = new CheeseCake();
        chc.madeIn();
        chc.taste();

        SezarSalad sld = new SezarSalad();
        sld.madeIn();
        sld.taste();
    }
}
