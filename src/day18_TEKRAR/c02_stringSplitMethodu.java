package day18_TEKRAR;

import java.util.Arrays;

public class c02_stringSplitMethodu {
    public static void main(String[] args) {

        // bir stringi istedigimiz parcalara ayirmak icin kullanilir.

        String str = "Java candir can, bundan suphesi olan var mi?";

        // str kac kelimedir?

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, candir, can,, bundan, suphesi, olan, var, mi?]

        System.out.println("kelime sayisi: " + kelimeler.length); // kelime sayisi: 8

        // en uzun kelime kac harflidir?

        int enUzunKelimeLength = kelimeler[0].length();

        for (int i = 0; i <kelimeler.length ; i++) {

            if (kelimeler[i].length()>enUzunKelimeLength){
                enUzunKelimeLength = kelimeler[i].length();
            }

        }

        System.out.println("en uzun kelimenin karakter sayisi: " + enUzunKelimeLength);
        // en uzun kelimenin karakter sayisi: 7


        // bir stringi karakterlerine ayirmak istersek

        String[] karakterler = str.split("");

        System.out.println(Arrays.toString(karakterler));
        // [J, a, v, a,  , c, a, n, d, i, r,  , c, a, n, ,,  , b, u, n, d, a, n,  , s, u, p, h, e, s, i,  , o, l, a, n,  , v, a, r,  , m, i, ?]

        System.out.println("Cumledeki karakter sayisi: " + karakterler.length);
        // Cumledeki karakter sayisi: 44

        String[] can = str.split("can");
        System.out.println(Arrays.toString(can));
        // [Java , dir , , bundan suphesi olan var mi?]

        String[] a = str.split("a");
        System.out.println(Arrays.toString(a));
        // [J, v,  c, ndir c, n, bund, n suphesi ol, n v, r mi?]

    }
}
