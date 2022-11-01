package BenimJava.j24_AccesModifier.farkliPackage;

import BenimJava.j24_AccesModifier.C01_AccessModifier;

public class c03_AccesModifier {
    private String privateTeamLead="Murat TAŞ";
    String defaultName="Cebrail bey";
    protected String protectedName="Melek Hanım";
    public String publicName="Gamze Hanım";

    public static void main(String[] args) {


        C01_AccessModifier obj9 = new C01_AccessModifier(23, 63);

        System.out.println("obj9.publicYas = " + obj9.publicYas);
        System.out.println("obj9.protectedYas = " + obj9.protectedYas);

    }
}
/* hocanın
 private String privateTeamLead="Hakan Aydın";
    String defaultName="cebrail bey";
    protected  String protectedName="Dilek hanım";
    public  String  publicName="Gamze Hanım";

   public static void main(String[] args) {

        C01_AccessModifier obj9= new C01_AccessModifier(23,63);//public cons.
        //agama public cons. selam :)
        System.out.println("obj9.publicYas = " + obj9.publicYas);//48->public variable
       // obj9.defaultYas// default variable package dısı erişlimez
       // obj9.protectedMethod()//protected methoc package dışı call edilemez

 */