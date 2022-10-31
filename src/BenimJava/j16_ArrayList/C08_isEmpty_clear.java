package BenimJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty_clear {
    public static void main(String[] args) {
        //isEmpty();-> lisitn boş olup olmamasını kontrol eder true / false return eder.
        //clear();-> listin tüm elemanlarını siler.
        ArrayList<String> listsehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stocholm"));
        System.out.println("listsehir = " + listsehir);
        System.out.println("listsehir.isEmpty() = " + listsehir.isEmpty());// false
        listsehir.clear();// list temizlendi
        System.out.println("listsehir = " + listsehir);//[]
        System.out.println("listsehir.isEmpty() = " + listsehir.isEmpty());// true


    }
}
