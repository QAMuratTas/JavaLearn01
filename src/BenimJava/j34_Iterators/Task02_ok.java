package BenimJava.j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task02_ok {
    public static void main(String[] args) {

        /*

        task->
   Bir listedeki istenen sayi araliginda olmayan-> 20den kck 40 dan byk
   elementleri silip print eden code create ediniz
   (2. liste olusturmadan, gecerli liste uzerinde iterator ile islem yapiniz)
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
output: [23,40]
         */

        List<Integer> list = new ArrayList<>(Arrays.asList(2,13,56,23,45,14,40));
        System.out.println("list = " + list);
        ListIterator it = list.listIterator();

        while (it.hasNext()){

            int s= (int) it.next();
            if (s>=20 && s<=40){


            }else it.remove();


        }

        System.out.println("Yukarıda verilen listenin 20 ve 40 arasındaki sayıları listeleniyor... ");
        while (it.hasPrevious()) {
    System.out.print(it.previous()+ " ");

}








    }
}
