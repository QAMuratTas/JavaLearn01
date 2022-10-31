package BenimJava.j15_Array;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        // Array eşitlik kontrolu .. .
        // equals() methdou -> index ve value kontrolu yapar ve true/false return eder.
        int sayi1[]={39,3,72,63,84};
        int sayi2[]={84,72,63,3,39};
        System.out.println("Arrays.equals(sayi1, sayi2) = " + Arrays.equals(sayi1, sayi2));//false
        Arrays.sort(sayi1);
        Arrays.sort(sayi2);
        System.out.println("Arrays.equals(sayi1, sayi2) = " + Arrays.equals(sayi1, sayi2));//true

// Array'i Stringe çevirme ... toString(arr); -> verilen arr'i string data type çevirir.
        String str=Arrays.toString(sayi1);
        System.out.println("str = " + str);//[3, 39, 63, 72, 84]-> arr'yin tüm karakterleri String olarak tanımlaadı.
        System.out.println(str.substring(6));//, 63, 72, 84]



    }
}
