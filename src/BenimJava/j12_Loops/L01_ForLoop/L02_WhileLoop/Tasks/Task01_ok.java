package BenimJava.j12_Loops.L01_ForLoop.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01_ok {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */

int toplam=0;
int adet=0;

while (toplam<=333){
    Scanner sc=new Scanner(System.in);
    System.out.println("Bir Sayı giriniz: ");
    int a=sc.nextInt();
    adet++;
    toplam +=a;


}
        System.out.println("Girilen sayı adedi: "+adet+"\nToplam: "+toplam);


    }
}
