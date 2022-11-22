package BenimJava.j36_Map;

import java.util.HashMap;

public class C07_containsKey_containsValue {
    public static void main(String[] args) {
        HashMap<String ,String > hm=new HashMap<>();
        //map.containsKey();-> Girilen key değerini map de varlgını kontrol eder boolean return eder
        //map.containsValue();-> Girilen vale değerini map de varlgını kontrol eder boolean return ed

        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediaMarkt","183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.containsKey(\"Amazon\") = " + hm.containsKey("Amazon"));
        System.out.println("hm.containsKey(\"amazon\") = " + hm.containsKey("amazon"));
        System.out.println("hm.containsValue(\"111 Euro\") = " + hm.containsValue("111 Euro"));
        System.out.println("hm.containsValue(\"ebikgabık\") = " + hm.containsValue("ebikgabık"));


    }
}
