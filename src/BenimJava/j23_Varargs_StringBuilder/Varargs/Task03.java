package BenimJava.j23_Varargs_StringBuilder.Varargs;

public class Task03 {
    public static void main(String[] args) {
        /*
Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
 */
        int sayi=5;
        String str1="muharrem";
        String str2="uğur";
        String str3="ebikgabık";
carpStringEnUzun(sayi, str1, str2, str3,"Javacan");


    }//main sonu
    public static void carpStringEnUzun (int carpacak,String... str){

        String enUzun ="";
        for(String a:str){
            if (a.length()>enUzun.length()){
                enUzun=a;
            }
        }
        System.out.println("Ağam istedğin değer :"+ (carpacak*enUzun.length())+" "+enUzun);


    }





}
