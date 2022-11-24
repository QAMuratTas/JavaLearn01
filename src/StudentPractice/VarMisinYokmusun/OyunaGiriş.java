package StudentPractice.VarMisinYokmusun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OyunaGiriş {
    static List<Integer> paraListesi= new ArrayList<>();
    static Kutular kutular = new Kutular();
static int kutuNumaram,kutumdakiPara;

    public static void main(String[] args) {

        paraListesi.add(1);
        paraListesi.add(10);
        paraListesi.add(500);
        paraListesi.add(1000);
        paraListesi.add(10000);
        paraListesi.add(50000);
        paraListesi.add(100000);
        paraListesi.add(250000);
        paraListesi.add(500000);
        Collections.shuffle(paraListesi);
        Scanner sc = new Scanner(System.in);
kutulariOlustur();

System.out.println("Yarışamamıza hoşgeldiniz");
        System.out.println("Lütfen Kutuları seçiniz :");
        kutuNumaram =sc.nextInt();
        kutumdakiPara=paraListesi.get(kutuNumaram-1);
        System.out.println("Kutu numaranız :"+kutuNumaram);
        kutular.kendiKutumuKaldir(kutuNumaram);
        kutuSecmeActirma();

     }

    private static void kutuSecmeActirma() {
    }

    private static void kutulariOlustur() {

        for (int i = 0; i <10 ; i++) {
            Kutu kutu = new Kutu();
            kutu.setKutuNumarasi(i+1);
                kutu.setParaMiktari(paraListesi.get(i));
            kutular.kutuEkle(kutu);
            System.out.println("Kutu no: " + (i+1) +" Para Miktar ");

        }



    }
}
