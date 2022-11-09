package BenimJava.j29_Expections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\MURAT\\IdeaProjects\\Javalearn\\src\\BenimJava\\j29_Expections\\ebikgabık");
            int k;

                try {
                    while ((k=fis.read())!=-1)
                    {
                        System.out.print((char)k);

                    }
                    System.out.println("ağam içteki try block dan selamlar:)");
                } catch (IOException e) {// dosyaya ulaşılır fakat okunazsa bu catch çalışır
                    System.out.println("Ağam dosya okunmuyor");
                    System.out.println("ağam içteki catch blocktan selamlar");
                }
                System.out.println("Ağam dıştaki try block an selamlar :)");


        } catch (FileNotFoundException e) {// dosyaya ulaşılamzsa bu catch çalışır
            System.out.println("Ağam dediğin dosyaya ulaşılamıyor...");
            System.out.println("Ağam dıştaki catch block dan selamlar");
        }
        System.out.println("Ağam sorun handle edildi dewamkee");
    }

}
