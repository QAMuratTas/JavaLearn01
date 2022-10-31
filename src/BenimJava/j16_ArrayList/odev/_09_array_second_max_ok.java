package BenimJava.j16_ArrayList.odev;

import java.util.Arrays;

public class _09_array_second_max_ok {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */
int[] sayi = new int[]{15, 25, 22, 18, 30};
        System.out.println("Arrayin ilk hali sayi = " + Arrays.toString(sayi));

   Arrays.sort(sayi);
        System.out.println("Sıraladıktan sonraki hali. sayi = " + Arrays.toString(sayi));

        System.out.println("sayi[sayi.length-2] = " + sayi[sayi.length - 2]);//25
    }
}