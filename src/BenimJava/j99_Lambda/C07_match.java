package BenimJava.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_match {
    public static void main(String[] args) {
        //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
//allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
//noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
        List<String > menu = new ArrayList<String>(Arrays.asList("küşleme","küşleme","soğanlı","soğanlı","soğanlı","trileçe","bicibici","büryan","welemen","cacix","kokerç","yağlama","güveç","arabAşı","tantuni"));
        System.out.println("\n      *********        ");
        // Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
        hrfSys(menu);
        System.out.println("\n      *********        ");
        wileBaslamayanKontrol(menu);
        System.out.println("\n      *********        ");
enAzxilebiten(menu);
        System.out.println("\n      *********        ");

        System.out.println("\n      *********        ");

         }//main sonu

    public static void hrfSys (List<String> menu){
        boolean kontrol =menu.stream().allMatch(t-> t.length()<=7);

        System.out.println(kontrol ? "Bu da ternary menudekiler 7 den daha az harden olsuyor" : "Bu da ternary Ağaam menudekıler 7 den fazla");

        if (kontrol){// amele code
            System.out.println("Ağam menudekiler 7 ve daha az harfden oluşuyor.:)");

        }else System.out.println("Ağam menudekiler 7 karakterden fazla :(");



    }

// Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.

    public static void wileBaslamayanKontrol (List<String> menu){
        System.out.println(menu.stream().noneMatch(t -> t.toLowerCase().startsWith("w")) ? "Ağam w ile baslayn yemek olur mu?" ://şart true ise print edilecek
                "Ağam wenem ne menem bir şey");//şart false ise print eder.


    }
// Task : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
    public static void enAzxilebiten (  List<String> menu ){
        System.out.println(menu.stream().anyMatch(t -> t.toLowerCase().endsWith("x")) ? "Ağam senden bir cacix olmaz" : "Ağama senin yemek bu topraklarda yok ");


    }


}
