package BenimJava.j22_DateTime.Haftanın_Task.Team;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Kayıt {

    ArrayList<Kullanıcı> kullanıcıKisiler =new ArrayList<>();

   public ArrayList<Kullanıcı> kayıtAl(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Ağam adını giresen :");
       String ad = sc.nextLine();// Kullanıcı obj için name aldı
       Kullanıcı k1=new Kullanıcı(ad, LocalDateTime.now());//k1 objesi name kullanıcıdan kayıt zamanıda LocaldateTime dan alacak
       kullanıcıKisiler.add(k1);// oluşturulan k1 obj listi eklendi.

       if (k1.kayıtZamanı.getSecond()<10){
           System.out.println("Şanslı kullanıcısınız "+k1.kayıtZamanı.getSecond());

       }else System.out.println("Maalesef "+k1.kayıtZamanı.getSecond());
        return kullanıcıKisiler;

    }
}
