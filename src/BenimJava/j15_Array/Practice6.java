package BenimJava.j15_Array;

public class Practice6 {
    public static void main(String[] args) {


        //task-> arr  tum elemalarının çarpımını print eden code create edinz
        int sayi[][]={{1,2,3},{9,8}};
        int crpm=1;//ilk 1 verielerk carpmada etki etmeyecek değer kullanıldı

        for (int i = 0; i <sayi.length ; i++) {
            for (int j = 0; j <sayi[i].length ; j++) {
                crpm*=sayi[i][j];

            }


        }
        System.out.println("crpm = " + crpm);



    }
}
