package BenimJava.j12_Loops.L01_ForLoop.L02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        başlangıç ve bitiş değerleri net(bilinen değerler) olan tekrarlarda foor loop
        ama adım sayısı belli olmayıp bir şarta(duruma) bağlı olan tekrarlarda while lopp kullanılmalı
         */
        // task01-> 11 den 20'ye kadar olan tamasayıları print eden code create ediniz...
        System.out.println("   *** for çözüm ***   ");
        for (int i = 11; i <21 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println("   *** while çözüm ***   ");

        int basla=11;//while başlangıc degeri
        while (basla<21){//basla 21 den kucuk oldugu surece (iken) body action uygula
            System.out.print(basla+" ");
            basla++;//while dongü değişim komutu basla+=1;
        }
        //task02-> 7 kere javaCAN print eden code create ediniz...
        System.out.println("   *** task02 ***   ");
        int b=1;
        while (b<8){
            System.out.println(b+". javaCAN");
            b++;
        }
        // task03-> 2 basamaklı tek sayıları yanyana print eden code create ediniz
        System.out.println("   *** task03 ***   ");
        b=11;
        while (b<100){
            //System.out.print(b+" ");
            // b+=2;//her iki artırmada b = 11,13 ... 99 surekli tek sayı verir
            if (b%2==1) System.out.print(b+" ");
            b++;
        }
        // task04-> girilen metni while loop ile  tersden print eden code create ediniz
        System.out.println("   *** task04 ***   ");

        Scanner sc=new Scanner(System.in);
        System.out.println("bir metin giriniz : ");
        String  metin= sc.nextLine();
        int metinUzunluk=metin.length();

        while (metinUzunluk>=1){//metnin uzunlugu 0 a eşit ve buyuk iken
            System.out.print(metin.charAt(metinUzunluk-1));//
            metinUzunluk--;
        }


//Tas05-> girilen tamsayıya kadar tamsayların toplamını print eden code create ediniz..
        System.out.print("Ağam Bir tamsayı giriniz");
        int sayi=sc.nextInt();
        int toplam=0;// Dönüg actiondan oluşacak toplam için bir şnt oluşturur.

        while (sayi>0) {// sayı 1 olana dek
            toplam+=sayi;// her dongude sayıyı toplamam ekle

            sayi--;//her döngude sayıyı 1 azalt ki sonsuz olmasın :)

          }
        System.out.println("Ağam girdiğin sayılar toplamo:"+toplam);
// task06 -> girilen tamsayının faktorıyelını print eden code create edınız
        System.out.println("   *** task06 ***   ");
int faktor =1;
        System.out.print("Ağam Bir tamsayı giriniz");
        int sy=sc.nextInt();
    while (sy>0) {
        faktor*=sy;
        sy--;
        System.out.print(faktor+" ");
    }
 /*       System.out.println("   *** task06 ***   ");

        int faktoriyel = 1;

        while (sayi > 0) {// sayı 1 olana dek body de ne varsa yap
            faktoriyel *= sayi;// her döngüde sayıyı toplama ekle
            sayi--;// her döngüde sayıyı 1 azalt ki dünta döndükçe dönmesin.!!
        }
        System.out.println("agam girdigin sayılar faktoriyeli : " + faktoriyel);

*/

    }

}
