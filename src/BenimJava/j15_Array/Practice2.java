package BenimJava.j15_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        //task ->girilen int array elemanları toplamını print eden code creat ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.println("Arrayin boyutunu giriniz :");
        int byt = sc.nextInt();
        int arr[]=new int[byt];
        for (int i = 0; i <byt ; i++) {
            System.out.println(i+". sayıyı giriniz:");
            arr[i] = sc.nextInt();

        }
        System.out.println("arr = " + Arrays.toString(arr));
       int toplam=0;
        for (int i = 0; i <byt-1 ; i++) {
            toplam +=arr[i];
        }
        System.out.println("toplam = " + toplam);

    }
}
