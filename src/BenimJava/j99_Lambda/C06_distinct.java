package BenimJava.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {
    public static void main(String[] args) {

        List<String > menu = new ArrayList<String>(Arrays.asList("küşleme","küşleme","soğanlı","soğanlı","soğanlı","trileçe","bicibici","büryan","melemen","cacix","kokerç","yağlama","güveç","arabAşı","tantuni"));
alfBkTkszPrint(menu);
        System.out.println("\n        *******");
        listCharacter(menu);
        System.out.println("\n        *******");
        chSyKb(menu);
        System.out.println("\n        *******");
        sonHarfTersPrint(menu);
        System.out.println("\n        *******");





    }//main sonu
    
// Task : List elemanlarını alfabetik büyük harf ve tekrarsız print ediniz
    public static void alfBkTkszPrint (List<String> menu){

        menu.stream().map(String::toUpperCase).
                sorted().
                distinct().
                forEach(t-> System.out.print(t+" "));

    }
//distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
// Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
// Sıralı akışlar için, farklı elemanın seçimi sabittir
// (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
// Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

    // Task : list elemanlarını character sayısını ters sıralı olarak print ediniz.
    public static void listCharacter(List <String > menu){

        menu.stream().map(String::length).sorted(Comparator.reverseOrder()).distinct().forEach(t-> System.out.print(t+" "));

    }

    // Task : list elemanlarını character sayısına göre kckten byuyge gore prınt ediniz...
    public static void chSyKb (List<String> menu) {

        menu.stream().
                sorted(Comparator.comparing(String::length))// akıştakş string elemanların lenght ine göre doğal sıra
                .forEach(t-> System.out.print(t+" "));


    }
    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHarfTersPrint (List<String> menu){


        menu.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).forEach(t-> System.out.print(t+" "));
    }
// Task : listin elemanlarin karakterlerinin cift sayili
// karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  print ediniz...

}
