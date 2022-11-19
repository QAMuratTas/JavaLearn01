package BenimJava.j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /* 
        Task ->
        Node değerleri "yakııp","javaCan","javaTAr","Teykinatyy" olan bir linkedlist create ediniz
        Girilen bir String değeri LinkedListte varlığını kontrol edip varsa silip "Ağam eleman halledildi"
        yoksa "Ağam aradığınız kişye ulaşılamadı" print eden code create ediniz
         */
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList( "yakup","javaCan","javaTAr","Teykinay","Murat","Zehra"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Ağam kime bakmıştınız : ");
        String aganınAdamı=sc.next();

        if (ll1.remove(aganınAdamı)){// true -> istenen node var ve silindi
            System.out.println("Ağam eleman halledildi");
            System.out.println("Ağanın adamı hallolduktan sonra : "+ll1);

        }else System.out.println("Ağam aradığınız kişye ulaşılamadı");


    }
}
