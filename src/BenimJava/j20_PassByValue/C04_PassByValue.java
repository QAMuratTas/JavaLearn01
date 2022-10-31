package BenimJava.j20_PassByValue;

public class C04_PassByValue {

    static double etketFiyat;
    static double indirimOranı;


    public static void main(String[] args) {
        /*
        Eğer bir method'da  yapılan değişiklik kalıcı olsun istenirse
        1. değişiklik yapılan variable lar static olarak tanımlanır
         */


        etketFiyat=100;
        System.out.println("indirim öncesi etketFiyat = " + etketFiyat);
        indirimOranı=0.1;
        indir();
        indirimOranı =0.1;
        indir();
        indirimOranı=0.1;
        indir();
        System.out.println("indirim sonrası etketFiyat = " + etketFiyat);
    }//main sonu


public static  void indir(){
        etketFiyat*=(1-indirimOranı);

    System.out.println("etketFiyat = " + etketFiyat);
}

}


