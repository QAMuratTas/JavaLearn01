package BenimJava.j32_Abstract.abstract01;

public class Runner {
    public static void main(String[] args) {
        Civic cvc = new Civic();
        System.out.println("***Honda Civic için Özellikler***");
        cvc.sunroof();
        System.out.println("cvc.vites() = " + cvc.vites());
        cvc.lastikEbat();
        cvc.motor();
        cvc.koltuk();
        cvc.kapı();

        Crv crv = new Crv();
        System.out.println("Honda CRV için Özellikler");
        crv.kapı();
        crv.koltuk();
        crv.motor();
        crv.sunroof();
        System.out.println("crv.vites() = " + crv.vites());


    }
}
