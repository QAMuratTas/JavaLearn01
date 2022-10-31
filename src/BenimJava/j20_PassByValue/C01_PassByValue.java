package BenimJava.j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        Java Pass By value bir proglamlama dilidir.
        Bir pirimitiv variable argument (parametre) olarak bir methoda call edildğinde
        variable değil bir copy clone (vesikalık) (pointer) değeri gönderilir.
         */
        // Task-> verilen fiyat için %24 artırılmış fiyatı print eden method create ediniz.

        double fiyat = 100;// pirimitive double type variable

        System.out.println("method call öncesi fiyat değeri   = " + fiyat);//100


        fiyatArrtır(fiyat);// fiayt variable methoda parametre call edildi.
        System.out.println("method call sonrası fiyat değeri   = " + fiyat);//100


    }// main sonu

    public static void fiyatArrtır(double bisey) {
        bisey *= 1.24;
        System.out.println("Arttırılmış fiyat = " + bisey);
    }
}
