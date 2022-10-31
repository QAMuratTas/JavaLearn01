package BenimJava.j22_DateTime.Haftanın_Task.Team;

import java.time.LocalDateTime;

public class Kullanıcı {// kullanıcı obj üretecek

    String name;//obj de deger alacak inst. var
    LocalDateTime kayıtZamanı;

    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {

        this.name = name;
        this.kayıtZamanı =kayıtZamanı;
    }

    @Override
    public String toString() {
        return "\nKullanıcı{" +
                "name='" + name + '\'' +
                " kayıtZamanı=" + kayıtZamanı +
                '}';
    }
}
