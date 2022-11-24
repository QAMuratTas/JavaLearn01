package BenimJava.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_reduce {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        //  List<Integer> sayitek = new ArrayList<>(Arrays.asList(11,3,5,7)); Optional.empty verir consolda.filter olarak çift sartı null vereceği için optional ataması empty.
        System.out.println("\n      *******           ");
        ciftElKareByk(sayi);

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


}
