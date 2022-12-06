package Elly_Teacher.LambdaLive;

import BenimJava.j99_Lambda.C01_LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class C2_StringLisr {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidir");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");
        ilkHarfiDveyaColanListele(list);
        basVeSonayildizekle(list);
        alfabetikOlarakSirala(list);
        tumLlerisilme(list);
        icindeEolanlariListele(list);
        ilkHarfini3kereTekrar(list);
        tumElIlkHarfByk(list);
        uzunlugu4Ve6haricListele(list);

    }//main sonu

    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz
    private static void uzunlugu4Ve6haricListele(List<String> list) {
        System.out.println();
        list.stream().filter(t -> t.length() != 6 && t.length() != 4).forEach(C01_LambdaExpression::yazdirStr);
    }


    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz
    private static void tumElIlkHarfByk(List<String> list) {
        System.out.println();
        list.stream().map(t -> t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase()).forEach(C01_LambdaExpression::yazdirStr);
    }


    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
    private static void ilkHarfini3kereTekrar(List<String> list) {

        System.out.println();
        list.stream().map(t -> t.substring(0, 1) + t.substring(0, 1) + t).forEach(C01_LambdaExpression::yazdirStr);
    }


    //S5 : icinde e olanlardan yeni bir list olusturunuz  *** filter(contains())  collect() yapamadım dön buna ****
    private static void icindeEolanlariListele(List<String> list) {
        // bunu yapamadım arkadaşlar yapan varsa bana yardım edebilir mi?
        list.stream().filter(t -> t.contains("e")).forEach(C01_LambdaExpression::yazdirStr);
    }


    //S4: tum 'l' leri silelim yazdiralim ***map(replaceAll)
    private static void tumLlerisilme(List<String> list) {
        System.out.println();
        list.stream().map(t -> t.toLowerCase().replaceAll("l", "")).forEach(C01_LambdaExpression::yazdirStr);
    }


    //S3: alfabetik  olarak siralayalim list olarak ***sorted()
    private static void alfabetikOlarakSirala(List<String> list) {
        System.out.println();
        list.stream().map(String::toLowerCase).sorted().forEach(C01_LambdaExpression::yazdirStr);
    }

    //S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim *** map(t-> "*" + t + "*")
    private static void basVeSonayildizekle(List<String> list) {
        System.out.println();
        list.stream().map(t -> "*" + t + "*").forEach(C01_LambdaExpression::yazdirStr);
    }

    // S1: ilk harfi d ve ya c olanlari listeleyelim *** filter-startsWith()
    private static void ilkHarfiDveyaColanListele(List<String> list) {
        list.stream().map(t -> t.toLowerCase()).filter(t -> t.startsWith("d") || t.startsWith("c")).forEach(C01_LambdaExpression::yazdirStr);
    }


    //     ***map(t-< t.substring(0,1) + t-< t.substring(0,1) + t) forEach()

    //   ***map(t-< t.substring(0,1).toUpperCase() + t.substring(1).toLowerCase() forEach

    // ***filter(x-> x.length () !=4 && x.length () !=6)  collect

}
