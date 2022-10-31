package BenimJava.j16_ArrayList.odev;

import java.util.Arrays;

public class _19_2d_Array_3_OK {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

String eylt1 [][]= {{"new jersey","atlanta","OHİO"} , {"Pittsburgh" ,"ohio","new york","ohio"} ,{"ohio","new york"}};
        System.out.println("Önceki eyalet isimieri :"+Arrays.deepToString(eylt1));
        for (int i = 0; i <eylt1.length ; i++) {
            for (int j = 0; j <eylt1[i].length ; j++) {
                if (eylt1[i][j].equalsIgnoreCase("oHio"))
                eylt1[i][j] = "Florida";
            }

        }
        System.out.println();

        System.out.println("Sonraki eyalet isimleri :"+Arrays.deepToString(eylt1));
    }
}

