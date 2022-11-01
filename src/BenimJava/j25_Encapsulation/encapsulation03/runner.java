package BenimJava.j25_Encapsulation.encapsulation03;

public class runner {
    public static void main(String[] args) {
        /*
        1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
  olan Araba  isimli bir class cretae ediniz.
        2- bütün fieldları parametre alan bir constructor tanımlayınız.
        3- ArabaMain isminde main için bir class oluşturunuz.
        4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
        5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
         */
Arac honda = new Arac("accor","siyah",1200,2012);
Arac volvo= new Arac("s80","beyaz",2000,-2015);
Arac haciMurat=new Arac();
haciMurat.setModel("serçe");
haciMurat.setMotor(1300);
haciMurat.setYil(1974);
haciMurat.setRenk("cücük SARI");
        System.out.println("honda ne ararsan var onda "+honda);
        System.out.println("hacı murat : "+haciMurat);
        System.out.println("isvec tankı :"+ volvo);











    }

}
