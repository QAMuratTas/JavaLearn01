package BenimJava.j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {


    /*
    Queue coll. interface oldugu için child class olan LınkedList ve PriorityQueue
    ile obje üretilir.
    Eczane ,yemekhane vs belirli bir şart ile aksiyon olan elemanlar için kullanılır.
    Cons. seçimine göre queue obj özellikleri belirlenir
     FİFO-> first in first out : Coll. ilk giren eleman ilk çıkar. Eleman en sona eklenir


     */

        Queue<String> q1 = new LinkedList<>(Arrays.asList("Cebrail","Sümeyra","Yakup","Muharrem"));
        System.out.println("q1 = " + q1);
    q1.add("Erol");
        System.out.println("q1 = " + q1);
        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("Javacan","JavaSu","JavaNaz","javİYE"));
        System.out.println("q2 = " + q2);

        q2.add("javİDAN");
        System.out.println("q2 = " + q2);

        System.out.println("q1.element() = " + q1.element());
        System.out.println("q1.peek() = " + q1.peek());
        System.out.println("q1.remove() = " + q1.remove());
        System.out.println("q1.poll() = " + q1.poll());
        System.out.println("q1 = " + q1);

        // peek() -> copy paste gibi ilk elemanı return eder ama silmez
        // poll() -> cut paste gibidir ilk elemanı siler ve return eder.
        // element() -> ilk elemanı silmeden return eder.
        // remove() -> ilk elemanı siler ve return eder.
        // ahan da Trick köşeisnde bugün : poll() ve remove() farkı -> eğer queue coll. boş ise remove NoSuchElementException fırlatır
        // poll ise null return eder.
        q1.clear();// queue collection temizlendi
        System.out.println("q1 = " + q1);
        System.out.println("q1.size() = " + q1.size());
        System.out.println("q1.poll() = " + q1.poll());
        //System.out.println("q1.remove() = " + q1.remove());// NoSuchElementException fırlattı

        // offer() -> queue coll. eleman eklemek için kullanır
        System.out.println("q2.offer(\"küşleme\") = " + q2.offer("küşleme"));
      /*
ahan da Trick kösesinde bugun : offer ve add farkı ->  eger queue coll. eleman kısıtlaması yapılmış ise
 add meth Exception fırlatır.offer ise true-false return eder.

*/

    }

}
