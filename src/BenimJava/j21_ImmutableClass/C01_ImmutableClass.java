package BenimJava.j21_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1 = "murat";// ilk değeri mrat atanan str1 variable
        String str2 = "murat";// str1 ve str2 aynı ilk değere sahip oldugu için String havuzunda ortak referans alır

        String str3 = new String("murat");// değerleri aynı ref farklı obj
        String str4 = new String("murat");// değerleri aynı ref farklı obj
        //String str5 = str1 + "";
        String str5 = "murat";
        System.out.println(str1 == str2);
        System.out.println( str1 == str3);
        System.out.println( str1.equals(str2));
        System.out.println( str3 == str4);
        System.out.println(str1 == str5);
        System.out.println( str1.equals(str5));

    }
}
