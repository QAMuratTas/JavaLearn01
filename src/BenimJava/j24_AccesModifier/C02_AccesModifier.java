package BenimJava.j24_AccesModifier;

public class C02_AccesModifier {
    public static void main(String[] args) {

        //C01_AccessModifier ob1=new C01_AccessModifier(); // boş olan parametresiz private call edilen+mez cte verir
        C01_AccessModifier ob2=new C01_AccessModifier(3,3);
C02_AccesModifier semra = new C02_AccesModifier();// default aprametresiz cons.
        //C01_AccessModifier obj4 = new C01_AccessModifier(); psiz private cons

        System.out.println("ob2.defaultYas = " + ob2.defaultYas);
        ob2.protectedMEthod();
        System.out.println("ob2.publicYas = " + ob2.publicYas);
        System.out.println("ob2.publicYas = " + ob2.publicYas);
        //ob2.privateMethos();Ptivate method call edilemez...
    }
}
