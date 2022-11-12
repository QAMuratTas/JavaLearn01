package BenimJava.j29_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
Task -> Girilen password'un 6 karakterden az 10 karakterden fazla olmamasını kontrol eden code create ediniz

 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ağam pasword gir: ");
        String password=sc.next();

        try {
            if (password.length()<6){
                throw new IllegalArgumentException("Ağam 6 karakterden az girdin");
            }else if (password.length()>10){
                throw new IllegalArgumentException("Ağam 10 karakterden fazla girdin");
            }else System.out.println("Ağam pasword geçerli ... "+password);

        }catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("Ağam nasılsın Allah seni bildiği gibi yapsın");

        }
        System.out.println("Ağam sorun handle edildi bildiği DEWAMKEEE ");





    }
}
