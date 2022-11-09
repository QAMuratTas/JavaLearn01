package BenimJava.j29_Expections;

import java.util.Scanner;

public class C07_IllegalArgumentException {
    public static void main(String[] args) {
        // IllegalArgumentException -> kullaılmasını istemediğimiz değerlerde programın hata vermesini isteniyorsa
        // bu exception fırlatılır.
        // Örnek : yaş datası için negatif değer girilidiğinde pr kırılmadan run oması ama girilen değer için
        // excepition fırlatması için kullanılır

        Scanner sc = new Scanner(System.in);
        System.out.print("Ağam yaşını giresen :");
        int age = sc.nextInt();
        try {
            if (age < 0) {
                throw new IllegalArgumentException();//throw keywordü ile Excp obj oluşturularak hata tanımlanır ve fırlatılır
                // böylece şartımıza uymayan için de catch block 'a düşürerek  dah pratik code yazıldı

            } else System.out.println("ağam yasın hayırlı olsun : " + age);


            System.out.println("burası try blok herhangi bir sorun yok");
        } catch (IllegalArgumentException e) {
            System.out.println("Ağam ne yaptın milattan önce mi kaldın :( adam gibi yaş gir.");
            System.out.println("Burası catch blok hata yakalandı");
        }

        System.out.println("Sorun handle edildi");


    }
}
/*
// IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr hata vermesi isteniyorsa bu excp fırlatılıer
        // ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması ama girile değer için excp fırlatması için kullanılır..

        Scanner sc = new Scanner(System.in);
        System.out.print(" agam yasını giresen : ");

        int age = sc.nextInt();
        try {
            if (age < 18) {
               throw new IllegalArgumentException();//throw keyword ile Excp obj olusturularak hata tanımlanır ve fırlatırlır
                // böylece sartımıza uymayan  değer için de catch block'a düşürerek daha pratik code yazıldı
              //  System.out.println("ehliyete basvurman için daha  : " + (18 - age) + "yıl var ...");
            } else System.out.println("agam ehliyete başvurabilirsin hayırlı lsun  " + age);
            System.out.println("agam try block da bu yazıyı okuduysan excp fırlatmadı komut sorunsuz ");
        } catch (IllegalArgumentException e) {
            System.out.println("agam nidddin bu yaşda ehliyet mi alınır  !!!");
            System.out.println("agam catch block da bu yazıyı okuduysan excp fırlatıldı ve code handle edildi :) ");
        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur
 */