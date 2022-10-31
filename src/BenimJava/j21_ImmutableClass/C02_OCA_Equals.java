package BenimJava.j21_ImmutableClass;

public class C02_OCA_Equals {
    public static void main(String[] args) {
     /*   String a = "";
        a += 2;
        a += 'c';
        a += false;

        if (a == "2cfalse") {
            System.out.println("==");
        }
        if (a.equals("2cfalse")) {
            System.out.println("equals");
        }
String b ="2cfalse";
        if (a==b){
            System.out.println("ahanada referansları aynı havuzda a ve b eşit ==");

        }
*/

                   String a = "";// immutable class variable a
                   String c = "2cfalse";// immutable class variable a
            a += 2;//a="2"
            a += 'c';//a="2c"
            a += false;//a="2cfalse"
            System.out.println(a);
            String b = "2cfalse";
            System.out.println(b);
            if (a == "2cfalse") {//sart saglamaz if çalışmaz->  a refensı  "2cfalse"  atama olmdg için ref yok
                System.out.println("==");
            }
            if (a.equals("2cfalse")) {
                System.out.println("equals");
            }
            String x="ali";
            String y="ali";

            if (x == y) {//sart saglamaz if çalışmaz->  a refensı  "2cfalse"  atama olmdg için ref yok
                System.out.println("ahan da referansları aynı havuzda x ve y eşit ==");
            }
            //tanımlana atanan değeri a  ile aynı havuzda ve ref olan b variable
            if (c == b) {//sart saglamaz if çalışmaz->  a refensı  "2cfalse"  atama olmdg için ref yok
                System.out.println("ahan da referansları aynı havuzda c ve b eşit ==");
            }




    }
}
