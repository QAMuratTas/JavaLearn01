package BenimJava.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task08 {
    public static void main(String[] args) {
        // Girilen sayıların içinde ortalamadan büyük olanları print eden method create ediniz.


        List<Integer> listSayi = new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        int toplam =0;
        for (int i = 0; i <listSayi.size() ; i++) {
            toplam+=listSayi.get(i);
        }
        int ortalama=toplam/listSayi.size();
        System.out.println("ortalama = " + ortalama);
        for (int i = 0; i <listSayi.size() ; i++) {
            if (listSayi.get(i)>ortalama) {
                System.out.print(listSayi.get(i)+" ");
            }
        }
    }
}
