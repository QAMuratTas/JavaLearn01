package BenimJava.j35_Collection.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {
        // interview question : girilen Stirng datanın karakterlerini alfabetik print ediniz.-> treeSete atanır.
        // hashSet ve treeSet tanımlayıp run sürelerini karşılaştırınız
        // trick run süresi için System.currentTimeMillis() method call ediniz...


        long tsBasla = System.currentTimeMillis();
        TreeSet<String > ts=new TreeSet<>();
        ts.add("Salim");
        ts.add("hasn");
        ts.add("Murat");
        ts.add("REcep");
        ts.add("Eyüp");
        ts.add("Zehra");
        ts.add("Fatma");
        ts.add("Fatih");
        ts.add("Feray");

        long tsBitir = System.currentTimeMillis();
        System.out.println("tsBitir-tsBasla = " + (tsBitir - tsBasla));


        System.out.println(" hs süresi");
        long hsBasla = System.currentTimeMillis();
        HashSet<String> hs = new HashSet<>();
        hs.add("ebik");
        hs.add("gabık");
        hs.add("falan");
        hs.add("feşmekan");
        hs.add("Agam");
        hs.add("bobrek yatagı");
        hs.add("poc güveç");
        hs.add("baklavaki");
        hs.add("Döngü");
        hs.add("google");
        hs.add("büyük");
        hs.add("veri");

        long hsBitir = System.currentTimeMillis();

        System.out.println("(hsBitir-hsBasla) = " + (hsBitir - hsBasla));
// treeSet yavaştır.

    }




}
