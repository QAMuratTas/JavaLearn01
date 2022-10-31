package BenimJava.j16_ArrayList.odev;

import java.util.Arrays;

public class _18_2d_array2_ok {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

int  nmb[][]={{5,2,1} ,{10,2,3,6} , {1,2}};
        System.out.println("nmb = " + Arrays.deepToString(nmb));
        int  toplam = 0;
        for (int i = 0; i <nmb.length ; i++) {
            for (int j = 0; j <nmb[i].length; j++) {
                toplam+=nmb[i][j];
                
                System.out.println("toplam = " + toplam);// sistemde görmek için buraya sout attım :)
            }

        }
        System.out.println("toplam = " + toplam);
    }
}