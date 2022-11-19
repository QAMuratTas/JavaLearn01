package BenimJava.j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*
        LinkedList ...
        1- LinkedList de elemanlar  "data" ve "adress" olmak üzere iki kısımdan oluşur ve eleman yerine
        "node" olarak tanımlanır
        2- LinkedList de ilk node data barındırmayan sadece adree bulunduran head node tanımlaır
        3- LinkedList de son node adres kısmı null olan barındırmayan sadece data bulunduran tail node olarak
        tanımlanmıştır.
        4- ArrayList searching LinkedList node ekleme ve silmede daha avantajlıdır. LinkedList eleman bulmada
        index yapısı olmadığı için
        5- LinkedList -> tren vagon ilişkisi bağlantısı gibi düşünülebilir.
        6- Collection  obj tanımlanırken cons Class (LinkedList ,ArrayList ...) olmalı intreface(list,Queue ..)
        olmamasına dikkat edilmelidir. Ancak obj DaytaType olarak parent interface tanımlanabilir.
        7- LinkedList class iki tane parent interface den(List,Queue) implement etmiştir.
         */


        LinkedList<String> ll1= new LinkedList<>(Arrays.asList("Ebubekir","Gülsüm","Adem","İlker","MErve"));// Linkedlist -> hem declare + assigment
        // Linkedlist print ...
        System.out.println("ll1 = " + ll1);
        //LinkedList add();
        ll1.add("Uğur");
        System.out.println("ll1 = " + ll1);
        ll1.add(2,"Murat");
        System.out.println("ll1 = " + ll1);
        ll1.addFirst("Javacan");
        System.out.println("ll1 = " + ll1);
        ll1.addLast("javatar");
        System.out.println("ll1 = " + ll1);
        List<String> ll2= new LinkedList<>(Arrays.asList("fatih","Murat","Erol"));// Datatype intreface List olan LinkedList

        ll1.addAll(ll2);
        //ll1.addAll("ağam"); cte verir
             System.out.println("ll1 = " + ll1);
    ll1.addAll(3,ll2);

        System.out.println("ll1 = " + ll1);


    }
}
