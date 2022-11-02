package BenimJava.j25_Encapsulation.Task04;

import java.util.Scanner;

public class MainAna {
    public static void main(String[] args) {
/*
    Burada iki adet class vardır. Biri Main, diğeri ise student ,
    student classı içinde;
    String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

    Main classın içinde;
    girilen değerleri aşagıdaki gibi print eden code create ediniz
    Örnek:
    age 12'dir.
    name Steven'dır.

    name(isim) olarak;
    "Student name is Steven"
    ve
    age(yaş) olarak da;
    "He is 12 years old"


 */

        Scanner sc= new Scanner(System.in);
        System.out.println("ağam adnı giresen :");
        String ad =sc.nextLine();
        System.out.println("Ağam yaşını giresen : ");
        int yas= sc.nextInt();
        Student s1=new Student(ad,yas);//ad yas dataları p li cons parametre olarak gönderildi s1 obj tanımlandı

        System.out.println("Student name is :"+s1.getName()+"\n He is "+s1.getAge()+" years old");



    }// main sonu




}//class sonu
class Student{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}