package BenimJava.j22_DateTime.Haftanın_Task.Team;

import BenimJava.j22_DateTime.Haftanın_Task.Team.Kayıt;

public class Runner {
    public static void main(String[] args) {
      Kayıt k2 = new Kayıt();
      k2.kayıtAl();

        for (int i = 1; i <3 ; i++) {
            k2.kayıtAl();

        }
        System.out.print("k2.kullanıcıKisiler.toString() = " + k2.kullanıcıKisiler.toString());
    }
}
