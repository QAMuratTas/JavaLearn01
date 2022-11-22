package BenimJava.j36_Map;

import java.util.HashMap;

public class C11_putIfAbsent {
    public static void main(String[] args) {
        HashMap<String ,String > hm=new HashMap<>();
        //map.putIfAbsent();->Girilen key map'de yok ise   entry(key,value) map'e ekler ve null return eder,
        // girilen key map'de var ise key'e ait value  return eder.

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediaMarkt","183 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.putIfAbsent(\"ebik\",\"gabık\") = " + hm.putIfAbsent("ebik", "gabık"));
        System.out.println("hm.putIfAbsent(\"Ebay\",\"javaNAZ\") = " + hm.putIfAbsent("Ebay", "javaNAZ"));
        System.out.println("hm = " + hm);


    }
}
