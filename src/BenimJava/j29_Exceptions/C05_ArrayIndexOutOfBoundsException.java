package BenimJava.j29_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException -> Arraylerde olmayan bir index elemanı ile işlem yapıldıgında
        // oluşan unchecked old. RTE exception verir

        int arr []={24,27,38,41,54};
        System.out.println("arr[0] = " + arr[0]);

        //System.out.println("arr[7] = " + arr[7]);//ArrayIndexOutOfBoundsException
        try {
            System.out.println("arr[7] = " + arr[7]);
            System.out.println("burası try blocku");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ağam Arrayin index uzunlugunu aşan bir veri istiyrsun");
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("Ağam bu yazıyı okuduysan exception fırlatıldı ve komut handle edildi. burası catch blok ");
        }


        System.out.println("Sorun handle edildi");
    }
}
