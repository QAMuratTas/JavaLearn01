package BenimJava.j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01_ok {
    public static void main(String[] args) {
        /*
        task- > verilen İnt bir listin tek elemanlarının karesini tersten print eden code create ediniz
         */

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 8, 9, 10, 11));
        ListIterator<Integer> it = list.listIterator();
        System.out.println("Liste = " + list);
        double kare = 1;
        while (it.hasNext()) {
            int s = it.next();
            if (s%2==1){
                it.set((int) Math.pow(s, 2));



            }else it.remove();


        }
        System.out.println("Yukarıda verilen listenin tek sayılarının karesinin tersten listesi aşağıdaki gibidir...");
        while (it.hasPrevious()) {
            System.out.print(it.previous()+" ");

        }
    }
}