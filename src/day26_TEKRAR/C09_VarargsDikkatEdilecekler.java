package day26_TEKRAR;

import java.util.Arrays;

public class C09_VarargsDikkatEdilecekler {
    public static void main(String[] args) {

        // verilen sayilardan ilki haric digerlerini toplasin
        // sonra toplam ile ilk sayiyi carpip yazdirsin

        topla(2,3,5,6,7,8,2);

         /*
            DIKKAT EDILECEKLER 2-
            son sayiyi ayirmak istesek ?
            varargs eklenen tum parametreleri kendisi almak ister.

            Bundan oturu bir method' da parametre olarak varargs kullanilacaksa,
            EN SON parametre olarak kullanilmalidir.

            DIKKAT EDILECEKLER 3-

            Bir method' da parametre olarak 2 varargs KULLANILAMAZ!
            Cunku varargs son parametre olmalidir.
            2 varargs olursa biri sonuncu olamayacagi icin CTE verir.
         */

    }

        /*
    public static void topla(int... a){

        System.out.println(Arrays.toString(a));

        int toplam = 0;
        for (int each:a
        ) {
            toplam +=each;
        }
        System.out.println("Toplam: " + toplam);
    }
        DIKKAT EDILECEKLER 1-
        2 method icin her ne kadar parametre sayisi farkli olsa da
        varargs' in yapisindan dolayi int a, int... b ile int...b arasinda
        argument kabulu acisindan fark yoktur.
    */

    public static void topla(int c, int... a){

        System.out.println(Arrays.toString(a));

        int toplam = 0;
        for (int each:a
        ) {
            toplam +=each;
        }
        System.out.println("Istenen islem sonucu : " + toplam*c);
    }
}
