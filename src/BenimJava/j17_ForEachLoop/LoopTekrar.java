package BenimJava.j17_ForEachLoop;

public class LoopTekrar {


        public static void main(String[] args) {
            int muzSayisi1 =165;
            boolean maymunAlive1 = true;
            int survivalDays1 = 0;

            do {

                muzSayisi1 -= 4;
                survivalDays1++;


                if (muzSayisi1 >3) {
                    System.out.println(survivalDays1 + ". gün yaşadı çünkü elinde =" + muzSayisi1 + " var.");
                } else
                    maymunAlive1 = false;


            }while (maymunAlive1);
            System.out.println("Maymun ölmek üzere elinde "+muzSayisi1 +" tane  muz var çünkü günde 4 tane yiyor.");


        }
    }


