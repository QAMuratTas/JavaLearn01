package BenimJava.j23_Varargs_StringBuilder.Varargs;

public class C01_Varargs {
    public static void main(String[] args) {
        /*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method budy....
        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
         */

        // Task -> verilen iki toplamını print eden METHOD create ediniz


        int sayi1 = 24;
        int sayi2 = 27;
        int sayi3 = 46;
        int sayi4 = 10;
        topla(sayi1, sayi2);
        topla(sayi3, sayi2);
        topla(sayi4, sayi1);
toplaVarargs(sayi1, sayi2,23);
toplaVarargs(sayi3, 33,22,sayi1);
 // Task-> verieln üç sayı toplamını print eden method create ediniz

enuzuuuunKelime("aga","fatih","zeyyid");
    }// main sonu

    public static void topla(int a, int b) {//overload
        System.out.println("Sayılar toplamı : " + (a + b));

    }

    public static void topla(int a, int b, int c) {// overload
        System.out.println("Sayılar toplamı : " + (a + b+c));
    }
public static void toplaVarargs(int... a){
        int toplam =0;
        for(int w:a){// varargs parametre arr içinde tanımlandığı içi parametler loop aksiyon alır.
            toplam +=w;

        }
    System.out.println("   ***** varargs************************************");
        System.out.println("Sayılar toplamı : " + (toplam));






}
public static void enuzuuuunKelime(String... str) {
    String enUzun = "";
    for (String w : str) {
        if (w.length() > enUzun.length()){ enUzun=w;}

    }

    System.out.println("enUzun = " + enUzun);


}
}


