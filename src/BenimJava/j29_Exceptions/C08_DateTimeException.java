package BenimJava.j29_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_DateTimeException {
    public static void main(String[] args) {


        try {
            LocalDate date =LocalDate.of(2022,15,33);//DateTimeException
            System.out.println("Burası try blok herhangi bir sorun yok");
        }catch (DateTimeException e) {
            System.out.println("Ağam yanlış tarih girdin "+e.getMessage());
            System.out.println("Burayı okuduysan hata yakalanmış demektir. ");

        }
        System.out.println("Sorun handle edildi");








    }
}
