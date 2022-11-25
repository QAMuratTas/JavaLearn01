package BenimJava.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_reduce {
    public static void main(String[] args) {
       List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        //List<Integer> sayi= new ArrayList<>(Arrays.asList(11,3,5,7)); //Optional.empty verir consolda.filter olarak çift sartı null vereceği için optional ataması empty.
        //List<Integer> sayi= new ArrayList<>(Arrays.asList(1,3,5,4,6,12,8));
        System.out.println("\n      *******           ");
        ciftElKareByk(sayi);
        System.out.println("\n   ***** **** ****");
        elTopla(sayi);
        System.out.println("\n   ***** **** ****");
        ciftElCarpprint(sayi);
        System.out.println("\n   ***** **** ****");
        minBul(sayi);
        System.out.println("\n   ***** **** ****");
        elByktek(sayi);

        // Lambda -> Stream API

/*
reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
kullanımı yaygındır pratiktir.
Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

*/


    }//main sonu
    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz

    public static void ciftElKareByk(List<Integer> sayi) {
        Optional<Integer> maxEleman = sayi.stream().// filter işlemi null değer return etme riskine karşı optional class type data casting ypıldı
                filter(C01_LambdaExpression::ciftMi).//akıştaki elemanları listedeki çift filtrelendi
                map(t -> t * t).// filtrelenen çift akış elemanları karesi ile update edildi
                reduce(Integer::max);//çift filtrelenen ve karesi alınan akış elemanları ma elemana göre reduce ->azaltıldı.
        System.out.println(sayi.stream().
                filter(C01_LambdaExpression::ciftMi).//akıştaki elemanları listedeki çift filtrelendi
                        map(t -> t * t).// filtrelenen çift akış elemanları karesi ile update edildi
                        reduce(Math::max));//reduce(Integer::max) da oluyor. spesifik class daha hızlı çalıştır. Integer MAth class a göre daha dardır bu yüzden hızlıdır.
        System.out.println("maxEleman = " + maxEleman);


    }
// task-> Listteki Tüm elemanların toplamını print ediniz

    public static void elTopla(List<Integer> sayi) {

        System.out.println(sayi.stream().reduce(Integer::sum));

        Optional<Integer> toplam = sayi.stream().reduce(Integer::sum);
        System.out.println("toplam = " + toplam);
        sayi.stream().reduce(0, (a, b) -> a + b);//Lambda expression
        /*
        a: ilk değerini her zaman atanan identity değerden alır.
        b: değerini her zaman stream akışından alır.
        a ilk değerden sonraki değerlerini action (işlem body)' den alır.
        */
        System.out.println("\n        ***********");
        System.out.println(" "+sayi.stream().reduce(0, (a, b) -> a + b));

    }

// Task: Listteki çift elemanların çarpımını yazdırınız
    public static void ciftElCarpprint (List<Integer> sayi) {


        System.out.println("\n        ***********");

        System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).reduce(Math::multiplyExact));// math class dan meth refere

        System.out.println("     \n       Lambda expression ***********");
        System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).reduce(1, (a, b) -> a * b));// lambda expression  bad practice

    }


// Task ->  Listtdeki elemanladan en kucugunu 4 farklı yontem ile print ediniz.

    public static void minBul(List<Integer> sayi) {
        System.out.println("1. yol :    "+sayi.stream().reduce(Math::min));// method refere
        System.out.println("2. yol :    "+sayi.stream().reduce(Integer::min));//method refere
        System.out.println("3. yol :    "+sayi.stream().reduce(C04_reduce::byMuratMinBul));//method refere
        System.out.println("4. yol :    "+sayi.stream().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u));// lambda expression bad practice
// ilk üçünün optional sonuç vermesi başlangıç değerlerinin olmamasında kaynaklanıyor. yani liste boş olabilir. ama 4 . yol da başlangıç değer old.
        // oldugu için her durumda sayı vereceği içim optional vermedi.
    }
        public static int byMuratMinBul (int a,int b) {
        return a<b? a:b;
        }
        //Task : List teki 24 'ten büyük en küçük tek sayıyı print ediniz.

    public static void elByktek(List<Integer> sayi) {
        System.out.println(sayi.stream().filter(t -> t % 2 == 1 && t > 24).reduce(Integer::min));
       //System.out.println(sayi.stream().filter(t -> t > 24 && C01_LambdaExpression::ciftMi).reduce(Integer::min));

    }



}
