package BenimJava.j36_Map;

import java.util.HashMap;

public class C02_keySet_values {
    public static void main(String[] args) {
        HashMap<String ,String > hm=new HashMap<>();
        //map.keySet();-> map key değerlerini Set 'e atayıp return eder
        // map.values();-> map value değerlerini coll. atayıp return eder



     hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");//value dağeri null atanabilir
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediaMarkt","183 Euro");
        System.out.println("hm"+hm);

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        //Task -> hm key ve value değerlerini satır satır print eden code create ediniz . with loop (for each)
        System.out.println("****************");
        for (String s:hm.keySet()  ) {// key
            System.out.print( s+" ");
        }
        System.out.println();
        for (String w:hm.values() ) {//value
            System.out.print(w+" ");
        }

    }
}
