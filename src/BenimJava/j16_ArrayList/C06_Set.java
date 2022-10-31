package BenimJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_Set {
    public static void main(String[] args) {
        // set();-> listin elemanını istenen indexe update eder
        ArrayList<String> listsehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stocholm"));
        System.out.println("listsehir.set(3,\"Ankara\") = " + listsehir.set(3, "Angara"));//set edilen değer print eder.
        System.out.println("listsehir = " + listsehir);//list set edilmiş hali print edildi.
        //System.out.println("listsehir.set(11, \"pataGONYA\") = " + listsehir.set(11, "pataGONYA"));//olmayan index set edilirse RET verir.
  // listsehir.set(12,"bursa",2,"");// -> list de çoklu set methodu çalışmaz buz gibi İNTERVİEW sorusu ... CTE verir.







    }
}
