package BenimJava.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
//Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.
public class C05_Sorted {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));
        //List<Integer> sayi= new ArrayList<>(Arrays.asList(11,3,5,7)); //Optional.empty verir consolda.filter olarak çift sartı null vereceği için optional ataması empty.
        //List<Integer> sayi= new ArrayList<>(Arrays.asList(1,3,5,4,6,12,8));
        System.out.println("\n      *******           ");

ciftKareKbPrint(sayi);
        System.out.println("\n        ***********");
tekKareBkPrint(sayi);
        System.out.println("\n        *******");








    }//main sonu
    //Task : List'in çift elemanlarının karelerini kucukten büyüğe print ediniz.
    public static void ciftKareKbPrint(List<Integer> sayi) {
        sayi.stream().filter(C01_LambdaExpression::ciftMi).//çift sayılar şartına göre filtrelendi
                map(t-> t*t).//filtrelenen elemnların karesine update edildi
                sorted().//akışdaki karesine update edilen elman sıralndı (no)
                forEach(C01_LambdaExpression::yazdir);



    }

// Task: Listin tek elemanlarının karelerini büyükten küçüğe print ediniz:
    public static  void tekKareBkPrint (List<Integer > sayi) {
        sayi.stream().filter(t->t%2==1).map(t->t*t).sorted(Comparator.reverseOrder()).// Comparator.reverseOrder method call edildi. ters sırlada
                forEach(C01_LambdaExpression::yazdir);
    }

//reverseOrder() => Comparator Class'ının bir methodudur. Doğal sıralamanın tersini (büyükten küçüğe) uygulayan
// bir Comparator (karşılaştırıcı) return eder.







}
