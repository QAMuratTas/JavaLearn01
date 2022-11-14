package BenimJava.j32_Abstract.abstract02;

public class Isci extends Personel{// abs personel parent class a extends -> concrete child işçi class
    @Override
    public void maasHesapla() {// Personel parent class dan overrride edilen abs. meth
        System.out.println("Ağam marablara en çok yevmiye 400 gayme verilir");

    }

    @Override
    public void maasBilgisi() {// personel parent class dan overrride edilen abs. meth
        System.out.println("Ağam marablar cay -cugara hariç günde 8 saat kürek mahkumu");

    }
}
