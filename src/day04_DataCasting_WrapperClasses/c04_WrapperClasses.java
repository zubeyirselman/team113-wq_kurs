package day04_DataCasting_WrapperClasses;

public class c04_WrapperClasses {
    public static void main(String[] args) {
        /*
        nonprimitive data turlerinin hazir methodlari varken
        primitive data turlerinin hazır methodlari yoktur.
        java primitive data turleri icin, kolayca gecis yapabilecekleri
        nonprimitive data turleri olusturmustur.

        int====> Integer
        byte===> Byte
        char===> Character
        boolean=> Boolean
         */

        Integer sayi=10;
        // int variable'a atadigimiz degerleri atayabiliyoruz
        //arti olarak hazir method'lari var

        //variabe olusturmadan da bazi method'lari kullanabiliyoruz

        System.out.println(Integer.MIN_VALUE); //-2147483648
        System.out.println(Integer.MAX_VALUE); //2147483647

        String sonucStr= "345";

        System.out.println(sonucStr+10); // 34510

        // bu degere 10 ekleyin

        //int sonuc=(int)sonucStr;
        //bu durumda Wrapper Classes'lar imdada yetisir.

        int sonuc=Integer.parseInt(sonucStr);
        System.out.println(sonuc+10); //355

        sonuc= Integer.valueOf(sonucStr);
        System.out.println(sonuc+10); //355

        char krk= '3';

        System.out.println(Character.isDigit(krk));
        System.out.println(Character.isLetter(krk));

        System.out.println(Character.isAlphabetic(krk));


    }
}
