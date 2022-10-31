package BenimJava.j16_ArrayList.odev;

import java.util.Arrays;
import java.util.Scanner;

public class _20_Arrayboth_Ends_ok {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
Scanner scan = new Scanner(System.in);
        System.out.print("Array boyutunu girininiz ");
        int size = scan.nextInt();
        int sayi[] = new int[size];
        for (int i = 0; i <sayi.length ; i++) {
            System.out.println(i+". sayiyi giriniz = ");
            sayi[i] = scan.nextInt();
        }
        System.out.println("Girmiş olduğunuz Array "+Arrays.toString(sayi));
        
        int ilkson [] =new int[2];
        for (int i = 0; i < 2; i++) {
             ilkson[i] = sayi[(sayi.length - 1)*i];
            
        }

        System.out.println("ilk ve son elementleri : "+Arrays.toString(ilkson));
        
    }
}