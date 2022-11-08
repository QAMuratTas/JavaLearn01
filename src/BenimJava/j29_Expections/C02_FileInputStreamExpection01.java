package BenimJava.j29_Expections;

import tekrarDersler.Static01;

import java.io.FileInputStream;// input outpu
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamExpection01 {
    public static void main(String[] args) throws IOException {
       // FileInputStream fis = new FileInputStream("C:\\Users\\MURAT\\IdeaProjects\\Javalearn\\src\\BenimJava\\j29_Expections\\ebikgabık");
        FileInputStream fis = new FileInputStream("C:\\Users\\MURAT\\IdeaProjects\\Javalearn\\src\\BenimJava\\j29_Expections\\ebikgabık");
// iligili dosyaya ulaşmak için fis obj tanımladnı parametre olarak ulasılacak dosya yolu (path)çagrıldı
        //FileNotFoundException -> adres yanlışşsa kontroluı




int k;
while ((k = fis.read())!=-1){//IOException -> evde yoksa kontrolu
    System.out.print((char)k);// k int ascii olan file degeri char içi casting - tyoe dönüşümü
}
/*

     Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
     bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surumlara karşılk gelen hatalara Checked Exception denir
     Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


    Bir kod yazilirken olasi exception'lar ongorulup
    exception olustugunda Java'nin ne yapmasini istedigimiz
    belirtilmelidir.


         1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

   2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
Class'inin parent class Hz.Adem
 */
    }

}
