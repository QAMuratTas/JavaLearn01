package BenimJava.j16_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArrayList {
    public static void main(String[] args) {
        int sayi = 33;// tek bir data saklayabilen variable
        int sayi1[] = new int[5];// 5 int saklayabilen yapı
        int sayi2[][] = new int[5][6];// 5*6 30  int saklayabilen yapı
        ArrayList<Integer> sayilist = new ArrayList<>();// istenildiği kadar int değer saklayabilen  data
        /*
     Array List genel Tanimi:

            ArrayList<Type> arrayListName = new ArrayList<Type>();
     List<Type>arrayListName= new ArrayList<>()
                  1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde olmalidir
                - ArrayList<int> hatali bir tanimlamadir. wrapper class dedigimiz object türünden olmalidir
                - primitive'lerin wrapper classlari Büyük harflar baslayan isimleridir
                - int'n wrapper class'i        --> Integer'dir
                - double'un wrapper class'i    --> Double'dir. vs...

            2.  - Arrayler tanimlanirken sabit bir .length;'de tanimlanir ve bu length degistirilemez
                - ArrayList'ler tanimlamada .size(); belirmeme zorunlulugu yoktur degistirilebilir.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.

    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.


    key word: List<wrapper Class> name=

    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru

    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );

    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrays.toString(arrayAdi); ile yazdirilabilir.


    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.

 */
// list create etme ve değer atama.
        List<Integer> listsayi = new ArrayList<>();// boş bir integer type oluşturuldu.
        // 1. yol ->add methodu
        System.out.println("listsayi = " + listsayi);

        listsayi.add(10);// liste ilk eleman olarak 10 değeri eklendi
        System.out.println("listsayi = " + listsayi);
        listsayi.add(39);
        listsayi.add(72);
        listsayi.add(61);
        listsayi.add(41);
        listsayi.add(41);// list eleman tekrarını kabul eder
        System.out.println("listsayi = " + listsayi);
        //2. yol ->ArrayList.asList(listsayi); method
        ArrayList<String> listisim= new ArrayList<>(Arrays.asList("Muharrem","Nur","Enise","Murat"));
        System.out.println("listisim = " + listisim);
        //3. yol ->List.of(); method

        String[] isim = {"murat","Nur","Enise","Murat"};

        ArrayList<String> isimlist = new ArrayList<>(Arrays.asList(isim));


        ArrayList<String> listulke=new ArrayList<>(List.of("Almanya","Amerigonya","ingiltere","isveç"));
        System.out.println("isimlist = " + isimlist);
        System.out.println("listulke = " + listulke);
        listsayi.add(2,14);
        System.out.println("listsayi = " + listsayi);


    }
}
