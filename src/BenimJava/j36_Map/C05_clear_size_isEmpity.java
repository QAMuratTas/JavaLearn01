package BenimJava.j36_Map;

import java.util.HashMap;

public class C05_clear_size_isEmpity {
    public static void main(String[] args) {

        HashMap<String ,String > hm=new HashMap<>();
        //map.size();-> Girilen map'in entry (giriş: eleman) sayısını return eder
        //map.clear();-> Girilen map'in tüm entry (giriş: eleman) siler boolean  return eder
        //map.isEmpity();-> Girilen map'in entry (giriş: eleman) varlığını kontrol eder
        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediaMarkt","183 Euro");


        System.out.println("hm = " + hm);
        System.out.println("hm.size() = " + hm.size());
        System.out.println("hm.isEmpty() = " + hm.isEmpty());
        hm.clear();
        System.out.println("hm.isEmpty() = " + hm.isEmpty());
        System.out.println("hm.size() = " + hm.size());


    }
}
