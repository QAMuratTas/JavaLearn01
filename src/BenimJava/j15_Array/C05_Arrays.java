package BenimJava.j15_Array;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Array copy... copyof(arr,newLength);->girilen arr in newLenght kadar ilk elemanını copy eder.
        int sayi[]={63,21,47,27,35,12,36,31,466,24};

        int yeniArr []= Arrays.copyOf(sayi,5);
        System.out.println("SAyı dan 5 eleman kopyalama yenir arr = " + Arrays.toString((yeniArr)));

int baskaARR[]=Arrays.copyOfRange(sayi,3,8);// 3 dahil 8 hariç index elemanlar kopyalanır->3,4,5,6,7

        System.out.println("Sayı arr'den özel kopyalanan bask arr "+Arrays.toString(baskaARR));
// Array'i belirli bir eleman ile update (set) etme... fill(arr,value);
Arrays.fill(sayi,99);
        System.out.println("sayi Array i 99 ile fullenmiş hali " + Arrays.toString(sayi));
Arrays.fill(sayi,3,7,33);//3.4.5.6. index elemanlar 33 ile update edildi.
        System.out.println("sayi Array 3 ile 7 arası index  33 ile fullenmiş hali " + Arrays.toString(sayi));




    }
}
