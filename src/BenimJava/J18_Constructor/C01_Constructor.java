package BenimJava.J18_Constructor;

public class C01_Constructor {
    /*
    1- constructor ismi Class name ile aynı olamlı. Büyük harf ile başlamalı.
    2- constructor create edildiğinde name den sonra () {} mutlaka kullanılmalı
    3- eğer p'li cons . create edildiğinde java default cons ezer(siler)
    4- cons. return type olmaz method dan ayıran özelliğidir.
    5- Class oluşturuldugunda java default cons. kendi create eder.

     */
    String str;// instance variable
    String selam="güzel insan";
    // C01_Constructor obj1 = new C01_Constructor();
    public static void main(String[] args) {
       // clas name    obje name new keyword default cons
        C01_Constructor obj1 = new C01_Constructor();
        C01_Constructor obj2 = new C01_Constructor();
        C01_Constructor obj3 = new C01_Constructor();
        C01_Constructor obj4 = new C01_Constructor();

        System.out.println(obj1.str);// str ins variable obj1 ile call edilerek obj1 değeri atandı
        obj2.str = "javatar";// str ins. variable obj2 ile call edilerek obj1 javatar değeri atandı
        System.out.println(obj3.selam);
        System.out.println("obj1.str = " + obj1.str);
        System.out.println("obj2.str = " + obj2.str);

        System.out.println("obj4.str = " + obj4.str);
obj3.aga();
obj4.aga();

    }

public  void aga(){

    System.out.println("ağam selamke");


}

}
