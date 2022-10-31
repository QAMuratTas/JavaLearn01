package BenimJava.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C14_ListConvertArray {
    public static void main(String[] args) {
        // list'i Array 'a çevirme ->toArray();
        //1. Yöntem ->toArray(); parametre olarka Stirng [0] alarak yapılır.

        ArrayList<String> listsehir=new ArrayList<>(List.of("Munih","LosAngeles","Londra","Stocholm","Angara","Patagonya"));
        String arrUlke[] =listsehir.toArray(new String[0]);// listsehir i elemanları arrUlke olarak atandı.
        System.out.println("listsehir = " + listsehir);
        System.out.println("Arrays.toString(listsehir) = " + Arrays.toString(arrUlke));
// 2. Yontem -> oluşturulan Array'in data type  Object olarak atanır.
// Trıck-> Object class java'da tüm class'ların parent(atası:HZ ADEM)
// Object Class java'da parent'ii olmayan tek Class'dir(tum vgonları çeken ama çekilemez lokomotif)
//String Integer Class'lar Object Class child'i oldugu için istene durumlarda data type olarak object class kullanılabilir




        Object arrUlkeler[] = listsehir.toArray() ;
        System.out.println("arrUlkeler = " + Arrays.toString(arrUlkeler));


    }
}
