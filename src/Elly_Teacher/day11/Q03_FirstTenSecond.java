package Elly_Teacher.day11;

import java.time.LocalDateTime;

public class Q03_FirstTenSecond {
    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();
        System.out.println("time = " + time);


        if (time.getSecond()<=10)
            System.out.println("İlk 10 sn içinde");
else
            System.out.println("ilk 10 sn dışında");

    }
}
// ternary ile yap
