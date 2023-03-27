package day26_TEKRAR;

import java.time.LocalDateTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt);
        // yil, ay, gun, saat, dakika, saniye, nano saniyeyi verir.

        System.out.println(ldt.toLocalDate());
        // sadece yil, gun, ayi verir.

        System.out.println(ldt.toLocalTime());
        // sadece saat, dakika, saniye, nano saniyeyi verir.

    }
}
