package BenimJava.j17_ForEachLoop;

public class forEach_practice {
    public static void main(String[] args) {

        String [] isimler ={"Murat","Fatma","Zehra","Eyüp"};
        for (String data : isimler ){
            System.out.print(" data = " + data);
        }
        System.out.println();//dumy
        for (int i = 0; i <isimler.length ; i++) {
            System.out.println("isimler["+i+"]"  + " "+isimler[i]);

        }



    }
}
