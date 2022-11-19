package BenimJava.j32_Abstract.abstract02.Soru1;

public abstract class Sekil {
    private  String name;

    public Sekil() {//p'siz parent cons
    }

    public Sekil(String name) {//p'li parent cons
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  abstract double alanHesapla();
    public  abstract double cevreHesapla();
    public String ciz(){
        return this.name+" çizildi";
    }

    @Override
    public String toString() {//obj value'leri print eder
        return
                "sekil isim ='" + this.name + '\'' +
                        "\n sekil alanı : "+this.alanHesapla()+
                        "\n sekil cevre : "+this.cevreHesapla()+ "\n"+this.ciz()+"\n sekil cizildi";

    }
}