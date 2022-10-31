package BenimJava.j16_ArrayList.odev;

import java.util.Arrays;

public class _17_2d_Array_ok {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

int s [][]= {{2,3,2} , {4,1,5} , {7,2,5}};
        System.out.println("Önceki Array :" +Arrays.deepToString(s));

        for (int i = 0; i <s.length ; i++) {
            for (int j = 0; j <s[i].length ; j++) {
                if (s[i][j] ==2) s[i][j] = 6;
            }
        }
        System.out.println("Sonraki Array :"+Arrays.deepToString(s));
    }
}