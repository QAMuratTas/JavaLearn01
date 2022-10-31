package BenimJava.j15_Array;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {



        /*
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */
        // Array tanımlamam
        int a;//declare edilen ama atanmayan primitive data
        int Arr[];// declare edilen ama atanmayan int type array
        // tanımlanan array atama yapılmadan kullanılmaz....

        String isimArr[] = { "enise", "cebrail", "nazım", "özge"};// hem tanımlama hem atama yapılan String Array
        //String isimArr[] ={"muharrem","enise","cebrail","nazım","özge"};// hem tanımlama hem atama yapılan String Array
        int sayiArr[] = new int[5];//Java heap memory'de 5 default ->0 olan int array creat edildi.
        //[0,0,0,0,0]

        //Array a eleman ekleme
        sayiArr[2] = 34;
        sayiArr[0] = 35;
        sayiArr[1] = 13;
        sayiArr[3] = 99;
        sayiArr[0] = 34;
        sayiArr[4] = 33;
        // 0 index array elemanı 34 değeri ile update edildi.
        // Array elemanları unıqe olmak zorunda olmak zorunda değildir. tekrarlı olabilir.

        // Array eleman sayısı boyut değeri

        System.out.println("sayiArr.length = " + sayiArr.length);//5
        // Array son elemanı
        System.out.println("Array son elemanı = " + isimArr[isimArr.length - 1]);//özge
        isimArr[isimArr.length - 1] = "QA Özge Hnaım";//array son eleman update edildi.

        //Array de olmayan eleman
        // sayiArr[11]=23;
        // cte vermez ama olmayan eleman rte verir->array run time da oluşur.

// okkalı bir trick -> sayıArr[11] =23;cte vermez ama olmayan eleman rte verir->array run time da oluşur

        // Array elemanları print etme
        for (int i = 0; i < isimArr.length; i++) {
            System.out.println(isimArr[i] + " ");


        }
        System.out.println("sayiArr = " + sayiArr);
        System.out.println("isimArr = " + isimArr);
        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));// isim array sttringe çevirdi
// Task -> sayıArr elemanlarından değeri tek olanları print eden code create ediniz.
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i] % 2 == 1) {
                System.out.println("Tek olan sayımız  = " + sayiArr[i] + " ");
            }

        }

// task -> sayıArr cift index elemanları print eden code create ediniz.
        for (int i = 0; i < sayiArr.length; i += 2) {
            System.out.println("Çift index olan sayılar :" + sayiArr[i]);

            // task -> isimArr 5 harfli elemanlarından oluşan arrayım elemanlarını print eden code create ediniz.
        }
        String yeniArr[] = new String[isimArr.length];// isimArr elemanı kadar boş yeni array
        for (int j = 0; j < isimArr.length; j++) {
            if (isimArr[j].length() == 5) {
                yeniArr[j] = isimArr[j];
            }

        }
        System.out.println("5 elemanlı array " + Arrays.toString(yeniArr));






/*
int a;//declare dilen ama atanmayan primitive data
        int arr[];//declare (tanımlanan) edilen ama atanmayan int type array
        //tanımlanan array atama yapılmadan kullanılamaz...

        String isimArr[] = {"muharrem", "enise", "cebrail", "nazım", "özge"};// hem tanımlama hem atama yapılan String array
        //String [] isimArr1 ={"muharren","enise","cebrail","nazım","özge"};// hem tanımlama hem atama yapılan String array
        int sayıArr[] = new int[5];//java heap memorhy'de 5 default->0 olan int array  create edildi
        // [0,0,0,0,0]


        // Array'a eleman ekleme...
        sayıArr[2] = 34;
        sayıArr[0] = 35;
        sayıArr[1] = 34;
        sayıArr[3] = 61;
        sayıArr[0] = 34;//  0 index array elamanı 34 değeri ile update edildi
        //array elemanlrı uniqe olmak zorunda değildir tekrarlı array elamnı olabilir.

        // Array eleman sayısı boyut değeri...

        System.out.println("sayıArr.length = " + sayıArr.length);//5


        // Array son elemanı ...
        System.out.println("array son elemanı :" + isimArr[isimArr.length - 1]);//özge
        isimArr[isimArr.length - 1] = "QA Özge hanım";//array son eleman update edildi.


        // Array de olmayan eleman

        //okkalı bir TRICK ->  sayıArr[11]=23;//cte vermez ama olmayan eleman rte veririr-> array run time da oluşur


        // Array elamanları print etme...
        for (int i = 0; i < isimArr.length; i++) {
            System.out.print(isimArr[i] + " ");
        }
        System.out.println();
        System.out.println("isimArr = " + isimArr);//isimArr = [Ljava.lang.String;@79698539 -> isimArr referans değeridir
        System.out.println(Arrays.toString(isimArr));//isim Array sitringe çevrildi.


        // task-> sayıArr elemanlarından değeri tek olanları print eden code create ediniz

        for (int i = 0; i < sayıArr.length; i++) {
            if (sayıArr[i] % 2 == 1) {
                System.out.println(sayıArr[i] + " ");
            }
        }
        // task-> sayıArr cift index  elemanları  print eden code create ediniz.
        for (int i = 0; i < sayıArr.length; i+=2) {
            System.out.print(sayıArr[i] + " ");//34 34
        }
     // task-> isimArr 5 harfli elemanlarında oluşan arrayın  elemanlarını  print eden code create ediniz.
        String yeniArr[]= new String[isimArr.length];//isimArr elemanı kadar boş yeni arr
        int koltukSayısı=0;
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length()==5){
                koltukSayısı++;//yeniArr[i]=isimArr[i];
            }
        }
        System.out.println(koltukSayısı);//2
      //  System.out.println(Arrays.toString(yeniArr));//


 */


        // Array elemanları naturel (k->b : ascending , b->k descending ,alfabetik) sıralama için sort() ; method kullanılır.


        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));//sırlama öncesi ->[muharrem, enise, cebrail, nazım, QA Özge Hnaım]

        Arrays.sort(isimArr);//isimArr elemanları naturel sıralanır->[QA Özge Hnaım, cebrail, enise, muharrem, nazım]

        System.out.println("Sıralama sonrası isimArr = " + Arrays.toString(isimArr));
        System.out.println("Arrays.toString(sayıArr) = " + Arrays.toString(sayiArr));//sırlama öncesi
        Arrays.sort(sayiArr);
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));// sıralama sonrası

        System.out.println("isimArr = " + isimArr);//isimArr = [Ljava.lang.String;@2d554825
    }


}
