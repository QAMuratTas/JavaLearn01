package BenimJava.j22_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C11_OCA03 {
    public static void main(String[] args) {


/*
 What is the output of the following code?
Asagidaki code'un  ciktisi  nedir?
*/
        LocalDate date = LocalDate.of(2018, Month.APRIL, 29);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
        System.out.println("date = " + date);
/*
            A. 2018 APRIL 29
            B. 2018 APRIL 30
            C. 2018 MAY 10
            D. Another date.
            E. The code does not compile.
            F. A runtime exception is thrown.
            */


        LocalDate date1 = LocalDate.of(2018,Month.FEBRUARY, 29);// Invalid date 'February 29' as '2018' is not a leap year

        System.out.println("date1 = " + date1);
    }
}
