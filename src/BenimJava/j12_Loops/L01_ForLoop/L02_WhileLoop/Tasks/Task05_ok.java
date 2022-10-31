package BenimJava.j12_Loops.L01_ForLoop.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05_ok {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print eden code create ediniz

		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("İsminizi girer misiniz?: ");
		String ad=scan.nextLine();
		System.out.print("Soyisminizi girer misiniz?: ");
		String soyad=scan.nextLine();
		String adSoyad= (ad+soyad).toUpperCase().replaceAll("\\s+", "").trim();
		System.out.println(adSoyad);


int i=0;

        while(i<adSoyad.length()){
			System.out.print(adSoyad.charAt(i)+" ");
			i++;
		}


		}
			

	}

