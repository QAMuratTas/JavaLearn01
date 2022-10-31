package BenimJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {

        ArrayList<String> listsehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stocholm","Angara","Patagonya"));
        System.out.println("listsehir.contains(\"Angara\") = " + listsehir.contains("Angara"));

        System.out.println("listsehir.contains(\"Munih\") = " + listsehir.contains("Munih"));

    }
}
