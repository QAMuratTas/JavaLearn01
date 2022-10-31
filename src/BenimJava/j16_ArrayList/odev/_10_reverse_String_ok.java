package BenimJava.j16_ArrayList.odev;

import java.util.Arrays;

public class _10_reverse_String_ok {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String h[]={"Hello World"};
        String str=Arrays.toString(h);// [Hello World]
        for( int i=str.length()-2; i>0; i--){
            System.out.print(str.charAt(i));
        }


    }
}