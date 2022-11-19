package BenimJava.j35_Collection.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

public class C01_HashSet {
    public static void main(String[] args) {

        HashSet<String> hs= new HashSet<>();
        HashSet<String> hs1= new HashSet<>(Arrays.asList("Ercan","Yakuo","Adem","Rukiye","Nur"));// atamsı yapılan bir hashset
        //Set Print etme...
        System.out.println("hs1 = " + hs1);
        hs1.add("Kevser");
        System.out.println("hs1 = " + hs1);
        hs1.add("Adem");
        System.out.println("hs1 = " + hs1);
        hs1.add(null);
        hs1.add(null);
        hs1.add(null);
        System.out.println("hs1 = " + hs1);// dublicate izin vermedi

        HashSet<String> hs2= new HashSet<>(Arrays.asList("Başarı","Gayrete","Aşıktır"));
        System.out.println("hs2 = " + hs2);
        hs1.addAll(hs2);
        System.out.println("hs1 = " + hs1);
        System.out.println("hs1.remove(\"Aşıktır\") = " + hs1.remove("Aşıktır"));
        System.out.println("hs1.remove(\"Aş\") = " + hs1.remove("Aş"));// olmayan eleman silinirse
        System.out.println("hs1 = " + hs1);

        System.out.println("hs1.removeAll(hs2) = " + hs1.removeAll(hs2));
        System.out.println("hs1 = " + hs1);

        System.out.println("hs1.isEmpty() = " + hs1.isEmpty());
        hs1.clear();
        System.out.println("isEmpity"+hs1.isEmpty());
        System.out.println("hs1 = " + hs1);

        System.out.println("hs2.contains(\"Başarı\") = " + hs2.contains("Başarı"));
        System.out.println("hs2.contains(\"JavaNaz\") = " + hs2.contains("JavaNaz"));

        System.out.println("hs2.hashCode() = " + hs2.hashCode());

    }
}
