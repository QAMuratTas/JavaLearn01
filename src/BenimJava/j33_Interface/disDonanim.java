package BenimJava.j33_Interface;

public interface disDonanim {
     void kapi();

     //asb meth.
    void kaporta();//asb meth.
    String RENK="Opak Kırmızı";//public static final variables
    public default String sisLamb(){//default concrete
        return "sisli havada dikkat";
    }

    static void anten(){
        System.out.println("Ağam yine antin quntın işlerdesin:)");
    }
    //disDonanim obj =new disDonanim();// cannot be isntantiated obj olmaz o-la-mazzz
   //public static void main(String[] args) {// bad practice- prjede tek bir main method ve main class kullanılma
   //    System.out.println(RENK);
   //    aga();//static method oldugu için call ettik

// public static default void sorunMethode()CTE static default keyvord aynı anda kullanılmaz

}
