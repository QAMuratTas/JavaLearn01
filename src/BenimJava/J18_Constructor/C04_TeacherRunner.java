package BenimJava.J18_Constructor;

public class C04_TeacherRunner {

    // king of trick: p'licons default cons ezer
    public static void main(String[] args) {
        C04_Teacher ogrt1=new C04_Teacher();// ogrt1 obje create edildi.
        ogrt1.ad="Murat";
        ogrt1.soyad="Taş";
        ogrt1.branş="qa";
        ogrt1.emekli=false;
        ogrt1.maaş=35000;
        ogrt1.tecrübe=11;
        ogrt1.dersSaati();
        System.out.println(ogrt1);

        C04_Teacher ogrt2=new C04_Teacher("uğur","javacan",10,"dev",200000,333,false);
C04_Teacher ogrt3=new C04_Teacher("ismail","büyük",10,"qa",30000,123456,false);

        System.out.println("ogrt2 = " + ogrt2);
        System.out.println("ogrt3 = " + ogrt3);


    }
}
