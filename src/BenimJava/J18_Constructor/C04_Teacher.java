package BenimJava.J18_Constructor;

public class C04_Teacher {// öğretmen obje ureten kalıphane class
    String ad;
    String soyad;
    int tecrübe;
    String branş;
    double maaş;
    int id;
    boolean emekli;

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tecrübe=" + tecrübe +
                ", branş='" + branş + '\'' +
                ", maaş=" + maaş +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';
    }

    public C04_Teacher(String ad, String soyad, int tecrübe, String branş, double maaş, int id, boolean emekli) {
        this.ad = ad;
        this.soyad = soyad;
        this.tecrübe = tecrübe;
        this.branş = branş;
        this.maaş = maaş;
        this.id = id;
        this.emekli = emekli;
    }

    public C04_Teacher() {// p'li cons default yerine p'siz cons create edildi
    }

    public void dersSaati(){
        System.out.println("Ağaam haftada 20 saatten sonra extraya girer.");


    }
}
