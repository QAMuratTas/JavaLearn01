package BenimJava.j19_StaticVariable;

import static BenimJava.j19_StaticVariable.Practice_Araba.bilgi;

public class Practic_Arabamain {
    public static void main(String[] args) {


        Practice_Araba nesne1=new Practice_Araba(175,7,"mor");
        System.out.println("nesne1.hiz = " + nesne1.hiz);
        System.out.println("nesne1.model = " + nesne1.model);
        System.out.println("nenen1 renk = "+nesne1.renk);
        System.out.println("nesne1.vites = " + nesne1.vites);

        Practice_Araba nesne2=new Practice_Araba(220,7,"white");
        System.out.println("nesne2.model = " + nesne2.model);
        System.out.println("nesne2.vites = " + nesne2.vites);
        System.out.println("nesne2.renk = " + nesne2.renk);
        System.out.println("nesne2.hiz = " + nesne2.hiz);
        nesne1.model=2022;
Practice_Araba nesne3=new Practice_Araba(185,8,"gümüş gri");
        System.out.println("nesne3.model = " + nesne3.model);
        System.out.println("nesne3.vites = " + nesne3.vites);
        System.out.println("nesne3.renk = " + nesne3.renk);
        System.out.println("nesne3.hiz = " + nesne3.hiz);
bilgi();
    }

}
