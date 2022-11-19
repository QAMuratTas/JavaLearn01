package BenimJava.day02;

import java.util.Scanner;

public class sesli_harf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir String giriniz :");
        String str = scanner.nextLine();

        String s = "aeiuıoöuü";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (s.charAt(i) == (str.charAt(j)))
                    System.out.println("girdiğiniz stringde " + s.charAt(i) + " sesli harfi bulunmaktadır. ");
            }

        }


    }
}
