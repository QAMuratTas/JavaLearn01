package BenimJava.j15_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task-> Kullanıcıdan alınan değerlerle bir int array
        // elemanlarını büyükten küçüğe print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ağam kaç elemanlı array istiyorsun : ");
        int arrBoyut = scanner.nextInt();// boyutu belirlenmiş boş intt array
        int arr[] = new int[arrBoyut];
        for (int i = 0; i < arrBoyut; i++) {
            System.out.println(i + ". elemanı giriniz:");
            arr[i] = scanner.nextInt();

        }

        System.out.println("Ağam istediğin array oluştu = " + Arrays.toString(arr));
Arrays.sort(arr);// arr küçükten büyük e doğru sıralandı
        for (int i =arr.length-1 /*en büyük sondaki elemandan döngü başlar*/ ;i>=0; i--) {
            System.out.print(i+" = " + arr[i]);
            System.out.println(arr[i] + " ");
        }

/*
Arrays.sort(arr);//arr k->b sortingen yapıldı..
        for (int i = arr.length-1 -> en buyuk sondaki elemandan döngü başlar ;i>=0; i--) {
            System.out.print(arr[i] + " ") */
    }
}
