package Elly_Teacher.day11;

import java.time.LocalDate;
import java.util.Scanner;

public class Q04_NumberOfDaysMonths {
    public static void main(String[] args) {
        /*
Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

INPUT:
Ay Numarasi:
2
Yil :
2016
OUTPUT :
Subat 2016 29 Gundur.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Ay no :"); int month = scan.nextInt();
        System.out.println("Yil :"); int year = scan.nextInt();

        LocalDate date = LocalDate.of(year, month,1);
        System.out.println(date.getMonth()+ " " + date.getYear()+" "+date.lengthOfMonth()+" days.");








    }
}
