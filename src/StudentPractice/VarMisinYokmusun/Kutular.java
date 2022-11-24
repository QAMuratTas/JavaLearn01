package StudentPractice.VarMisinYokmusun;

import java.util.ArrayList;
import java.util.List;

public class Kutular {
   private List<Kutu> kutuListesi = new ArrayList<>();

    public void kutuEkle(Kutu gegelnKutu){
kutuListesi.add(gegelnKutu);
    }

public int kalanKutuSayisiniAl() {
return kutuListesi.size();
}

public int kutulardakiToplamParaMiktari () {
return 0;
}
public void kendiKutumuKaldir (int kutuNumarasi){
    for (Kutu kutu : kutuListesi) {
        if (kutuNumarasi == kutu.getKutuNumarasi()){

            kutuListesi.remove(kutu);
        }

    }

}
    public String acilmamisKutulariGöster(){
        String acilmamıslar="";
        for (Kutu kutu : kutuListesi){
            acilmamıslar+=" "+kutu.getKutuNumarasi();

        }

return acilmamıslar;
    }

    public void ktuActir (int kutuNumarasi){

    }
    public int teklifAl () {
       return 0;
    }
}
