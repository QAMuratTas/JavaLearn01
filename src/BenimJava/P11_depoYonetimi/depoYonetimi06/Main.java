package BenimJava.P11_depoYonetimi.depoYonetimi06;

public class Main extends Method {
    public static void main(String[] args) {

        UrunTanimlama urun1 = new UrunTanimlama(1000, "Peynir", "MuratBey", "kg");
        UrunTanimlama urun2 = new UrunTanimlama(1001, "Çikolata", "ülker", "adet");
        UrunTanimlama urun3 = new UrunTanimlama(1002, "Salça", "Olca", "kg");
        UrunTanimlama urun4 = new UrunTanimlama(1003, "Şeker", "Balküpü", "çuval");
        UrunTanimlama urun5 = new UrunTanimlama(1004, "Fairy", "P&G", "paket");
        urunler.put(urun1.getId(), urun1);
        urunler.put(urun2.getId(), urun2);
        urunler.put(urun3.getId(), urun3);
        urunler.put(urun4.getId(), urun4);
        urunler.put(urun5.getId(), urun5);

        Main depoCalis = new Main();

        depoCalis.girisPaneli();
    }
}
