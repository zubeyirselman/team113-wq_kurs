package day25_passByValue_ImmutableClasses;

import java.time.LocalTime;

public class C05_DateTime {
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 23:05:40.151541400

        System.out.println(saat.getNano()); // 418606700 nano saniyedir.

        // bir loop ile 1 den 10.000 e kadar olan sayilari toplayin.
        // ve bu islemin kac nanosaniye surdugunu bulun.

        int toplam = 0;

        int baslamaSuresiNano = saat.getNano();


        for (int i = 1; i <=10000 ; i++) {
            toplam += i;
        }

        LocalTime saatSon = LocalTime.now();
        int bitisSuresiNano = saatSon.getNano();
        System.out.println("Islem Suresi: " + (bitisSuresiNano-baslamaSuresiNano));
        // Islem Suresi: 1000100

    }
}
