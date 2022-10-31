package BenimJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertList {
    public static void main(String[] args) {
        // King of Trick -> Array'dan Çevirlen List Aray kaynaklı olduğı için Array davranışı gösterir
        // boyut sabittir. remove add method çalışmaz.
        String arrJavaCan []={"Akif","Gamze","Musty","SevdaNur"};
        List<String> listJavaTar = Arrays.asList(arrJavaCan);// arrJavaCan değerleri liste eleman olarak atandı.
      System.out.println("listJavaTar = " + listJavaTar);
     System.out.println("listJavaTar.size() = " + listJavaTar.size());
       //listJavaTar.add("haluk");// RTE verdi arraya eleman eklenmezzzz. :( unsupportedOperationException
//listJavaTar.clear();
// ahan da kral tirck-> List data type ArrayList tanımlanırsa RTE vermez .
// Kaynağı Array de olsa list davranır.

        //List<String> listJavaTar = Arrays.asList(arrJavaCan);// arrJavaCan değerleri liste eleman olarak atandı.
        List<String> listJavaTar1=new ArrayList <> (Arrays.asList(arrJavaCan));
        listJavaTar1.add("Haluk");
        System.out.println("listJavaTar1 = " + listJavaTar1);


    }
}
