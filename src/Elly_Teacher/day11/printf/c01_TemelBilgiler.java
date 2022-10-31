package Elly_Teacher.day11.printf;

public class c01_TemelBilgiler {

    //https://www.digitalocean.com/community/tutorials/java-printf-method
    public static void main(String[] args) {
        int sayi = 753;
        String str = "Bootcamp Clarusway";
        double db = 3.89563056;
        System.out.println(sayi + " " + str + "-" + db);

        System.out.printf("sayi :%d,str :%s,db : %f\n", sayi, str, db);

        System.out.printf("sayi :%d , str:%S ,db:%f\n", sayi, str, db);
        System.out.printf("sayi:%10d,str :%-10.10S,db:%-5.3f\n", sayi, str, db);

        //%d -> 10 hanelik yer ayır, kapasite
        // %-20.10s -> Sola yaslayarak 20 birimlik kapasite ver , String ifadeyi byüyük harfle 10 karakterini yazdır.
        //%-5.3f -> Sola yaslayarak 5 birimlik kapasite ver , virgülden sonra 3 birim yazdır.
        // \n -> new line yeni satıra geç
        // - : Sola yaslamak
        //%x.y -> x : kapasite y: Karakter sayısı
        //%s -> Büyük harfle yazdır
        // %s -> Küçük harfle yazdır
        System.out.printf("sayi : %-10d,str:%-8.8s,db:%09.4f", sayi, str, db);


    }
}