package day13_TEKRAR;

public class c05_StringTerseCevirme {
    public static void main(String[] args) {

        // verilen bir stringi tersine cevirip,
        // bize donduren bir method olusturun.

        System.out.println(stringTerseCevirme("Selman abdülkadir"));


    }
    public static String stringTerseCevirme(String metin){

        String tersMetin="";
        for (int i = metin.length()-1; i >=0 ; i--) {
            tersMetin+=metin.charAt(i);
        }
        return tersMetin;
    }
}
