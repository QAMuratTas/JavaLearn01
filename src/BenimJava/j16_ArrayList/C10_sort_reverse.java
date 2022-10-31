package BenimJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_sort_reverse {
    public static void main(String[] args) {
        //Collections.sort(list);-> verilen listi natural sıralama return eder.
        //Collections.reverse(list);-> verilen listin ters sırlamasını return eder.
        List<String> listsehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stocholm","Angara","Patagonya"));
        System.out.println("listsehir = " + listsehir);
        Collections.sort(listsehir);// sout methodu method içide çalışmaz
        System.out.println("listsehir = " + listsehir);
Collections.reverse(listsehir);
        System.out.println("listsehir = " + listsehir);
        ArrayList<String> listulke=new ArrayList<>(List.of("Almanya","Amerigonya","ingiltere","isveç"));
        System.out.println("listulke = " + listulke);
        Collections.reverse(listulke);
        System.out.println("ters listulke = " + listulke);

        System.out.println("listsehir.contains(\"Munih\") = " + listsehir.contains("Munih"));
        Collections.sort(listulke);
        System.out.println("listulke = " + listulke);


    }
}
