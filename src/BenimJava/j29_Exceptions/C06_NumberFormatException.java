package BenimJava.j29_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
        //NumberFormatException -> Sayı formatında olmayan bir datayı parseInt() method
        // run ederek integer e çevirildiğinde oluşan RTE exception dır
        //Java da String içindeki rakam karakterler parseINT() ile int degere atanabilir.
        String str ="1453";

        System.out.println("str+5 = " + str + 5);// concat edilir.
        int sayi =Integer.parseInt(str);// str deki rakam karakter sayi variable a atandı
        System.out.println("sayi = " + sayi);
        System.out.println("sayi+5 = " + (sayi + 5));
String id ="57l622";
try {
    //int sayi1=Integer.parseInt(id);
   //System.out.println("sayi1 = " + sayi1);
    System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));//NumberFormatException
    System.out.println("Burası try blogu . sorun yok demek . bu yazıyı goruyorsan");
}catch(NumberFormatException e)
{
    System.out.println("Ağam String değer  wrapper ederken içinde sayı harıci karakter varlığı tespit edildi.");
    System.out.println("burası catch blogu");
}
        System.out.println("Ağam sorun handle edildi ");


        try {
            System.out.println("Integer.parseInt(str) = " + Integer.parseInt(str));
            System.out.println("Burası try blogu . sorun yok demek . bu yazıyı goruyorsan");
        }catch(NumberFormatException e)
        {
            System.out.println("Ağam String değer  wrapper ederken içinde sayı harıci karakter varlığı tespit edildi.");
            System.out.println("burası catch blogu");
        }
        System.out.println("Ağam sorun handle edildi ");





    }
}
