package BenimJava.j23_Varargs_StringBuilder.StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        // StirngBuilder obje crete etme....

        //1. yol
        StringBuilder sb1 = new StringBuilder();// default capacity 16 bit olan değersiz
        System.out.println("sb1.capacity() = " + sb1.capacity());// 16 default. bu yüzden hızlı
        System.out.println("sb1.length() = " + sb1.length());//0-> length() sb deki karakter sayısı
        sb1.append("jAVATAR");// javatar sb1 e eklendi
        System.out.println("sb1.capacity() = " + sb1.capacity());
        System.out.println("sb1 = " + sb1);
        sb1.append(" Selam ").append("olsun").append(" ").append(24).append(" ").append(true);
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());//2k+2

        sb1.append(" başarı gayrete aşıktır :)");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());


        // 2. yol
        StringBuilder sb2 = new StringBuilder("Kevser hanıma selamlar");// İlk değer atması yapılmış sb2 stbuil obj
        System.out.println("sb2 = " + sb2);// 22+16=38 oldu. default 16 vardı atama yapılınca 16nın üzerine yazılanı ekledi.
        System.out.println("sb2.capacity() = " + sb2.capacity());
        // trimToSize()-> fazldna ayrılan capacıty silinir
        System.out.println("sb2.length() = " + sb2.length());
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity());

//3 .yol
        StringBuilder sb3 = new StringBuilder(11);// hafızada 11 karakterlik yer ayıran bos sb tanımlandı
        System.out.println("sb3.length() = " + sb3.length());
        System.out.println("sb3.capacity() = " + sb3.capacity());
        sb3.append("murat bey nasılsınız");
        System.out.println("sb3.capacity() = " + sb3.capacity());

// istenen bir karakter indexi alma

        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));
        // istenen bir aralıktaki character 'i alma
        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));
        System.out.println("sb1.substring(17) = " + sb1.substring(17));// 17 ve sona kadar tum karakterler.
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));
        // belirli bir indexdeki karakteri silmek
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));

        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));
// istene karakter veya karakterleri eklemek
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4,\":)\") = " + sb3.insert(4, ":)"));
        String s = "güzel insan";
        //System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));
        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));
        StringBuilder sb4 = new StringBuilder("Nihan hanım");
        System.out.println("sb4.insert(5,\"Qa team lead\",0,2) = " + sb4.insert(5, "Qa team lead", 0, 2));

//istenen indexdeki karakteri değiştirme...
        sb4.setCharAt(6,'A');
        sb4.setCharAt(sb4.indexOf(" "),':');
        System.out.println("sb4 = " + sb4);
sb4.setCharAt(7,' ');
        // istenen index e karakter yerine birden çok karakter eklemek
        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));

// sb obj Stringe çevirme -> toString()

        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());

//String ile StringBuilder karsilastirmasi


/*
Compare iki sb'i esit mi diye kontrol etmek icin
ilk harften baslayarak tum karakterleri karsilastirir
Ayni olan karakterler icin bir sey return etmezken
farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
oldugunu print eder
Tamamen ayni ise bize 0 return eder

bir sb ile bir String'i compare etmek istersek Java CTE verir
 */

        StringBuilder sb5 =new StringBuilder("javaCan");
        StringBuilder sb6 =new StringBuilder("javaCan");
        String str1 ="javaCan";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));
        //sb6.compareTo(str1) cte verir
        System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1)));
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb5));//false ->sb equals == gibi çalışır -> hem value hem de ref degere bakar
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));// true

        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//true



    }
}
