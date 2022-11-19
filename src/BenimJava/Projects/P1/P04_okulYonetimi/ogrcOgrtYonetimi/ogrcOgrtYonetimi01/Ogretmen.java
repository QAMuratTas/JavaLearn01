package BenimJava.Projects.P1.P04_okulYonetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimi01;

public class Ogretmen extends Kisi {

    private String bolum;
    private String sicilNo;

    public Ogretmen() {

    }


    public Ogretmen(String adSoyad, String kimlikNo, int yas,String sicilNo, String bolum ) {
        super(adSoyad, kimlikNo, yas);
        this.sicilNo = sicilNo;
        this.bolum = bolum;
    }

    public String getBolum() {
        return bolum;
    }
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen " + super.toString() +// *<-*->* Önce ad soyadı yazdırsın diye super.toString() i buraya taşıdık
                "  bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                "} " ;
    }
// @Override
    // public String toString() {
    //     return "Ogretmen{" +
    //             "bolum='" + bolum + '\'' +
    //             ", sicilNo='" + sicilNo + '\'' +
    //             '}';
    // }
}

