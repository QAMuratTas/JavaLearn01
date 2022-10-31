package BenimJava.j16_ArrayList.odev;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */
        String s = "$12 $23 $10 $2 $5 $2";
        String sArr[]=s.replace("$", "").split(" ");
        int toplam=0;

        for (String value : sArr) {
            toplam+=Integer.parseInt(value);
        }System.out.println("Toplam $ lar = " + toplam);

    }
}