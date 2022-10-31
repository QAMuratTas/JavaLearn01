package BenimJava.j15_Array;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
    // Stringi Array a cevirme ... split()-> girilen parametre değere göre parçalanır.
// task -> string ifadeyi kelime sayısını print eden code create ediniz.
String str ="javaCAN'lara selam olsun. enkısa zamanda bolcana offer sonrası TUZLABALIK :)";
String strArr []= str.split(" ");// str her " " karaktere göre parçalanır.Her bir parça strArr in bir elemanı olarak atadı.

        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);//10



        // task ->String ifadedeki harf sayısını print eden code create ediniz.


        String harfArr[]= str.split("");//string harf ""hiçlik e göre parçalandı
        System.out.println("Arrays.toString( harfArr ) = " + Arrays.toString(harfArr));
        System.out.println(harfArr.length);//76



    }
}
