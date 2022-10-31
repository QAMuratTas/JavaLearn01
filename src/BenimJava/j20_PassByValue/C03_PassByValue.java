package BenimJava.j20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        java non-pirimitive data türlerinde referans obj nin kendisi değilde dataları değişirse
        obj referans ve kendisi değişmediği dataları değişikliği kalıcı yapar.
         */
        // task -> list elemanları 24,20,87 iki farklı method ile list elemanlarını
        // update edip print eden code create ediniz.
        // 1. method for each 2. method -> set ()

        List<Integer> list=new ArrayList<>(Arrays.asList(24,20,87));
        System.out.println("method öncesi list = " + list);//[24, 20, 87]
        listupdate1(list);//
        listUpdate2(list);//
        System.out.println("method sonrası list = " + list);//[48, 40, 174]-> Pass By referans

    }//main sonu

    public static void listupdate1(List<Integer> list) {
        for (Integer v:list) {

            v*= 2;

            System.out.println("30.satır"+ v);


        }


    }
    public static void listUpdate2(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);

        }
        System.out.println("list = " + list);

    }
}