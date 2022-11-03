package BenimJava.j26_Inheritance.Inheritance02;

public class Mammal extends Hayvancık {//hayvancık parent class in child class-baba

    public Mammal() {//psiz cons
        this('Y');
        System.out.println("Ağam bu MAMMAL p siz cons");


    }

    public Mammal(char c) {//p li cons
        super(17);
        System.out.println("Ağam bu MAMMAL p li cons");


    }

    public void mC() {//ezilen method
        System.out.println("mC - > Mammal clas meth call.");
    }

    int m = 1;
    int c = 4;

    @Override
    public void mM() {// parentten ezen method
        System.out.println("mM -> Mammal clas dan meth call.");
    }
}
