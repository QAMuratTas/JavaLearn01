
// bunu elinle tekrar yazacaksın .....

package BenimJava.j13_Break_continiue.HaftaninTaskiii;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner oku = new Scanner(System.in);
        int sayi, k = 0;
        System.out.println("sayi gir");
        sayi = oku.nextInt();

        while (sayi > 1) { //sayi birden küçük olana kadar içeresindeki işlemi yapacak

            if (sayi % 2 == 0) {
                k = 1;
            } else { //eğer kalan bir ise kuvveti değildir.
                k = 2;
                break; //cıksın sistemi yormasın tekrar tekrar
            }
            sayi = (sayi / 2);
        }
        if (1 == k) {
            System.out.println("evet");

        } else {
            System.out.println("hayır");
        }

//        for çözüm
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı girin");
        int sayı = sc.nextInt();
        System.out.println(PowersofTwo(sayı));
    }
    private static boolean PowersofTwo( int a){
            boolean ikiKuvvet = true;
            for (int i = 2; i < a; i *= 2) {

                if (a % i != 0) {
                    ikiKuvvet = false;
                }
            }
            return ikiKuvvet;
        }
    }


















