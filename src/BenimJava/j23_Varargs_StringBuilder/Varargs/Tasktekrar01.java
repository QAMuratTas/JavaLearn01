package BenimJava.j23_Varargs_StringBuilder.Varargs;

public class Tasktekrar01 {
    public static void main(String[] args) {

    String [] arr1={"murat","Rabbimin","İzniyle","Çok","Güzel","Bir","İş","Bulacaksın"};
    String [] arr2 ={"Murat","nasılsını","iyi misin"};
    strbirlestir(arr1);
    strbirlestir(arr2);
    strbirlestir("Bu","elle","girilen","str");





    }

    private static void strbirlestir(String... arr) {
String birles="";
        for (String w:arr) {

           birles=birles.concat(w);
        }
        System.out.println("birlesen stirng = " + birles);
    }
}
