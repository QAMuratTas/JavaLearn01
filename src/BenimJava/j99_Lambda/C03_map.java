package BenimJava.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_map {
    public static void main(String[] args) {
       List<Integer> sayi = new ArrayList<>(Arrays.asList(24,38,49,33,7,3,42,66,75,45,46,55,35,25,67,16));

CiftKarePrint(sayi);
        System.out.println("\nsayi = " + sayi);
        System.out.println("\n      ****     ");
       tekKupBirFazla(sayi);
        System.out.println("\n **** ");
        ciftElKarekok(sayi);


        // Task : Functional Programming ile listin cift elemanlarinin  karelerini ayni satirda aralarina bosluk bırakarak print ediniz



    }//main sonu
    public static void CiftKarePrint (List <Integer> sayi) {
        sayi.stream().// List elemanlar akışa alındı
                filter(C01_LambdaExpression::ciftMi).//akıştaki çift elemanlar filtrelendi
                map(t->t*t).// akışta filtrelenen çift elemanlar karesi alınarak update edildi. akışa sokuldu.
                forEach(C01_LambdaExpression::yazdir);// akışta filtrelenmiş cift elemanlar karesi alınıp işaretlenen akıştan print edildi.


    }
// Task : Functional Programming ile listin tek elemanlarinin  kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak print edi
//map()--> Stream içerisindeki elemanları başka tiplere dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.

    public static void tekKupBirFazla (List <Integer> sayi) {
        sayi.stream().// List elemanlar akışa alındı
                filter(t->t%2==1).//akıştaki tek elemanlar filtrelendi
                //map(t->t*t*t+1).// akışta filtrelenen tek elemanlar küpüün 1 fazlasıalınarak update edildi. akışa sokuldu.
                map(t->Math.pow(t,3)+1).

                        forEach(C01_LambdaExpression::yazdir);// akışta filtrelenmiş işaretlenen akıştan print edildi.
       // System.out.print("deneme");
      //  sayi.stream().map(t->t*t*t+1).filter(t->t%2==1).forEach(C01_LambdaExpression::yazdir);

    }
// Task : Functional Programming ile listin cift elemanlarinin   karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void ciftElKarekok (List<Integer> sayi) {
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(Math::sqrt).forEach(C01_LambdaExpression::yazdir);


    }

        }
