package BenimJava.j15_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elemanlarından ortalamadan
        // büyük olan eleman sayısını print eden code create ediniz..

        Scanner sc = new Scanner(System.in);

        System.out.print("agam kaç elemanlı array istirsen : ");
        //int arrBoyut = sc.nextInt();

        int arr[] = new int[sc.nextInt()];//boyutu belirlenmiş boş int array

        for (int i = 0; i < arr.length; i++) {// bu loop array elemanların atamasını yapar
            System.out.print(i + ". index  elemanı giriniz : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("agam istedgin array : " + Arrays.toString(arr));
        int arrToplam = 0;//local var.


        for (int i = 0; i < arr.length; i++) {// bu loop array elemanlarını toplar
            arrToplam += arr[i];
        }
        System.out.println("array eleman toplamları : " + arrToplam);
        int ortalamayiGecenElemanSayisi =0;
int arrOrtalama=arrToplam/arr.length;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>arrOrtalama ){
                ortalamayiGecenElemanSayisi++;
            }

        }
        System.out.println("arrOrtalama = " + arrOrtalama);
        System.out.println("ağam girdiğin arrray elemanlarından ortalamayı geçen eleman sayısı : "+ortalamayiGecenElemanSayisi);

    }
}
