package BenimJava.j29_Expections;

public class C03_ClassCastException {
    public static void main(String[] args) {
        // ClassCastException ->birbirne donsturulmeyen data type lar birbirne donusturldugunde olusan RTE Exception dır.

        Object obj="javacan'lara selam olsun";
        String str= (String) obj;// object data type String data type castıng yapılarak atnadı
        System.out.println("str="+str);
        Object sayi1=10;
        //String str2= (String) sayi1;//object data type String data type castıng yapılarak atnadı
       // System.out.println(str2);//classexception


try {
    String str2= (String) sayi1;
}catch (ClassCastException e){
    System.out.println("ağam integer object hiç stringe çevrilir mi :");

}
        System.out.println("agam sorun handle edildi. devamkeee0");

try {
 String str3 = (String) obj;
    System.out.println("Ağam try blocktasın bu yazyı okudysan exc fırlatmadı komut sorunsuz...");

}   catch (ClassCastException e){
    System.out.println("Ağam integer object hiç stringe çevrilir mi");

}
        System.out.println("Ağam sorun handle edildi devamkee");



    }
}
