package BenimJava.j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("JavaCan","Ebubekir","Gülsüm","Ebubekir","Adem","ilker","javaCan","Merve"));
        // linkedlist remove

        System.out.println("remove öncesi ll1 = " + ll1);
        System.out.println("ll1.remove() = " + ll1.remove());
        System.out.println("ll1 = " + ll1);
        System.out.println("ll1.remove(3) = " + ll1.remove(3));// silinen node return ederi
        System.out.println("ll1 = " + ll1);
        System.out.println("ll1.remove(\"Merve\") = " + ll1.remove("Merve"));//true
        System.out.println("ll1.remove(\"javaTar\") = " + ll1.remove("javaTar"));//false
        System.out.println("ll1.removeFirstOccurrence(\"Ebubekir\") = " + ll1.removeFirstOccurrence("Ebubekir"));// tekrardaki elemanın ilk gördüğünü siler
        System.out.println("ll1 = " + ll1);
        System.out.println("ll1.element() = " + ll1.element());// ilk node return eder -->

        LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("JavaCan","Ebubekir","Gülsüm","Ebubekir","Adem","ilker","javaCan","Merve"));
        LinkedList<String> ll3 = new LinkedList<>(Arrays.asList("Hasan","Hamza","Haluk","Hasmayan"));
        ll2.addAll(ll3);
        System.out.println("ll2 = " + ll2);
        System.out.println("ll2.removeAll(ll3) = " + ll2.removeAll(ll3));//true
        System.out.println("ll2 = " + ll2);
        // LinkedList get () getFirst() getLast() .. girilen index ve ilk son node return eder.
        System.out.println("ll2.get(2) = " + ll2.get(2));
        System.out.println("ll2.getFirst() = " + ll2.getFirst());
        System.out.println("ll3.getLast() = " + ll3.getLast());

    }
}
