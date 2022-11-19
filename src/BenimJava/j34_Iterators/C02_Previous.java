package BenimJava.j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_Previous {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(24,38,65,9,11,7,27,23));
        //l1 elemanlarını tersten print ediniz
        System.out.println("l1 list in ilk hali : " +l1);
        /*
        tekrarda son elemandan başlayan işlemler için pointer en sona götürülmeli
        Bunu için pointer 'ı sona götüren hasNext() meth çalışmalı
         */

        ListIterator<Integer> it1= l1.listIterator();

        while(it1.hasNext()){// pointer ı sona götürdü. pointer sürekli sona dogru ileler
            it1.next();
        }
        System.out.println();
        while(it1.hasPrevious()){// pointer sürekli başa doğru ilerler.
            System.out.print(it1.previous()+ " ");
        }

        //System.out.println("l1 list in tersten hali : " +l1);


        List<String> l2= new ArrayList<>(Arrays.asList("çağla","ugur","muharrem","Cebrail"));
        //l2 elemanlarınını sonucusun a:-) ekleyip print ediniz...

        System.out.println("listiterator öncesi l2: "+l2);

        ListIterator<String> it2= l2.listIterator();//l2 elemanlarını tekrarlayan listiterator tanımlandı

        while(it2.hasNext()){
            it2.next();
            String s =it2.next();
            if(!it2.hasNext()){// son eleman demek . hasnext false veriyorsa
                it2.set(s +" :-) ");
            }
        }
        System.out.println("l2 = " + l2);

/*
ÇOĞĞĞ ÖNEMLİ hasPrevious() method için MUTLAKA KESİNLİKLE hasNext() ve next methodları çalıştırılarak cursor (pointer)
en sona getirilmeli ...

İterator ve LIST farkları interview sorulur
1- ITERATOR -> sadece hasNext(), next(), remove() methodları çalışır
   LISTITERATORS ->  hasNext(),next(), remove(), hasPrevious(), previous(),add() , set() vs methdlar çalışır
2- ListIterator -> SADECE lİST YAPILARDA TANIMLANIR
    ITERATOR -> Tüm collection (list set Array , map.. ) için tanımlanır
3- ITERATOR -> SADECE ileri b->s tekrarlar
    ListIterator -> b<->s ileri ve geri çift yönlü tekrarlar.

    ITERATOR ->kapsamı geniş ama aksiyonu az
    ListIterator -> kapsamı dar ama aksiyonu ço


 */
        System.out.println("-1 için çalışma");
        List<String> l3= new ArrayList<>(Arrays.asList("Murat","Adem","Sümeyra","Ümit","İsmail"));
    ListIterator<String> d =l3.listIterator();


        while(d.hasNext()){

            d.next();
            System.out.println("d.nextIndex() = " + d.nextIndex());
        }


    }
}
