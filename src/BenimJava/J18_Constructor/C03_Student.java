package BenimJava.J18_Constructor;

public class C03_Student {// main olmayan sadece student obj create etmek için pojo -> plan old java object.:
    // obje için standart class kalıp
 // fields->
    String ad;
    String soyad;
    int sinif;
    double ortalama;
    int okulNo;
    boolean takdir;
    public void mezuniyet (){

        if (ortalama >= 50){
            System.out.println("geçti");
        }else System.out.println("kaldı");
    }

    @Override
    public String toString() {
        return   "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sinif=" + sinif +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdir=" + takdir
                ;
    }
}
