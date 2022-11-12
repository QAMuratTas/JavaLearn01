package BenimJava.j32_Abstract.abstract01;

public class Crv extends Honda {
    @Override
    public void motor() {
        System.out.println("2.4 cc en iyisi. bastınmıydı gidecek arkadaş");
    }

    @Override
    void koltuk() {
        System.out.println("deri koltuk arazide yıpranır...");

    }

    @Override
    void kapı() {
        System.out.println("Ağam kapılar 5 adet. ");

    }
    public int vites(){
        return 6;
    }
}
