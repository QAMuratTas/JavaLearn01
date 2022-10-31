package BenimJava.j23_Varargs_StringBuilder.Varargs;

public class Task02 {
    public static void main(String[] args) {

/*
Task->
Girilen ilk sayı hariç diğrelerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
 */
        System.out.println("toplaCarp(2,24,23,38,33,21,59,26,10) = " + toplaCarp(2, 24, 23, 38, 33, 21, 59, 26, 10));
int arrTop[] ={24,23,38,38,21,59,26,10};
        System.out.println("toplaCarp(2,arrTop) = " + toplaCarp(2, arrTop));


    }//main sonu

    public static  int toplaCarp(int carpilacakSayi,int... toplanacakSayilar){
        int toplam =0;
        for (int a:toplanacakSayilar){
            toplam+=a;

        }
        return carpilacakSayi*toplam;

    }
/*
ArrayList<Integer> sayi  =new ArrayList<Integer>();
        while  (sc.nextInt()!=0) {
                sayi.add(sc.nextInt());
        }
        Integer []arr=sayi.toArray(new Integer[0]);
        System.out.println("hesapla(sayi) = " + hesapla(arr));
    }  //main sonu
    public static int hesapla(Integer... sayilar) {
        int x = 0;
        for (int i = 1; i < sayilar.length; i++) {
            x += sayilar[i];
        }
        x *= sayilar[0];
        return x;
    }
 */

}
