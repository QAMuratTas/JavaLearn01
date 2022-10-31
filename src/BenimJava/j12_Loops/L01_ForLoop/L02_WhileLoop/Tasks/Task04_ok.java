package BenimJava.j12_Loops.L01_ForLoop.L02_WhileLoop.Tasks;

public class Task04_ok {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */

		int adet=0;
		int sayi=100;
		while (sayi<1000) {
			if (sayi%4==0 && sayi%6==0){
				System.out.print(sayi+"-");

				adet++;
			}sayi++;
		}
		System.out.print("\n3 basmaklı 4 ve 6 ya tam bölünebilen "+adet+" tane tam sayı vardır");

		

		
		
			
	}

}
