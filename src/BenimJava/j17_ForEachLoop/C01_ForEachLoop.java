package BenimJava.j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        /*
        for-each loop for loop un gelişmiş haldir.
        1. Clean code -yazım kolaylıgı
        2. code okuma kolaylıgı
        3. hata yapma riskini azaltır.
         */
        List<Integer> sayiList =new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        // taks -> list elemanlarını ayrı satırlara print ediniz.
        for (int i = 0; i <sayiList.size() ; i++) {
            System.out.println("sayiList.get(i) = " + sayiList.get(i));

            System.out.println("hello world");
        }
        for (Integer a:sayiList) {
            System.out.println(a + " ");
        }
        System.out.println("**********task 2 ********************************");
// task list elemanlarının ilk 3 eleman harşç tek olanarını print ediniz.
        for (Integer a:sayiList.subList(3, sayiList.size())) {
            if (a %2== 1) {
                System.out.println(a+" ");
            }
        }

        System.out.println("**********task 2 ********************************");
        // task lis telemanlarını 2 ile 5 index elemanların toplamını print edniz.
        int toplam=0;
        for (int b:sayiList.subList(2,6)){
            toplam +=b;

        }
        System.out.println("Toplam :"+toplam);
    }
}
