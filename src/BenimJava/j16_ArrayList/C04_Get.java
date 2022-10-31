package BenimJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Get {
    public static void main(String[] args) {
        //get();-> listte istenen elemanı return eder arr[3] 3. indexdeki elemanı veriri
        ArrayList<String> listsehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stocholm"));
        System.out.println("listsehir.get(1) = " + listsehir.get(1));
       // System.out.println("listsehir.get(11) = " + listsehir.get(11));// olmayan index rte verir.


    }
}
