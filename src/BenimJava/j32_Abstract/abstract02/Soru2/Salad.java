package BenimJava.j32_Abstract.abstract02.Soru2;

public abstract class Salad extends Food{
   public abstract  void madeIn();// parent ve chıld abs classlarda aynı and a2 method call edilebilir.
    @Override
    public void taste() {
        System.out.println("Ağama salatan gavurağı çoban söğüş mü verelim :)");

    }
}
