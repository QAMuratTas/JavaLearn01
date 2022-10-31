package BenimJava.j12_Loops.L01_ForLoop.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task02_ok {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

Scanner sc=new Scanner(System.in);
        System.out.println("1.tamsayıyı giriniz: ");;
        int x=sc.nextInt();
        System.out.println("2.tamsayıyı giriniz: ");
                   System.out.println("Sayıların arasındaki fark 1 oldugundan dolayı aradaki tam sayıları veremiyorum");
             int y=sc.nextInt();
             if ((x-y)==1|| (y-x)==1) {
         } else
        if (x>y) {
            while (y<x-1){
                System.out.println(++y+" ");
                            }

        }else if (x<y) {
            while (x < y - 1) {
                System.out.println(++x + " ");
            }

        }
        else System.out.println("Sayılar eşit!!!!");

    }
}
