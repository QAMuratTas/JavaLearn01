package BenimJava.j26_Inheritance.Task02;

public class SubClass extends SuperClass {
    int num=10;
    public void myMethod (){
        goster();
        super.goster();
        System.out.println("subClass num: " + num);
        System.out.println("superClass num: " + super.num);
    }

    @Override
    public void goster() {
        System.out.println( "Bu method Sub classsın görüntülenme methodudur.");
    }
}
