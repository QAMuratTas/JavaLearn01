package BenimJava.Projects.P1.P04_okulYonetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimi01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrncListesi = new ArrayList<>();
    static ArrayList<Kisi> ogrtListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    public static void girisPaneli() {
        System.out.println(R + "**********************************    " + Y + " \nOGRENCI VE OGRETMEN YONETIM PANELI\n" + G + "**********************************");
        System.out.println(B + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS ");
        System.out.print("Lutfen yapmak istediginiz islemi giriniz : ");
        // System.out.print("isleminiz seciniz : "); Gereksiz bir islem olmus   *<-*->*
        String secim = scan.next().toUpperCase();


        switch (secim) {

            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;

            case "Q":
                cıkıs();
                break;
            default:
                System.out.println("hatalı giriş yaptınız  :(");
                girisPaneli();//recursive method call
                break;


        }
    }


    private static void cıkıs() {
        System.out.println("agam eline sağlık yine bekleriz selametle   :)");
    }

    public static void islemMenusu() {
        System.out.println(B +"Sectiginiz kisi turu: " + kisiTuru + ", Lutfen asagidaki islemlerden tercih yapiniz.\n"
                + R + "*********** " + kisiTuru + " ISLEMLER ************\n" + B + " 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU");
        // System.out.print(B+"Islem Tercihiniz : ");

        System.out.print("islem tercihinizi giriniz : ");
        //*<-*->*int secilenIslem = scan.nextInt(); string girilince Exception veriyordu
        String  secilenIslem = scan.next();

        switch (secilenIslem) {
            // case 1:*<-*->*
            case"1":
                ekle();
                islemMenusu();
                break;
            // case 2:*<-*->*
            case"2":
                arama();
                islemMenusu();
                break;
            // case 3:*<-*->*
            case"3":
                listele();
                islemMenusu();
                break;
            // case 4:*<-*->*
            case"4":
                sil();
                islemMenusu();
                break;
            // case 0:*<-*->*
            case"0":
                girisPaneli();
                break;
            default:
                System.out.println(R +" AGAM ADAMMM gibi  bir şey girrr :( :(# ");
                islemMenusu();

                break;
        }

    }

    private static void sil() {

        System.out.println(R + "   ***   " + kisiTuru + " silme sayfası   ***" + B);

        boolean flag = true;//flag bayrak olsun true->bayrak havada false->bayrak yerde

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci arıyorsa if body çalışacak
            scan.nextLine();//dummy
            System.out.println();//bos satır print
            System.out.print("silinecek ogrenci kimlik no giriniz : ");

            String silinecekKimlikNo = scan.next();

            for (Kisi k : ogrncListesi) {
                if (k.getKimlikNo().equals(silinecekKimlikNo)) {//flag havada
                    System.out.println("silinen ogrenci : " + k.getAdSoyad());
                    ogrncListesi.remove(k);//ogrsc silindi
                    flag = false;
                    break;
                }

            }
            if (flag) {//flag inince calışacak block
                System.out.println("silinecek ogrenci mevcut değil ");
            }
        } else {//ogretmen aranıyorsa else body calışacak
            System.out.print("silinecek ogretmenin kimlik no giriniz : ");
            String silinecekOgrtKimlikNo = scan.next();
            for (Kisi k : ogrtListesi) {
                if (k.getKimlikNo().equalsIgnoreCase(silinecekOgrtKimlikNo)) {//flag havada
                    System.out.println("silinen ogretmen : " + k.getAdSoyad());
                    ogrtListesi.remove(k);
                    flag = false;
                    break;
                }

            }
            if (flag) {//flag inince
                System.out.println("silnecek ogretmen mevcut değil ");
            }
        }

    }

    private static void listele() {

        System.out.println(B + "   ***   " + kisiTuru + " listeleme sayfası   ***" + R);
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci listeleme if
            System.out.println(ogrncListesi);
        } else {//ogretmen listeleniyor
            for (Kisi k : ogrtListesi) {
                //*<-*->* System.out.println(k.toString() + " adı soyadı : " + k.getAdSoyad() + " " + k.getYas()); Gereksiz 2 kere yazıyor.
                //*<-*->* System.out.println("ogrtListesi = " + ogrtListesi);//*<-*->* Bunu da yaza biliriz fakat Arraylisti getirdği için satır uzuyor.
                System.out.println(k);//*<-*->* burada sadece objeyi yazdırıyoruz. (zaten toString i var )*<-*->* en doğrusu k objsini yazdırmak
            }
        }
    }

    private static void arama() {
        System.out.println(R + "   ***   " + kisiTuru + " arama sayfası   ***" + B);

        boolean flag = true;//flag bayrak olsun true->bayrak havada false->bayrak yerde
        //AHAN Da  TRICK : flag iki farlı method'da da kullanıldıgı icin static yapmak daha clean code olur....

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {//ogrenci arıyorsa if body çalışacak
            scan.nextLine();//dummy
            System.out.println();//bos satır print
            System.out.print("aradıgınız ogrenci kimlik no giriniz : ");

            String arananKimlikNo = scan.next();

            for (Kisi k : ogrncListesi) {
                if (k.getKimlikNo().equals(arananKimlikNo)) {//flag havada
                    System.out.println("aradıgınız ogrenci : " +k); //*<-*->* k.getAdSoyad()); burada öğrenci için sadece ad soyad getiriyordu
                    flag = false;
                }

            }
            if (flag) {//flag inince
                System.out.println("aradıgınız ogrenci mevcut değil ");
            }
        } else {//ogretmen aranıyorsa else body calışacak
            System.out.print("aradıgınız ogretmenin kimlik no giriniz : ");
            String arananKimlikNo = scan.next();
            for (Kisi k : ogrtListesi) {
                if (k.getKimlikNo().equalsIgnoreCase(arananKimlikNo)) {//flag havada
                    System.out.println("aradıgınız ogretmen : " + k); //*<-*->* k.getAdSoyad()); Burada da öğretmen için sadece ad soyad getiriyordu
                    flag = false;
                }

            }
            if (flag) {//flag inince
                System.out.println("aradıgınız ogretmen mevcut değil ");
            }
        }


    }

    private static void ekle() {
        System.out.println(R + "   ***   " + kisiTuru + " ekleme sayfası   ***" + B);
        System.out.print("Ad soyad giriniz : ");
        scan.nextLine();//dummy hayalet komut
        String adSoyad = scan.nextLine();
        System.out.print("kimlik No giriniz : ");
        String kimlikNo = scan.next();
        //System.out.print("yas giriniz : "); Hatali girisi onleme adina try catc icine alindi *<-*->*
        //int yas = scan.nextInt();
        int yas;
        while (true) {//*<-*->* burada try catch kullanarak yas sorgusunu kulanıcıya hatasız bir şekilde girmesini sağladık
            try {
                System.out.print("yas giriniz : ");
                yas = scan.nextInt();
                if (yas < 0 || yas > 100) {
                    throw new ArithmeticException();
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("Yas 0 ile 100 arasında olmalıdır");
            } catch (Exception e) {
                String str = scan.next();//*<-*->* girilen hatali string ifade buraya atama yapilmazsa sonsuz donguye giriyor
                System.out.println("Hatalı giriş yaptınız.");

            }
        }

        if (kisiTuru.equals("OGRENCI")) {

            System.out.print("ogrenci No giriniz : ");
            String ogrcNo = scan.next();
            scan.nextLine();//dummy --> hayalet komut--> iki tane eşit scan.next(); komutu ayırmak için araya girmeli
            System.out.print("sınıf giriniz : ");
            String sınıf = scan.next();
            Ogrenci sefilOgrenci = new Ogrenci(adSoyad, kimlikNo, yas, ogrcNo, sınıf);//p'li cons ogrc obj create edildi
            ogrncListesi.add(sefilOgrenci);
        } else {//kisiTuru öğrenci ise if çalısir değilse kisiTuru öğretmen demektir ki else body çalışır
            System.out.print("bolum giriniz : ");
            String bolum = scan.next();// *<-*->*nextLine() next a cevrildi assignment yapılırken boş geçiyordu.Atama yapmıyordu
            scan.nextLine();//dummy
            System.out.print("sicil No giriniz : ");
            String sicilNo = scan.next();// *<-*->* nextLine() next a cevrildi assignment yapılırken boş geçiyordu.atama yapmıyordu
            Ogretmen muhtesemOgretmen = new Ogretmen(adSoyad, kimlikNo, yas,sicilNo, bolum );//p'li cons ogrtm obj create edildi
            ogrtListesi.add(muhtesemOgretmen);                     //*<-*->* sicilNo ve bolum yerleri degistirildi
        }                                                           // *<-*->* 13.satir P'li ogretmen const parametre siralamasi ayni olmasi icin
    }
}
















