package BenimJava.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c02_Filter {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        printCiftElFunctional(sayi);
        System.out.println("   \n      ************        ");
        printCiftElFunctional1(sayi);

        System.out.println("     \n    ************        ");
        printCiftElFunctional2(sayi);
        System.out.println("     \n    ************        ");
        printCiftElFunctional3(sayi);


    }

    public static void printCiftElFunctional(List<Integer> sayi) {

        sayi.
                stream().// List elemanları akışa alındı
                filter(t -> t % 2 == 0).// akıştaki list elemanları çift olma şartına göre filtrelendi- > lambda exp.. bad practice
                forEach(C01_LambdaExpression::yazdir);//C01_LambdaExpression classdaki yazdir meth refere edildi (call edildi)

    }

    public static void printCiftElFunctional1(List<Integer> sayi) {
//sayi.stream().filter(C01_LambdaExpression::ciftMi).forEach(C01_LambdaExpression::yazdir);
        sayi.
                stream().// List elemanları akışa alındı
                filter(C01_LambdaExpression::ciftMi).// akıştaki list elemanları çift olma şartına göre filtrelendi
                forEach(C01_LambdaExpression::yazdir);//C01_LambdaExpression classdaki yazdir meth refere edildi (call edildi)

    }
    //Task : "Functional Programming" (cincix kod) kullanarak list elemanlarının 35 den küçük sayıları aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElFunctional2(List<Integer> sayi) {

        sayi.
                stream().// List elemanları akışa alındı
                //filter(a->a<35).// akıştaki list elemanları çift olma şartına göre filtrelendi
                        filter(ebikgabık -> ebikgabık < 35 && ebikgabık % 2 == 0).//iki ayrı filter de kullanabiliriz.
                forEach(C01_LambdaExpression::yazdir);//C01_LambdaExpression classdaki yazdir meth refere edildi (call edildi)

    }

    //Task : "Functional Programming":cincix code kullanarak list elemanlarının 34 den buyuk YADA  çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    public static void printCiftElFunctional3(List<Integer> sayi) {//amele method
        sayi.
                stream().//list eemanları akısa alındı
                filter(t -> t % 2 == 0 || t > 34).//akısdakı list elemanları çift olma sartına göre filtrelendi:akısdan çıkarıldı->meth ref. best practice
                forEach(C01_LambdaExpression::yazdir);//C01 Class'daki yazdır method refere(call) edildi

    }
}