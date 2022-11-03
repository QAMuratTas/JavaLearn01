package BenimJava.j25_Encapsulation.encapsulation02;

public class Kisi {//pojo class
/*
Kisi pojo class için fields -> ad,soyad,pasword(sTring),yas
tüm fieldları kullanıcı görebilmeli ve update edebilmeli
pasword encapsulatied update edilmemeli. yas variable negatif
değer girmeye karşı encapsulated runner classda obj ile field ları print eden code create ediniz

 */
 String ad;
 String soyad;
private int yas;
private String password;

    public Kisi(String ad, String soyad, int yas, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.password = password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas);//parametre gelen yas da - gelen mutlak degerini aldı

    // if (yas<0) {this.yas=yas*(-1)}else this.yas=yas;

    }

    public String getPassword() {
        return password;
    }


}
