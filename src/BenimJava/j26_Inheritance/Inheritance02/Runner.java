package BenimJava.j26_Inheritance.Inheritance02;

import BenimJava.j26_Inheritance.Inheritance01.Koyun;
import BenimJava.j26_Inheritance.Inheritance01.Paluk;

public class Runner {
    public static void main(String[] args) {

        Kedi k1 = new Kedi();
        System.out.println("k1.a = " + k1.a);//0->Hayvancık class call
        System.out.println("k1.c = " + k1.c);//1->KEdi clas cal
        System.out.println("k1.d = " + k1.d);//2->Kedi class call
        System.out.println("k1.m = " + k1.m);//3->MAmmal class call

/*
 Method cagirilirken ayni isimli methodlardan
 hangisinin kullanilacagina Constructor karar verir.
 Methodlari arastirmaya Consctuctor ismini tasiyan
 class'dan baslayin ve parentlarda arastirmaya devam edin.
 */


        k1.mA();// hayvancık class call
        k1.mC();// kedi class call
        k1.mM();// Mammal class call edecek
/*
  Ayni isimli variable'lardan hangisinin kullanildi
olusturulan object'in data type'ina göre bilinir
Variable'i arastirmaya data type'i classindan baslanır.
*/


        Mammal k2 = new Kedi("Kevser");//Data type paretn Mammal class -> p li kedi class
        // bu olaya polimorphizm deniyor
        System.out.println("k2.c = " + k2.c);
        System.out.println("k2.a = " + k2.a);
        System.out.println("k2.m = " + k2.m);
        //k2.d -> CTE verir
        k2.mA();
        k2.mC();
        k2.mM();
        // trick -> Variable datatype
        // method -> cons
        Hayvancık k3 = new Kedi();
        System.out.println("k3.m = " + k3.m);
        // k3.c cte verir. datatype Hayvancık class old için c call edilmez
        System.out.println("k3.a = " + k3.a);
        k3.mA();
        k3.mM();

        Mammal m1 =new Mammal('$');
        System.out.println("m1.m = " + m1.m);
        System.out.println("m1.a = " + m1.a);
        System.out.println("m1.c = " + m1.c);
        // m1.d-> parent Mammal Class Child kedi classdan variable
        m1.mA();//Hayvancık class call
        m1.mC();//Mammal class call
        m1.mM();//Mammal Class call

    }

}

