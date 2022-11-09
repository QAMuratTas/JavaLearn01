package BenimJava.j29_Expections;

import java.util.Scanner;

public class C01_ArithmeticExpection {
    public static void main(String[] args) {
// arithmetic expection -> matematiksel işlemlerde oluşan runtime expection dur.
        String str = "";
        // str.charAt(2);//runtime verir.tringIndexOutOfBoundsException

        Scanner sc = new Scanner(System.in);
        System.out.println("Ağam 1. sayıyı giresen : ");
        int sayi1 = sc.nextInt();
        System.out.println("Ağam 2. sayıyı giresen : ");//0 girildiğinde Runtime ->ArithmeticException by zero
        int sayi2 = sc.nextInt();
        int oran;

        try {// dene -> hatanın olma ihtimalinin olduğu code bloğudur.
            /*
            1- try catch kullanıldıgında try block calısırsa catch block asl calısmaz catch block try block expection hata yakalarsa calısır.
            2- try block carch ve finally block olmadan CTE verişr. try block tan sonra bir den fazla carch block tanımlanabılır.
            aynı anda sadece 1 catch block  çalışabılır. hiç bir catch block da çalışmayada bilir.
            3- parent child ilişkisi olan catch lerde child önce yazılmalı
            4-

             */
            oran = sayi1 / sayi2;// try block da hata yakalandıgı satırdan sonra try diğer satırlar iligili carch block çalışır.
            System.out.println("oran = " + oran);
            System.out.println("Ağam try bloktan selamlar");
        }catch(ArithmeticException falanfilan){// child
            System.out.println("ağam bölmede bölen 0 olamaz "+falanfilan.getMessage());// expection oluştugunda sadece hata mesajı prınt etmek için getMessage kullanılır
            falanfilan.printStackTrace();// oluşan Expeciton tum detayları print etmek için kullanılır

            System.out.println("ağam çırak catchden selamlar");
        }
        catch (ArrayIndexOutOfBoundsException array){// child
            System.out.println("Ağam array de olmayan eleman istiyorusun ");
        }
        catch (Exception e) {// Expecitın class tum expecitonların HZ ademi parent Classıdır-> bad practice parent
            // hata yakalandığında yapılacak aksiyonların olduğu bloktur
            System.out.println("Ağaam ne yaptın 0 hiç böler mi ? :)))");
            System.out.println("catch bloktan ağaya selamalar....");

        }
        finally {// catch blocklardan sonra istenirse fınally block kullanılabilir.
            /*
            try-catch içinde yapılan işlemlerden sonra mutlaka çalışması gereken block varsa fınally tnaımlanır
            hata durumunda catch çalışmazsa program sonlanır.
            ama fınally tanımlanırsa catch calısmasa bıle pr akışı devam eder.finally block hata olsa da olmasa da çalışır
            Cloud database ortamlarında baglantı kesmek için kullanılır.cloud ile connection yazdıgınızda code başarılı
            bir şekilde çalışırsa işlem bittiğinde finally block ile connection kapanmazsa maliyet pahalı olur:(
             */
            System.out.println("ağam finally block tan selamlar.:)");
        }
        System.out.println("ağam selametle sorun handle edildi devamkeeeee");

        // expection -> oluşana hata data type
        // e -> javanın oluşan expectiona atayacağı obj name

       // catch (ArithmeticException falanfilan) {//expection parent oldugu ıcın burada cte verdi.

        }

    }



