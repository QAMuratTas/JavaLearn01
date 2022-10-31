package BenimJava.j16_ArrayList.odev;

public class _03_Create_array3_int_ok {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

int sayi[]={25,30,30,35,100};
int toplam=0;
        for (int i = 0; i <sayi.length ; i++) {
            toplam += sayi[i];
        }
        System.out.println("toplam = " + toplam);

    }
}