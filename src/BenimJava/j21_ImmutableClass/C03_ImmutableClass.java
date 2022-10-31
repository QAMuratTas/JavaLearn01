package BenimJava.j21_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClass {
    public static void main(String[] args) {
        /*
  Boolean, Short, Integer, Long, Float, Double, Char ve String gibi tüm kapsayıcı sınıflar (Wrapper Class)
  BigDecimal, BigInteger java'da immutable sınıflara örnek olarak gösterilebilir.
        Date, StringBuilder, StringBuffer, Arrays ve ArrayList de Mutable (değişebilir) class'lardır.
 */
   String name ="Merve";
        System.out.println(name);
        name.concat("javacan");
        System.out.println(name);// merve ->String name variable meth sonrası aynı değerde kaldı. İmmutable

        List<String> isimlist =new ArrayList<>();// boş sTring list
        System.out.println("isimlist = " + isimlist);
        isimlist.add("Fatih");
        isimlist.add("Erkan");
        isimlist.add("Serhat");
        isimlist.remove(1);
        isimlist.set(1,"javacan");
        System.out.println("isimlist = " + isimlist);


    }
}
