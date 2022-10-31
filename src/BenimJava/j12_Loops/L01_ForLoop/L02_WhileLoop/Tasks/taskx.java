package BenimJava.j12_Loops.L01_ForLoop.L02_WhileLoop.Tasks;

public class taskx {
    public static void main(String[] args) {
        /*
        //Task01
        int sum = 0;
        int adet = 0;

        while (sum <= 333) {
            Scanner scan = new Scanner(System.in);
            System.out.print("bir sayı giriniz: ");
            int a= scan.nextInt();
            sum += a;
            adet++;
        }
        System.out.println("Girilen sayı adedi: "+adet+"\nToplam : "+sum);

//Task02
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz: ");
        int a=scan.nextInt();
        System.out.println("bir tamsayı giriniz: ");
        int b=scan.nextInt();

        if (a>b) {
            while (b < a-1) {
                System.out.print(++b+" ");
            }
        } else if (a < b) {
            while (a < b-1) {
                System.out.print(++a+" ");
            }
        }else System.out.println("ağam nettin sayılar eşit ");

//Task03_ÇarpımTablosu
		Scanner scan = new Scanner(System.in);
		System.out.println("çarpım tablosu için bir tamsayı giriniz: ");
		int num = scan.nextInt();
		int a = 1;

		while (a<=10){
			System.out.println(num+"*"+a+"="+(num*a));
			a++;
		}

//Task04_4ve6yaTambolunebilen
	int adet=0;
	int sayi=100;

	while(sayi<1000){
		if(sayi%4==0 && sayi%6==0){
			System.out.print(sayi+" ");
			adet++;
		}
		sayi++;
	}
	System.out.println();
	System.out.println("3 basamakli 4 ve 6 ya tam bolunebilen "+adet+" tane tam sayi vardır.");

//Task05
		Scanner scan = new Scanner(System.in);
		System.out.print("isminizi giriniz: ");
		String ad=scan.nextLine().trim();
		System.out.print("soyisminizi giriniz: ");
		String soyad=scan.nextLine().toUpperCase().trim();
		String bileşik= (ad+soyad).replaceAll("\\s+", "").trim();
		int i=0;
		while (i<bileşik.length()){
			System.out.print(bileşik.charAt(i)+" ");
			i++;
		}

//Task06_sayıBulmaca
    int random= (int)(Math.random()*100)+1;
    Scanner scan = new Scanner(System.in);
    System.out.print("bilgisayarın 1 ile 100 arasında tuttuğu sayıyı tahmin ediniz: ");
    int tahmin=scan.nextInt();
    int tahminadedi=1;

    while (tahmin!=random) {
        if (tahmin<random) {
            System.out.print("Tahmininizi büyüterek giriniz: ");
            tahmin=scan.nextInt();
            tahminadedi++;
        }else {
            System.out.print("Tahmininizi küçülterek giriniz: ");
            tahmin=scan.nextInt();
            tahminadedi++;
        }
        }
        System.out.println("TEBRİKLER! "+tahminadedi+" tahminde sayıyı buldunuz. ");

//Task07_5sayınınMax
        Scanner scan = new Scanner(System.in);
        int max=0;
        int i=1;
        int girilensayi;

        while (i<=5){
            System.out.print(i+". sayıyı giriniz: ");
            girilensayi= scan.nextInt();
            max= Math.max(max, girilensayi);
            i++;
        }
        System.out.println("max = " + max);

//Task10_TekSayılar
        Scanner scan = new Scanner(System.in);
        System.out.print("bir tamsayı giriniz: ");
        int a=scan.nextInt();
        int i=0;

        while (i<=a){
            System.out.print((i%2==1)? i : " " );
            i++;
        }

//Task11_SıfırGir
    Scanner scan = new Scanner(System.in);
    int sum=0;
    int girilensayi=1;
    int sayac=0;

    while (girilensayi!=0){
        System.out.print("bir tamsayı giriniz: ");
        girilensayi=scan.nextInt();
        sum+=girilensayi;
        sayac++;
    }
        System.out.println("0 (sıfır) girilene kadar girilen tum sayıların adedi : "+sayac+"\nToplam : "+sum);

//Task12_HarfRakamOzel
	Scanner scan = new Scanner(System.in);
		System.out.print("bir metin giriniz: ");
		String str = scan.nextLine();
		int i=0, harf=0, rakam=0, ozelkarak=0;
		char c;
		while (i<str.length()){
			c = str.charAt(i);
			if (c>= 48 && c<=57){
				rakam++;
				i++;
			}else if((c>=65 && c<=90) || (c>=97 && c<=122)){
				harf++;
				i++;
			}else if (c>= 32 && c<=126){
				ozelkarak++;
				i++;
			}else {
				harf++;
				i++;
			}
		}
		System.out.println("Girilen metinde "+harf+" tane harf, "+rakam+" tane rakam, "+ozelkarak+" tane özel karakter bulunmaktadır. ");

//Task13_JavacanJavatar
    Scanner scan = new Scanner(System.in);
    System.out.print("bir karakter giriniz: ");
    char c= scan.next().charAt(0);

    if (c!='x' && c!='X') {
        while (c != 'x' && c != 'X') {
            System.out.println("javaCAN ");
            System.out.print("bir karakter giriniz: ");
            c= scan.next().charAt(0);
        }
    }
    System.out.print("jAVATAR");
         */
    }
}
