package Elly_Teacher.day11;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Q02ZoneDateTime {
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("zdt = " + zdt);

        DateTimeFormatter format =DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        System.out.println("zdt.format(format) = " + zdt.format(format));
        System.out.println("format.format(zdt) = " + format.format(zdt));

    }

}
