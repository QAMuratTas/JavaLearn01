package BenimJava.j32_Abstract.abstract02.Soru3;

public class Runner {
    public static void main(String[] args) {
        Isci mrb1= new Isci();
        mrb1.maasBilgisi();
        mrb1.maasHesapla();
        mrb1.name="Murat TAŞ";
        System.out.println("mrb1.name = " + mrb1.name);
        mrb1.sigorta();//abs Parent conc meth obj ile call

        IdariPersonel cncCdr= new IdariPersonel();
        cncCdr.name="Dilek Orjiklerin efendisi";
        cncCdr.sigorta();
        cncCdr.maasHesapla();
        cncCdr.maasBilgisi();



    }
}
