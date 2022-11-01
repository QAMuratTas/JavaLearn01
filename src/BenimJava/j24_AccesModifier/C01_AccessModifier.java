package BenimJava.j24_AccesModifier;

public class C01_AccessModifier {


    private int privateYas = 24;
    int defaultYas = 33;// Acces modifier yazılmazsa default olarak atanır
    public int protectedYas = 240;
    public int publicYas = 24;

    private C01_AccessModifier() {
        System.out.println("Ağama private cons. selam :)");
    }

    public C01_AccessModifier(int privateYas, int defaultYas) {
        System.out.println("Ağaama public cons. selam :)");
    }

    private void privateMethod() {
        System.out.println("privatemethoddan agaya selam");
    }

    protected void protectedMEthod() {
        System.out.println("Protected methoddan ağaya selam");
    }

//C01_AccessModifier obj3 = new C01_AccessModifier();
}


