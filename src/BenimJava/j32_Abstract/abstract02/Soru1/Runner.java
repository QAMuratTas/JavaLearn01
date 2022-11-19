package BenimJava.j32_Abstract.abstract02.Soru1;

public class Runner {
    public static void main(String[] args) {
        Dikdortgen dd = new Dikdortgen(24,7);
        dd.alanHesapla();// return old. için
        dd.cevreHesapla();//return old. için yazdırmadı
        dd.setName("Dikdörtgen");
        System.out.println("dd = " + dd);// obje yazdırılıyor . toString den dolayı
        System.out.println(dd.ciz());

        Cember c1= new Cember(39);
        c1.setName("Çemberimde gül oya");
        System.out.println("c1 = " + c1);


    }
}
