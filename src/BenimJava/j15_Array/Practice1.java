package BenimJava.j15_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
// Task-> Kullanıcıdan alınan değerlerle bir int array
        // elemanlarını büyükten küçüğe print eden code create ediniz
        Scanner sc=new Scanner(System.in);
        System.out.println("Arrayin boyutunu giriniz :");
        int byt = sc.nextInt();
        int arr[]=new int[byt];
        for (int i = 0; i <byt ; i++) {
            System.out.println(i+". sayıyı giriniz:");
            arr[i] = sc.nextInt();


        }

        System.out.println("arr"+ Arrays.toString(arr));

Arrays.sort(arr);
        System.out.println("Sıralanmış(arr) = " + Arrays.toString(arr));
        for (int i = byt-1; i >=0 ; i--) {

            System.out.print(" " + arr[i]);
        }

    }
}
