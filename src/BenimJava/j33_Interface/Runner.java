package BenimJava.j33_Interface;

public class Runner {
    public static void main(String[] args) {
        Sahin dgshn = new Sahin();
        dgshn.ebat();
        dgshn.jant();
        dgshn.kapi();
        dgshn.kaporta();
        dgshn.klima();
        dgshn.motor();
        dgshn.koltuk();
        System.out.println("dgshn.sisLamb() = " + dgshn.sisLamb());//default conc meth ->obj ile call edildi
        dgshn.sunRoof();
        dgshn.yakıt();

        System.out.println("disDonanim.RENK = " + disDonanim.RENK);
        // icDonanim.KUMAS="deri" CTE verir final variable
        System.out.println("icDonanim.KUMAS = " + icDonanim.KUMAS);
       //aynı isimli variable llar interface name ile call edilir.
        System.out.println("icDonanim.RENK = " + icDonanim.RENK);
        System.out.println("Lastik.RENK = " + Lastik.RENK);
        System.out.println("icDonanim.MUSIC = " + icDonanim.MUSIC);
        disDonanim.anten();//static conc method Interface name ile call edildi.




    }
}
