package BenimJava.j35_Collection.C01_LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();// datatypeObject ne olursan ol gel tüm data type
       // Bad practice app. çok yavaşlar tavsiye edilmez : cıss...
        list.add("Murat");
        list.add('$');
        list.add(1453);
        System.out.println("list = " + list);


    }
}
