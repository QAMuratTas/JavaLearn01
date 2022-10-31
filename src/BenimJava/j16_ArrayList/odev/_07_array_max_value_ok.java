package BenimJava.j16_ArrayList.odev;

import java.util.Arrays;

public class _07_array_max_value_ok {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        int array[] = {12, 2, 5, 15, 8};
        int maxeleman = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < maxeleman) {// negtif
                maxeleman = maxeleman;
            } else if (maxeleman < array[i]) {
                maxeleman = array[i];


            }
        }
        System.out.println("maxeleman = " + maxeleman);
    }
}