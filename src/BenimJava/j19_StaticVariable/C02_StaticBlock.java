package BenimJava.j19_StaticVariable;

/*
        1. Staitc block yapıları static variable 'rı değer ataması ynai auğdate için kullanılır
        2. Static block Class oluşturuldugunda butun methodlardan (main method dahıl) önce çalışır.
        3. Birden fazla static block varsa yukarıdan aşağıya sırlamam ile çalışır.


         */
public class C02_StaticBlock {

    static String isim="Haluk";

    static {

        System.out.println("Ağama 1. static bloc çalıştı :)");
        isim = "Dilek hanım";
        System.out.println("isim = " + isim);

    }


    public static void main(String[] args) {

        System.out.println("Main methdo başladı -->");
        isim = "Kerim Bey";
        System.out.println("isim = " + isim);
        System.out.println("MAin method bittiii :( ");


    }//main sonu
    static {

        System.out.println("Ağama 2. static bloc çalıştı :)");
        isim = "uğur bey";
        System.out.println("isim = " + isim);

    }

}
