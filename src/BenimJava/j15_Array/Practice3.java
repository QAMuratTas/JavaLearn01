package BenimJava.j15_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        // task-> girilen bir int array elemanlarından ortalamadan
        // büyük olan eleman sayısını print eden code create ediniz..
        Scanner sc=new Scanner(System.in);
        System.out.println("Arrayin boyutunu giriniz :");
        int byt = sc.nextInt();
        int arr[]=new int[byt];
        for (int i = 0; i <byt ; i++) {
            System.out.println(i + ". sayıyı giriniz:");
            arr[i] = sc.nextInt();
        }

            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int toplam=0;
        for (int i = 0; i <byt ; i++) {
            toplam += arr[i];

        }
        System.out.println("toplam = " + toplam);
       double  ortalama = toplam/byt;
        for (int i = 0; i <byt; i++) {
            if (arr[i]>=ortalama){
                System.out.println("Ortalamadan büyük sayımız : "+arr[i]);

            }

        }



    }
}
