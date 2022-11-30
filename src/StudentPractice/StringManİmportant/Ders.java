package StudentPractice.StringManİmportant;

public class Ders {
    public static void main(String[] args) {
String str ="JavaCAN & JavaTar";
method1ForLastIndex(str);
method2ForFirstIndex(str);
method3WhileSubstring(str);
method4StrBuilder(str);



    }
    private static void method1ForLastIndex(String str) {
        String s1="";
        String s2="";
        for(int i= str.length()-1; i>=0; i--){
            s1+= str.charAt(i);
            s2+= str.substring(i, i+1);
        }
        System.out.println("For Loop CharAt ile: "+s1);
        System.out.println("For Loop substring ile: "+s2);
    }
    private static void method2ForFirstIndex(String str) {
        String s3="";
        String s4="";
        for (int i=0; i<str.length(); i++) {
            s3 = str.charAt(i)+s3;
            s4 = str.substring(i, i+1)+s4;
        }
        System.out.println("For Loop First Index charAt ile: "+s3);
        System.out.println("For Loop First Index substring ile: "+s4);
    }
    private static void method3WhileSubstring(String str) {
        String s5="";
        while (str.length()>0){
            s5+= str.charAt(str.length()-1);
            str= str.substring(0,str.length()-1);
        }
        System.out.println("While ile "+s5);
    }
    private static void method4StrBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println("StringBuilder ile "+sb.reverse());
    }

}
