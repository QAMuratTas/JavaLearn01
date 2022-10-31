package BenimJava.j22_DateTime;

import java.time.LocalTime;

public class C02_LocalTime_Performanstesti {

    public static void main(String[] args) {
        //LocalTime->saat dakika saniye mili saniye tutar
        LocalTime suAn =  LocalTime.now();//Sistemden anlık zaman bilgisi atanır.
        System.out.println("suAn = " + suAn);
        System.out.println("suAn.getHour() = " + suAn.getHour());
        System.out.println("suAn.getMinute() = " + suAn.getMinute());
        System.out.println("suAn.getSecond() = " + suAn.getSecond());
        System.out.println("suAn.getNano() = " + suAn.getNano());
        //belirli bir zamanda ileeri geri zamana gidilebilir.
        LocalTime time1 =  LocalTime.of(13,43,34);//belirli bir saat dakika saniyesi olan zaman atandı
        System.out.println("time1.plusMinutes(90) = " + time1.plusMinutes(90));
        System.out.println("time1.plusMinutes(150) = " + time1.plusMinutes(150));
        System.out.println("time1.minusHours(23) = " + time1.minusHours(23));
        System.out.println("time1.minusMinutes(100).plusHours(2) = " + time1.minusMinutes(100).plusHours(2));
        LocalTime forBası =  LocalTime.now();
        System.out.println("forBası = " + forBası.getNano());
        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;

        }
        LocalTime forSonu =  LocalTime.now();
        System.out.println("forSonu = " + forSonu.getNano());

        System.out.println(forSonu.getNano() - forBası.getNano());


    }
}
