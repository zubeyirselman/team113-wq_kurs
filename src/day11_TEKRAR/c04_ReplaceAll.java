package day11_TEKRAR;

public class c04_ReplaceAll {
    public static void main(String[] args) {

        String str= "J1a23va34 5C54and65ir87";

        // str' daki sayilari method' la temizleyin

        /*
        eger degistirmek istedigimiz tek bir metin degil,
        ortak ozelligi olan farkli metinlerse

            - tum sayilar
            - sayi olmayanlarin tumu
            - tum space' ler
            - space olmayan tum karakterler.
            gibi..

            bu ortak ozellikleri belirtmek icin Java regex tanimlamistir.
         */

        str= str.replaceAll("\\d", "");
        System.out.println(str); // Java Candir

    }
}
