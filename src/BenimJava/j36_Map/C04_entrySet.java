package BenimJava.j36_Map;

import java.util.HashMap;
import java.util.Map;

public class C04_entrySet {
    public static void main(String[] args) {
        HashMap<String ,String > hm=new HashMap<>();
        //map.entrySet();-> Girilen map in key vaue tum datalarını Set'e atayıp return eder.

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediaMarkt","183 Euro");


        System.out.println("hm = " + hm);

        System.out.println("hm.entrySet() = " + hm.entrySet());

        for (Map.Entry<String, String> e:hm.entrySet()) {
            System.out.println("e.getValue() = " + e.getValue());

        }


    }
}
