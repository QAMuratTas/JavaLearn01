package BenimJava.j15_Array;

import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {
         /*
 TASK :
 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

      String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
      */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        int tpldolar=0;
        int tplpound=0;

        String[] arr =str.split(" ");
        System.out.println("arr = " + Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {

            if (arr[i].contains("$")) {

              tpldolar+= Integer.parseInt(arr[i].replace("$",""));

            }else
                tplpound+= Integer.parseInt(arr[i].replace("£",""));

        }

        System.out.println("tpldolar = " + tpldolar);
        System.out.println("tplpound = " + tplpound);
    }
}
