package day26_localTime_varargs;

import java.time.LocalTime;
import java.util.Locale;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat1 = LocalTime.of(20,15);
        System.out.println(saat1); // 20:15

        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 20:53:28.069901

        // LocalTime objesi olan saat variable' i canli bir saat degildir.
        // olusturuldugu andaki local time' i sistemden alip kaydettigimiz sabit bir degerdir.
        // kodun ilerleyen kisminda ne kadar sure gectigini gormek icin
        // saati yeniden almamiz gerekirse, yeni bir LocalTime objesi daha olusturmaliyiz.

        System.out.println(saat.getHour());
        // get method' lari localTime objesinin saat, dakika, saniye ve nano degerlerini bize getirir.

        System.out.println(saat.plusHours(2).plusMinutes(10));
        // anlık zamana; saat, dakika, saniye ve nano degerlerine ekleme yapar.

        System.out.println(saat.minusMinutes(10).minusSeconds(10));
        // anlık zamandan saat, dakika, saniye ve nano degerlerinden cikarma yapar.

        System.out.println(saat.withSecond(10).withNano(20));
        // anlık zamanin saat, dakika, saniye ve nano degerlerini istedigimiz degeri girerek degistirir.

        System.out.println(saat.compareTo(saat1));
        // saatleri karsilastirma ==> ayni ise 0, farkli ise -1 doner.

        System.out.println(saat.isAfter(saat1));
        // sonra mi?

        System.out.println(saat.isBefore(saat1));
        // once mi?

        System.out.println(saat.toSecondOfDay());
        // su anda gunun kacinci saniyesi' ni verir.

    }
}
