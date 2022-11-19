package BenimJava.j33_Interface;

public class Sahin extends Tofaş implements disDonanim,icDonanim,Lastik {//conc child class extends ->Tofas, implement->dısDonanım,icDonanim,Lastik
    @Override
    public void ebat() {
        System.out.println("ağam 16 inç lastik ebat");
        System.out.println("Dr bu ne insan yiycek bunu :)");

    }

    @Override
    public void jant() {
        System.out.println("Ağam senin gibi adam çelik 5 kollu jant yakısır");

    }

    @Override
    public void motor() {
        System.out.println("Ağam 1,6 motor");

    }

    @Override
    public void yakıt() {
        System.out.println("Ağam TÜPitak yoksa ocağın incir ağacı:(");

    }

    @Override
    public void kapi() {
        System.out.println("Ağam 4 kapı sedan");

    }

    @Override
    public void kaporta() {
        System.out.println("Ağam akordion kaporta ");

    }

    @Override
    public void koltuk() {
        System.out.println("Ağam deri koltuk yazın pişik yapar içi saman olması kafi");

    }

    @Override
    public void klima() {
        System.out.println("Ağam aç camı serinle klima senin neyine");
    }









}
