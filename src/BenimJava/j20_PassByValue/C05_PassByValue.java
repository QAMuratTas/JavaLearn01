package BenimJava.j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        /*
eger bir method2Da yapılan değişiklik kalıcı olsun istenirse
2.değişklik  yapılan variable'lar atama tanımlanır.
 */
double etiketFiyatı=100;//pirimitive
double indirimOranı=0.1;//Pirimitive
        System.out.println("indirim öncesi  = " + etiketFiyatı);
etiketFiyatı =indirim(etiketFiyatı,indirimOranı);
        System.out.println("indirim sonrası etiketFiyatı = " + etiketFiyatı);



    }//main sonu
    public static double indirim (double fiyat, double oran){

        fiyat*=(1-oran);
        System.out.println("indirimli fiyat = " + fiyat);
        return fiyat;

    }

}
