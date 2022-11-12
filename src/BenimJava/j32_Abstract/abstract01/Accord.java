package BenimJava.j32_Abstract.abstract01;

public class Accord extends Honda {

    @Override
    void sunroof() {
        System.out.println("Ağam sunroof iyidir." );
    }

    @Override
    public void motor() {
        System.out.println("2.0 turbo ideal motor hacmi ");

    }

    @Override
    void koltuk() {
        System.out.println("deri koltuk terleme yapar pişik olur");

    }

    @Override
    void kapı() {
        System.out.println("Ağam vakumlu kapı çarpılmayasan");

    }
}
