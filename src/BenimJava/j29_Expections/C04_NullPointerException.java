package BenimJava.j29_Expections;

public class C04_NullPointerException {
    public static void main(String[] args) {
        // NullPointerException -> null ataması yapılan String de lenght() method run edildiğinde oluşan RTE exception

        String str="";
        System.out.println("str.length() = " + str.length());//0



        try {
            String str1=null;
            System.out.println("str1.length() = " + str1.length());//NullPointerException
            System.out.println("Ağam try blockdasın. eğer bunu yazdıysa hiçbir sorun olmadı");

        }catch(NullPointerException e){
            System.out.println("Ağam hiç null string dutluk burası dutluk hiç lenght verir mi?");
        }

        System.out.println("Sorun handle edildi devamkeee");
        try {
            String str1=null;
            System.out.println("str.length() = " + str.length());//NullPointerException
            System.out.println("Ağam try blockdasın. eğer bunu yazdıysa hiçbir sorun olmadı");

        }catch(NullPointerException e){
            System.out.println("Ağam hiç null string dutluk burası dutluk hiç lenght verir mi?");
        }

        System.out.println("Sorun handle edildi devamkeee");
    }
}
