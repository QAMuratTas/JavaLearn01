package BenimJava.j12_Loops.L01_ForLoop.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task07_ok {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz
        Scanner sc = new Scanner(System.in);
    int max=0;
    int i=1;
    int sayigir;
    while (i<=5){

        System.out.println(i+" . sayıyı giriniz:");

        sayigir=sc.nextInt();
        max=Math.max(max,sayigir);
        i++;
    }
        System.out.println("max="+max);

    }
}
