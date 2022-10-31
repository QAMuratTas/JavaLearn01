package BenimJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {
        ArrayList<String> listsehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stocholm","Angara","Patagonya"));
        // subList(); Listenin istenen list parçasını return eder.
        System.out.println("listsehir.subList(3,5) = " + listsehir.subList(3, 5));//3.4. index elemanlarını verir.
ArrayList<String> baskent = new ArrayList<>(listsehir.subList(2,5));//listsehir den 2.3.4 . index elemanlarını city liste atandı
        System.out.println("baskent = " + baskent);

    }
}
