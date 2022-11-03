package BenimJava.j25_Encapsulation.encapsulation01;

public class C02_Encapsulation {
    private String name = "Gamze Hanım";
    //private int id=1001;
    int id = 1001;

    public C02_Encapsulation() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public C02_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }

   // public String isimver() {//getter method
   //     return name;
   // }
//
   // public int idver() {// getter method
   //     return id;
   // }
//
   // public void isimDegis(String isim) {
   //     this.name = isim;
   // }
//

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", id=" + id;
    }
}
