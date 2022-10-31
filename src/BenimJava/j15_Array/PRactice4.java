package BenimJava.j15_Array;

import java.util.Arrays;

public class PRactice4 {
    public static void main(String[] args) {

 /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

int a []= {1,2,-3,4,-5,-6};
        System.out.println("a ' nın ilk hali = " + Arrays.toString(a));
degistir(a);


    }

    private static void degistir(int [] a) {

        for (int i = 0; i <a.length ; i++) {
          a[i]*=-1;
            System.out.print( a[i]+" ");
        }

    }
}
