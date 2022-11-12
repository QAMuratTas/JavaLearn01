package BenimJava.j29_Exceptions;

public class C07_IllegalArgumentException02 {
    public static void main(String[] args) {

        try {
            System.out.println("Ağam try block başından selam");
            hata();
            System.out.println("ağam try block sonundan selam");
        }catch (IllegalArgumentException e) {
            System.out.println("Ağam catch block başından selam");
            System.out.println(e);
            System.out.println("e.getMessage() = " + e.getMessage());
            e.printStackTrace();
            System.out.println("Ağam catch block sonundan selamlar");
        }
        System.out.println("Ağam sorun handle edildi....");

    }// main  sonu

    public static void hata(){

        throw new IllegalArgumentException("Ağam ne yaptın yine mi hata :(");


    }
}
