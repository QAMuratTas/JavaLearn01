package BenimJava.J18_Constructor;

public class C03_StudentRunner {
    public static void main(String[] args) {
        C03_Student ogrc1 = new C03_Student();

        ogrc1.ad="murat";
        ogrc1.soyad="taş";
        ogrc1.sinif=1;
        ogrc1.okulNo=1001;
        ogrc1.ortalama=77;
        ogrc1.takdir=false;


        System.out.println("ogrc1 = " + ogrc1);
        System.out.println(ogrc1);

        ogrc1.mezuniyet();
        // task-> diğer bir öğr obj ile tum field ları atayıp print edini.z...


    }
}
