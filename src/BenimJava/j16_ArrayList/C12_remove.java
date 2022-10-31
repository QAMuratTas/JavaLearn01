package BenimJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {

        // remove();-> listten istenen eleman siler.
        ArrayList<String> listsehir=new ArrayList<>(List.of("LosAngeles","Londra","Stocholm","Patagonya"));

        System.out.println("listsehir.remove(\"Angara\") = " + listsehir.remove("Angara"));
        System.out.println("listsehir.remove(\"londra\") = " + listsehir.remove("Londra"));
        System.out.println("listsehir.remove(1) = " + listsehir.remove(1));
        System.out.println("listsehir = " + listsehir);
        //System.out.println("listsehir.remove(11) = " + listsehir.remove(11));
        listsehir.add("Münih");
        listsehir.add("Angara");
        listsehir.add("Münih");
        System.out.println("listsehir = " + listsehir);
        System.out.println("listsehir.remove(\"Münih\") = " + listsehir.remove("Münih"));
        System.out.println("listsehir = " + listsehir);
        System.out.println("listsehir.remove(listsehir.size()-1) = " + listsehir.remove(listsehir.size() - 1));
    }
}
