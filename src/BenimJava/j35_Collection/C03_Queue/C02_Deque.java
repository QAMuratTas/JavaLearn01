package BenimJava.j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {
        /*
        Deque : Double Ended Queue -> Queue larda FİFO Deque lerde hem FİFO hem LİFO geçerli
        LİFO : Last in First Out
         */
        Deque<String> dq1 = new LinkedList<>(Arrays.asList("Küşleme","önKOl","Böbrek Yatağı","ezme","haydari"));
        System.out.println("dq1 = " + dq1);

        dq1.add("humus");
        System.out.println("dq1 = " + dq1);

        System.out.println("dq1.getFirst() = " + dq1.getFirst());
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.getLast() = " + dq1.getLast());
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.peekFirst() = " + dq1.peekFirst());
        System.out.println("dq1 = " + dq1);
        System.out.println("dq1.peekLast() = " + dq1.peekLast());
        System.out.println("dq1 = " + dq1);
        /*
        Ahan da Trick -> getFirst() meth deque coll. boş ise NoSuchElementException fırlatır
        peekFirst() meth  deque boş ise null return eder
         */

        dq1.clear();
        System.out.println("dq1 = " + dq1);
        System.out.println(dq1.peekFirst());
       // System.out.println("dq1.getFirst() = " + dq1.getFirst());
        System.out.println("Ağam selametle app. run oldu dewamkee");

        Deque<String> dq2 = new LinkedList<>(Arrays.asList("Havuç dilimi","güllaç","Muhallebi","trileçe","Kazan dibi"));

        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());

        System.out.println("dq2.pollLast() = " + dq2.pollLast());

        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());

        System.out.println("dq2.removeLast() = " + dq2.removeLast());
        System.out.println("Ağam selametle app run oldu Dewamkee");

        dq2.clear();
        System.out.println("dq2.pollFirst() = " + dq2.pollFirst());

        System.out.println("dq2.pollLast() = " + dq2.pollLast());

        System.out.println("dq2.removeFirst() = " + dq2.removeFirst());

        System.out.println("dq2.removeLast() = " + dq2.removeLast());
        System.out.println("Ağam selametle app run oldu Dewamkee");

    }
}
