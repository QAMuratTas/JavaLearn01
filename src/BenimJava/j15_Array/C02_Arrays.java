package BenimJava.j15_Array;

import java.util.Arrays;

// Amele kod bu
public class C02_Arrays {
    public static void main(String[] args) {
        // Array elemanı varlığını kontrol etme
        int arr[]={67,97,20,63,43,34,54,24,16,7,55,17};

        int sayi =67;
        boolean flag = false;//bayrak
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == sayi) {
                flag = true;

            }

        }
        if (flag == true) {
            System.out.println("Aradığınız Sayı Array de var :)" );

        }else {
            System.out.println("Aradığınız Sayı Array de yok :)");
        }
// best code
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        Arrays.sort(arr);//Array elemanları sıralandı
        System.out.println(Arrays.binarySearch(arr, 34));
        System.out.println(Arrays.binarySearch(arr, 38));
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

// trick -> binarysearch methodu arrayde olmayan elemanı çalışırsa sonuç olarak
        // eğer olsaydı kaçıncı sırada olurdu cevabını verirdi.(-)

        System.out.println(Arrays.binarySearch(arr, 99));//-13
        System.out.println(Arrays.binarySearch(arr, 5));//-1


    }
}
