package BenimJava.j16_ArrayList.odev;

public class _06_Array_contains_ok {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

String friut[]={"Apple","Orange","Orange","Banana","Pineapple"};
        for (int i = 0; i < friut.length ; i++) {
            System.out.println("friut["+i+"]"+". içeriyor mu Apple = " + friut[i].contains("Apple"));
        }


        }
    }

