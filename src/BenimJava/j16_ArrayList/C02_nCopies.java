package BenimJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        List<String> listulke=new ArrayList<>(List.of("Almanya","Amerigonya","ingiltere","isveç"));
        List<String> listsehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stocholm"));

        // nCopies(int,obj);-> int elemanlı bir list oluşturur
        ArrayList<String> yenilist =new ArrayList<>(Collections.nCopies(7,"javaCan"));
        System.out.println("yenilist = " + yenilist);
        // addAll(); ->bir liste diğer listeye oldugu gibi ekler
        listulke.addAll(listsehir);
        System.out.println(listulke);
        listsehir.addAll(3,listulke);
        System.out.println("listşehir :"+listsehir);
        System.out.println("listulke :"+listulke);

        // task -> 1 den 10 kadar sayılara bir liste atayıp print eden code create ediniz...
ArrayList<Integer> listsayi=new ArrayList<Integer>();

        for (int i = 1; i <=10 ; i++) {
    listsayi.add(i);
        }

        System.out.println("listsayi = " + listsayi);


    }
}
