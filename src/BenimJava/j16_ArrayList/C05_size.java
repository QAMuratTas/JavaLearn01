package BenimJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {
        // size();-> listin eleman sayısını return eder. (arr->length)
        ArrayList<String> listsehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stocholm"));
        System.out.println("listsehir.size() = " + listsehir.size());


    }
}
