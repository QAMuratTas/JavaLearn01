package BenimJava.j32_Abstract;

public class C01_Abstract {

    /*
    1- Bazı durumlarda child classlar parent clas daki methodların genellikle body lerine değiştirerek override ederler
    Bu gibi durumlardsa parent class daki methoda body tanımlamak ram ve memory acısından gereksizdir.
    Çözüm olarak java parent Class a body siz -> abstract (soyurt) methodlar tanımlamştır.
    2- Parent class daki abstract methodlar app güvenliği açısında child class da override edilmek zorundadır.
    Eğer parent class daki child classın mutlaka kullanması gereken method var ise abstract tanımlanmalı
    mor() her aracda olmalı.
    3- abstract method tnaımlamak için
    a){} body olmaz
    b)acces modifie sonrası abstract keyword kullanılmalı.

    abstract clas tanımlamak için class ifadesi öncesi abstract keyword kullanılmalı
    4- Abs method sadece abs class Da tanımlanabilir. kesinlikle concrete class da abs method tanımlanamz
    ama abs class da concrete method tanımlanabilir.
    5- Abs Class içinde hem abs hem de concrete method ve variable tanımlanabilir
    6- Bir concrete child class parent abs class extend ettiğinde abs methodlalrı implement etmek zorunda
    ama concrete methodlar isteğe göre override edilir
    7- Parent child ilşkisi olan abstract class lar abs methodları implement etmek zorunda değil
    8- Parent olan abs class birden çok concrete veya abs child class extends edebilir. Ancak
    child class birden cok abs parent class dan extends e-de-mez...
    9- Abs class da final ve abs method tanımlanamaz CTe verir.-> final method override ediemeyeceği için abs olamaz
    10- Abs class da private ve abs method tanımlanamaz CTe verir.-> private method override ediemeyeceği için abs olamaz
    11- Abs class da static ve abs method tanımlanamaz CTe verir.-> static method override ediemeyeceği için abs olamaz


            **** ABSTRACT CLASS ASLA KESİNLİKLE OBJE ÜRETEMEZ !!!!
            TRİCK->Abstract class lar refransı child Class ın objesini tutabilir(Polymorphizm).
     */
}
