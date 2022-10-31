package BenimJava.j19_StaticVariable;

public class C01_OgretmenRunner {
    public static void main(String[] args) {
       C01_Ogretmen.okul="KABATAŞ ERKEK LİSESİ";//gÜNEŞ DEĞERİ UPDATE OLDU


C01_Ogretmen hc1=new C01_Ogretmen("CÜneyt",11);
        System.out.println("hc1.tecrube = " + hc1.tecrube);
        System.out.println("hc1.isim = " + hc1.isim);
        //hc1.okul="kabadaş";// static variable obje ile call edilmez.
        System.out.println("hc1.okul = " + hc1.okul);




        C01_Ogretmen hc2 =new C01_Ogretmen("Bekir",7);
        System.out.println("hc2.tecrube = " + hc2.tecrube);
        System.out.println("hc2.isim = " + hc2.isim);
        System.out.println("hc2.okul = " + hc2.okul);
        //hc2.okul="kabatas;"
        C01_Ogretmen hc3 =new C01_Ogretmen("Nazım",13);

        System.out.println("hc3.tecrube = " + hc3.tecrube);
        System.out.println("hc3.isim = " + hc3.isim);
        System.out.println("hc3.okul = " + hc3.okul);
        //hc3.okul="gabadaş";

hc1.evlilikYıldönümü();// obje ile non-static method call ettik
        C01_Ogretmen.maasHesapla();// class name ile static method call edildi.
hc2.maasHesapla();// obj ile static method call -> bad practice


    }
}
