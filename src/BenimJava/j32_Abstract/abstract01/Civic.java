package BenimJava.j32_Abstract.abstract01;

public class Civic extends Lastik {// Honda parent abs. Class extend child concrete class
/*
extends Honda yazılarak Honda Class a concrete bir civic class tanımlşandı
java cte verdi. Çözüm olarak
a) Unimplemented (uyarlanmamış) method implement edilmeli
b) Parent honda class dan abstract keyword kaldırlmalı
c)concrete olan child civic class abstract tanımlanmalı

 */
// concrete class da abstract method tanımlanır mı?

   // public abstract void absmethod();// ya class abs olmalı ya da method concrete bady olmalı
    // Trick -> child concrete class parent abs class ın abs methodlarıı mutlaka implement override etmeli


    @Override
    public void motor() {
        System.out.println("Ağam 1.6 eco motor az yakar çok kaçar");
    }

    @Override
    void koltuk() {
        System.out.println("Ağam ucuz olsun diye kumaş koltuk tmeiz kullanın");
    }

    @Override
    void kapı() {
        System.out.println("5 kapı sedan");

    }
    public int vites () {// concrete child class method
        return 7;};


    @Override
    public void lastikEbat() {
        System.out.println("lasitk 205 55 16");

    }
    //Honda obj= new Civic();//honda oğlu civic
    //Civic obj1= new Civic();// civic oğlu civic
}
