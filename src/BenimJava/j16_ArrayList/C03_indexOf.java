package BenimJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        ArrayList<String> listulke=new ArrayList<>(List.of("Almanya","Amerigonya","ingiltere","isveç"));
        ArrayList<String> listsehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stocholm"));
        System.out.println("listsehir.indexOf(\"Londra\") = " + listsehir.indexOf("Londra"));
        System.out.println("listsehir.indexOf(\"Ankara\") = " + listsehir.indexOf("pAnkara"));//-1
        System.out.println("listsehir.indexOf(\"Manisa\") = " + listsehir.indexOf("Manisa"));//-1
//case sensitive
        listulke.add("Amerigonya");
        System.out.println("listulke = " + listulke);
        System.out.println("listulke.indexOf(\"Amerigonya\") = " + listulke.indexOf("Amerigonya"));
        System.out.println("listulke.lastIndexOf(\"Amerigonya\") = " + listulke.lastIndexOf("Amerigonya"));// sağdan(sondan) ilk bulunan elemanın indexi return eder.





    }
}
