package BenimJava.j32_Abstract.abstract02.Soru3;

public abstract class Personel {
    String name = "Nura Hanım";
    public abstract void maasHesapla();// abstract method
    public abstract void maasBilgisi();//abstract method

    public void sigorta(){// concrete method

        System.out.println("Ağam özel sigorta kapsamındasın :)");
    }


}
