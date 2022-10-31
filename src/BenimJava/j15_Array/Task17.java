package BenimJava.j15_Array;

public class Task17 {
    public static void main(String[] args) {
// task ->sayi arr deki en büyük eleamnı print eden code create ediniz.
        int sayi [][]={{-1,-29,-3},{-19,-8},{-24,-10,-41}};
        //224
        int maxeleman =sayi[0][0];
        for (int kat = 0; kat < sayi.length; kat++) {
            for (int daire = 0; daire < sayi[kat].length; daire++) {
           if (sayi[kat][daire]>maxeleman){
               maxeleman = sayi[kat][daire];
           }
            }
        }


        System.out.println(maxeleman);//24


    }
}
