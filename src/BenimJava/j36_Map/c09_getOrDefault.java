package BenimJava.j36_Map;

import java.util.HashMap;

public class c09_getOrDefault {
    public static void main(String[] args) {
        HashMap<String ,String > hm=new HashMap<>();
        //map.getOrDefault(); -> Girilen key map de varsa key e ait value yoksa default değer return eder

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediaMarkt","183 Euro");

        System.out.println("hm = " + hm);
        System.out.println("hm.getOrDefault(\"Ebay\",\"ebikkabık\") = " + hm.getOrDefault("Ebay", "ebikkabık"));
        // ebay key map de var oldugu için Ebay keye ait value 234 Euro return oldu.
        System.out.println("hm.getOrDefault(\"ebik\",\"gabık\") = " + hm.getOrDefault("ebik", "gabık"));
        // ebik key map de olmadıgı için bu key default değer gabık atanıp return edildi

        System.out.println("hm = " + hm);
    }
}
