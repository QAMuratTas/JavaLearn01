package BenimJava.j26_Inheritance.Inheritance02;

public class Hayvancık {// g. parent süper dede class

    public Hayvancık() {//p siz cons
        System.out.println("Ağam ahan da HAYVANCIK parametresiz cons...");
    }

    public Hayvancık(int i) {
        System.out.println("Ağaam ahana da HAYVANCIK parametreli");
    }

    public void mA() {
        System.out.println("mA - > Hayvancık class dan method call ");
    }

    public void mM() {
        System.out.println("mM - > Hayvancık class dan method call ");
    }

    int a;
    int m = 3;


}
