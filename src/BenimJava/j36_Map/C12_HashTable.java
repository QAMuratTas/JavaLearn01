package BenimJava.j36_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {


        /*
        HashTable ->
        HashMap 'e kullanılan tüm methodlar hashTable obj ile de call edilir
        1- HashMap ve TreeMap thread-safe ve synchronized olmadıgı için Mapler arasında thread-safe ve synchronized
        olan bir map e ihtiyaç oldugundan HashTable tanımlanmıştır.
        2- HashTable hashMap'e göre daha yavaştır.
        3- HashTable key ve value larda null değere izin vermez.
        4- HashTable eleman atamsı yapılırken HashMap gibi random (rastgele 0 hurra) yapar.

         */
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("kebab ","Adana");
        ht.put("Döner ","Sivas");
        ht.put("Köfte ","Tekirdağ");
        ht.put("Çorba ","Beyran");
        ht.put("Söğüş","");
        System.out.println("ht = " + ht);
        ht.put("Döner ","Dönerse senindir :)");
        System.out.println("ht = " + ht);// döner key update edilir. key de dublicate değil value atamsı yapar
        //ht.put(null,"trileçe");RTE -> NullPointerException
        //ht.put("kahve",null);RTE -> NullPointerException
        System.out.println("Ağam selametle");
        System.out.println("ht = " + ht);
        Hashtable<String, String> ht1 = new Hashtable<>();
        ht1.put("salata","patlıcan Közleme");
        ht1.put("ara sıcak","içli köfte");

        ht.putAll(ht1);
        System.out.println("ht = " + ht);
        System.out.println("ht1 = " + ht1);

    }
}
