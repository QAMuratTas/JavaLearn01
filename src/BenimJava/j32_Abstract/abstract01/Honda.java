package BenimJava.j32_Abstract.abstract01;

public abstract class Honda {// parant abstract class
    public abstract void motor();
    void sunroof(){
        System.out.println("Ağam keyfini bilirsen ama sunroof extra ücret :)");
    }
// abs parent class da variable tanımlanabilir mi?
String name = "Gülsüm team lead";// evet
// variable lar abs tanımlanır mı?kesinlikle hayır...
   //public abstract int yas=48; o- la- maz
    abstract void koltuk();
    abstract    void kapı();

//final void finalMethod();// concrete methoddur body siz olamaz
//final abstract void finalMethod();// abs method final olamaz


//private void privateMethod();//concrete methoddur body siz olamaz

//private abstract void finalMethod();//abs method private olamaz
   // static void gunesMethod();//concrete methoddur body siz olamaz
    //static abstract void finalMethod();//abs method static olamazz
//Honda obj =new Honda();// melekler doğurmaz yani abs class obje üretmez



}
