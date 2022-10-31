package BenimJava.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // bir listte istenen sayının varlığını kontrol eden code create ediniz.

        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));

Scanner sc=new Scanner(System.in);
        System.out.println("ağama hangi sayi arirsen: ");
        int ara =sc.nextInt();
        boolean varmi=false;
        for (int i = 0; i <listSayi.size() ; i++) {
            if (listSayi.get(i) == ara) {
                varmi=true;
                System.out.println("ağam aradıgın sayı bizde mevcut : )");
                break;
            }

        }
        if (!varmi) {
            System.out.println("ağam aradıgın sayı maalesef :(  ");
        }













    }
}
