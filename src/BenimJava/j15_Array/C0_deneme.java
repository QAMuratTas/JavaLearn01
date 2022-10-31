package BenimJava.j15_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class C0_deneme {
    public static void main(String[] args) {
        String[] isim = {"murat","Nur","Enise","Murat"};

        ArrayList<String> isimlist = new ArrayList<>(Arrays.asList(isim));
        System.out.println(isimlist);
        isimlist.add("murat");
        System.out.println(isimlist);

    }
}
