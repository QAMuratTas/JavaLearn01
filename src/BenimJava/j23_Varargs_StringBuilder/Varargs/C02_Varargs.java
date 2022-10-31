package BenimJava.j23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*
        arr ve varargs merhod
         */
        int arr[]={24,42,33,19,34,45,58,38};

        System.out.println("arrTopla(arr) = " + arrTopla(arr));//Task1
        System.out.println("varargsTopla = " + varargsTopla(24, 42, 33, 19, 34, 45, 58, 38));//task2
        System.out.println("varargsTopla(arr) = " + varargsTopla(arr));//trick


// ahanda Trick -> Varaargs method parametreleri array gibi tanımladığı için varargs
        // methoda parametre olarak array de verilebilir.
// tsk1->Array elemanlarını toplamı print eden method create ediniz.
// tsk1->task1 varaargs ile çalışınız

    }//main sonu
    public static int arrTopla(int[] a){
        int toplam=0;
        for(int w:a){
            toplam+=w;
        }


        return toplam;
    }
public static int varargsTopla(int... b){
        int toplam=0;

        for(int s:b){
            toplam+=s;
        }



        return toplam;
}

}
