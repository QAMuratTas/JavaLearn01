package BenimJava.j25_Encapsulation.encapsulation01;

public class C01_Encapsulation {
    public static void main(String[] args) {
        C02_Encapsulation obj1= new C02_Encapsulation("murat",11);
        C02_Encapsulation obj2= new C02_Encapsulation();
        System.out.println("obj1.idver() = " + obj1.getId());//11
        System.out.println("obj1.isimver() = " + obj1.getName());//murat
        obj1.id=333;
        System.out.println("obj1.id = " + obj1.id);
        obj1.setName("Dilek Hanım");
        System.out.println("obj1.isimver() = " + obj1.getName());
        System.out.println("obj2.id = " + obj2.id);
        System.out.println("obj2.isimver() = " + obj2.getName());
        System.out.println("obj2.idver() = " + obj2.getId());
        obj2.setName("Murat bey qa tester");
        System.out.println("obj2.isimver() = " + obj2.getName());
        System.out.println("obj2 = " + obj2);// tostring ile generate yapmasaydık ref degerini verecekti...

    }


}
