package day11_StringManipulations_ForLoop;

public class c04_replaceAll {
    public static void main(String[] args) {


        String str = "J1a23va34 5C54and65ir87";

        //str' daki sayilari methodla temizleyin

        /* eger degistirmek istedigimiz metin tek bir metin degil ortak ozelligi olan farkli metinlerse
            -tum sayilar
            -sayi olmayanlarin tumu
            -tum space' ler
            -space olmayan tum karakterler
            gibi...

            bu ortak ozellikleri belirtmek icin java regex tanimlamistir.
         */

        str = str.replaceAll("\\d", "");
        System.out.println("str' in yeni hali: " + str);


    }
}
