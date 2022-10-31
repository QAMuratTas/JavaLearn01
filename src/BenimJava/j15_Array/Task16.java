package BenimJava.j15_Array;

public class Task16 {
    public static void main(String[] args) {
        int sayi [][]={{1,2,3},{9,8},{24,0,4}};
        //task sayi arr deki son elemanların çarpımını print eden code create ediniz.
        int crpm=1;
        for(int kat=0;kat<sayi.length;kat++){

                crpm*=sayi[kat][sayi[kat].length-1];


        }


        System.out.println(crpm);


    }
}
