package BenimJava.j19_StaticVariable;


public class Practice_Araba {

    static int model=2015;
    int hiz;
    int vites;
String renk;




    public Practice_Araba(int hiz, int vites, String renk) {
        this.hiz = hiz;
        this.vites = vites;
        this.renk = renk;
    }
    public static void bilgi(){
        System.out.println("bu bilgi static methoddan çağrılmıştır:))");
    }

    public void murat() {
        System.out.println("Static olmayan bilgi kendi class ından çağrıldı);");

    }




}


