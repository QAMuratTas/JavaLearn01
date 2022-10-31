package BenimJava.j15_Array;

public class Practice7 {
    public static void main(String[] args) {

        // task ->sayi arr deki en büyük eleamnı print eden code create ediniz.
        int sayi [][]={{-1,-29,-3},{-19,-8},{-24,-10,-41}};
int maxeleman=sayi[0][0];
        for (int i = 0; i <sayi.length ; i++) {
            for (int j = 0; j < sayi[i].length ; j++) {
                if (sayi[i][j]>maxeleman){
                    maxeleman=sayi[i][j];
                }

            }

        }
        System.out.println("maxeleman = " + maxeleman);


    }
}
