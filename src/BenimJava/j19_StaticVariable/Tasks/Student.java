package BenimJava.j19_StaticVariable.Tasks;

import java.util.ArrayList;

public class Student {
   String name;
   int maxCredit;
   ArrayList<Lesson> dersListesi;

   public int toplamKredisi()
   {
      int toplamKredi=0;
      for(Lesson les  : dersListesi)
      {
         toplamKredi+= les.credit;
      }
      return toplamKredi;
   }


}
