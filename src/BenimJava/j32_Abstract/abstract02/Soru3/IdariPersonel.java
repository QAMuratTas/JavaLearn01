package BenimJava.j32_Abstract.abstract02.Soru3;

public class IdariPersonel extends Personel{
    @Override// mecbur implement edilmeli
    public void maasHesapla() {
        System.out.println("Ağam frapan idarecemize saati $120");

    }

    @Override//mecbur implement edilmeli
    public void maasBilgisi() {
        System.out.println("Ağam cıncık code yazan idare personele ekstradan bin gayme");

    }

    @Override// tercihen override edildi
    public void sigorta() {
        System.out.println("Ağam cıncık coder personel full sigorta");
    }
}
