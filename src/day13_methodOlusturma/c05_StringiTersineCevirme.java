package day13_methodOlusturma;

import java.sql.SQLOutput;

public class c05_StringiTersineCevirme {
    public static void main(String[] args) {

        // verilen bir stringi tersine cevirip,
        // bize donduren bir method olusturun.

        System.out.println(stringTerseCevirme("Java Candir"));
        System.out.println(stringTerseCevirme("Anlasildi mi?"));
        System.out.println(stringTerseCevirme("soyle omer"));


    }

    public static String stringTerseCevirme(String metin){ // Java
        String tersMetin="";
        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin += metin.charAt(i);
        }
        return tersMetin;
    }



}
