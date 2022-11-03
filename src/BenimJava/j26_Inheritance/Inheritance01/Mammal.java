package BenimJava.j26_Inheritance.Inheritance01;

public class Mammal extends  Hayvancık {//hayvancık parent class in child class-baba

    public Mammal() {//psiz cons
        System.out.println("Ağam bu MAMMAL p siz cons");


    }

public void sutBeslenme(){
    System.out.println("bebeleri SÜT ile beslenir...");
}
    public void dogum(){
        System.out.println("nur topu gibi yavrusu olur...");
    }
}
