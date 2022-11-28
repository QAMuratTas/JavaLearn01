package BenimJava.j99_Lambda;

import java.util.*;
import java.util.stream.Stream;

public class C08_limit {
    public static void main(String[] args) {
        List<String > menu = new ArrayList<String>(Arrays.asList("küşleme","küşleme","soğanlı","soğanlı","soğanlı","trileçe","bicibici","büryan","welemen","cacix","kokerç","yağlama","güveç","arabAşı","tantuni"));
        System.out.println("\n      *********        ");
//limit(a) akısdan cıkan elemanları a parametresine gore ilk a elamanı alır.
charSayisiEnbykElPrintEt(menu);


    }//main sonu
    // Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void charSayisiEnbykElPrintEt (List<String> menu) {

        Stream<String> enbykkarakter=menu.stream().sorted(Comparator.comparing (String::length).reversed()).
                limit(2);//akışdaki ilk 1 elean alındı

        System.out.println("enbykkarakter = " + enbykkarakter);//java.util.stream.SliceOps$1@5315b42e-> limit meth bir stream yani akış (birden cok eleman return eder)
        // dolaysıyla limit çıktısı dogrudan sout ıle prınt edılemz . limit cıktısı list veya array gibi coll atanmalı
        System.out.println("enbykkarakter = " + Arrays.toString(enbykkarakter.toArray()));//


        Object[] enBykKrkterArr=menu.stream().sorted(Comparator.comparing (String::length).reversed()).
                limit(2).toArray();//akııştaki elemanlar direk arraya atandı
        System.out.println("enBykKrkterArr = " + Arrays.toString(enBykKrkterArr));

        //findFirst de kullanılabilir
        Optional<String> enBykKarktr2 = menu.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                findFirst();//akısdaki ilk 1 eleman alındı
        System.out.println("enBykKarktr2 = " + enBykKarktr2);
    }

}
