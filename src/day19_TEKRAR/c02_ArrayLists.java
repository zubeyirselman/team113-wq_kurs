package day19_TEKRAR;

import day17_Arrays.c06_ArrayElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c02_ArrayLists {
    public static void main(String[] args) {

         /*
            ArrayLists, uzunlugu esnek bir listedir.
            Array altyapisini kullanir. Ancak ekleme ve silme gibi islemlerde daha avantajlidir.

            ArrayList' in tek dezavantaji var
            o da elementleri tek tek eklememiz gerekmesi
         */

        int[] arr = {3,4};

        arr = c06_ArrayElemanEklemeMethodu.arrayeElementEkleMethodu(arr, 5);
        System.out.println(Arrays.toString(arr)); // [3, 4, 5]

        arr = c06_ArrayElemanEklemeMethodu.arrayeElementEkleMethodu(arr, 15);
        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 15]


        List<String> harfler = new ArrayList<>(); // boş bir list olusturur.

        System.out.println(harfler); // []

        harfler.add("s");
        harfler.add("l");
        harfler.add("a");

        System.out.println(harfler); // [s, l, a]



    }
}
