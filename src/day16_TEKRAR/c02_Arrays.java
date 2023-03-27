package day16_TEKRAR;

import java.util.Arrays;

public class c02_Arrays {
    public static void main(String[] args) {

        String[] isimler = {"Nurefsan", "Berke", "Mustafa"};
        int[] sayilar = {3, 4, 5, 6, 7, 8, 6, 5, 4, 3, 2};
        char[] karakterler = {'e', '4', ','};

        // array non-primitive data turlerindendir.
        // eger array' i liste seklinde olusturmayip,
        // new keyword kullaniyorsak UZUNLUGUNU YAZMAK ZORUNDAYIZ.
        String[] arr = new String[5];

        // bir array tanimlanan uzunluktan daha fazla veya az eleman alamaz.

        // bir array' i yazdirmak istersek;

        //System.out.println(isimler); // [Ljava.lang.String;@48140564
        // array' ler direk yazdirilamazlar. soyle yapiyoruz;

        System.out.println(Arrays.toString(isimler)); // [Nurefsan, Berke, Mustafa]

        System.out.println(Arrays.toString(arr)); // [null, null, null, null, null]

        int[] a = new int[7];
        System.out.println(Arrays.toString(a)); // [0, 0, 0, 0, 0, 0, 0]

        // array' deki elementlere nasil ulasiriz? ==> indexle

        a[0] = 4; // [4, 0, 0, 0, 0, 0, 0]
        a[3] = 7; // [4, 0, 0, 7, 0, 0, 0]
        //a[7] = 8; // ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(a));

        // sayilar array' inin 4. indexindeki elementi yazdirin

        System.out.println(sayilar[4]); // 7

        // isimler array' inin 1. indexindeki ismi yazdirin

        System.out.println(isimler[1]); // Berke


    }
}
