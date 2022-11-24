package BenimJava.j36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
        /*
        TreeMap->
        1- TreeMap key lerde null değer tanımlamaz . fakat valuelarda null değer tanımlanabilir.
        2- TreeMap elemanlarının key NATUREL ORder 'a göre tanımlanır
        3- TreeMap synchronized ve thread-safe değildir
        4- TreeMap en yavaş map türüdür. app hızı için kullanırken çooook dikkat edilmeli...
         */

        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(101, "Uğur Bey");
        tm.put(102, "Enise");
        tm.put(103, "KEvser");
        tm.put(104, "Fatih");
        tm.put(105, "Emine");
        System.out.println("tm = " + tm);
        //tm.put(null,"Fatih"); NullPointerException
        tm.put(104, "Hüma");// 104 key değeri Hüma value değeri ile update edildi.
        tm.put(106, null);
        tm.put(107, null);

        System.out.println("tm = " + tm);
        HashMap<String, String> hm = new HashMap<>();


        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");//value dağeri null atanabilir
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");
        System.out.println("hm" + hm);
        TreeMap<String, String> tm1 = new TreeMap<>(hm);// hm tree map e atandı .convert edildi.
        //TreeMap <String, String> tm2 = hm; CTE - datatype missMatch
        System.out.println("tm1 = " + tm1);
        System.out.println("tm.ceilingKey(103) = " + tm.ceilingKey(103));//103 ceilingKey(103) method parametre olarak girilen key değer map de varsa return eder
        // yoksa parametreden büyük en küçük key değerini return eder.
        // parametre map de yok ve parametreden büyük en küçük key de yoksa null return eder.
        //ceilingKey(key) -> en küçük abi-abla
        System.out.println("tm.ceilingKey(108) = " + tm.ceilingKey(108));//null
        System.out.println("tm.ceilingKey(100) = " + tm.ceilingKey(100));//101
        System.out.println("tm.ceilingKey(1) = " + tm.ceilingKey(1));//101 1 den büyük key 101
        System.out.println("tm.ceilingKey(110) = " + tm.ceilingKey(110));//null 110 dan büyük en küçük key yok

        // ascending order -> artan sıralama
        // descending order -> azalan sıralama

        System.out.println("tm.descendingKeySet() = " + tm.descendingKeySet());//azalan sıryla
        System.out.println("tm.keySet() = " + tm.keySet());// bütün key leri set e atıp getiriyor.
        System.out.println("tm.firstKey() = " + tm.firstKey());
        System.out.println("tm.lastKey() = " + tm.lastKey());


    }

}
