package BenimJava.j33_Interface.Task01;

public class Dikdortgen implements Sekil{
    @Override
    public int cevre(int... boyut) {
        if (boyut.length==1){//varargs a girilen parametre 1 tane ise kare çevre hesapla
            return (boyut[0])*4;
        }else // varargsa girilen parametre 1 tane değil ise dikdörtgen cevre hesapla

        return (boyut[0]+boyut[1])*2;
    }

    @Override
    public int alan(int... boyut) {
        if (boyut.length==1){//varargs a girilen parametre 1 tane ise kare alanı hesapla
            return (boyut[0]*boyut[0]);
        }else//varargsa a girilen parametre1 tane değil ise dikdörtgen alan hesapla

        return (boyut[0]*boyut[1]);



    }
}
