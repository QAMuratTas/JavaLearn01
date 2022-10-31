package BenimJava.j16_ArrayList.odev;

public class _11_Average_of_Array_ok {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */
int sayi []={12,14,21,23,10,4};
int toplam=0;
        for (int i = 0; i <sayi.length ; i++) {
            toplam+=sayi[i];


        }
int ortalama;
        ortalama =toplam/sayi.length;
        System.out.println("ortalama = " + ortalama);


    }
}