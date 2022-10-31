package BenimJava.j12_Loops.L01_ForLoop.L02_WhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca_ok {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Random r=new Random(); //random sınıfı
        int a=r.nextInt(100);
        Scanner scan=new Scanner(System.in);
        System.out.println("Bilgisayarın tuttuğu 1-100 arası sayıyı tahmin ediniz..:");
        int tahmin=scan.nextInt();
        int thmadet=1;
        while( tahmin!=a) {
            if (tahmin<a){
                System.out.println("Tahmininiz düşük. Daha büyük bir sayı giriniz. :");
                tahmin=scan.nextInt();
                thmadet++;



            }else {
                System.out.println("Tahmininiz yüksek. Daha küçük bir sayı giriniz: ");
                tahmin=scan.nextInt();
                thmadet++;
            }
        }


        System.out.println("Bravo "+thmadet+" tahminde sayıyı buldunuz..");



    }

}
