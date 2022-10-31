package BenimJava.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task07 {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */


        List<String> listIsim = new ArrayList<>(Arrays.asList("Umit","Emin","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"));

        System.out.println("Update öncesi listIsim = " + listIsim);
        String str3 =listIsim.get(2);//atama yapıldı
        String str8 =listIsim.get(7);//atama yapıldı

        listIsim.set(2,str8);
        listIsim.set(7,str3);
        System.out.println("Update sonrası listIsim = " + listIsim);


    }
}
