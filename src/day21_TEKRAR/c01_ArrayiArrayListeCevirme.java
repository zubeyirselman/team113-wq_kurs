package day21_TEKRAR;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c01_ArrayiArrayListeCevirme {
    public static void main(String[] args) {

        Integer[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};

        // arr array' inin elementlerini iceren bir array list olusturun

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println("sayilar listesi: " + sayilar);
        // sayilar listesi: [3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8]


        /*
             java' da bir array' i arrayList' e cevirmek icin kullanilan asList() vardir.
             ancak kullanimi tavsiye edilmez. cunku 2 tane buyuk dezavantaji vardir.
                1- asList() kullanilarak array' den list' e cevrilen listelerde
                ekleme / silme gibi uzunlugu degistiren methodlar kullanilamaz.

                2- arka planda array ve arrayden donusturdugumuz list beraber hareket eder.
                birinde yaptigimiz update' ler otekinede islenir.
         */

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println("arrayden liste cevrilen: " + arraydenList);
        // arrayden liste cevrilen: [3, 5, 6, 7, 3, 2, 3, 5, 8, 7, 1, 2, 3, 4, 5, 8]


        // 2 liste de 11 ekleyelim

        sayilar.add(11);
        //arraydenList.add(11); // UnsupportedOperationException

        System.out.println(sayilar);
        System.out.println(arraydenList);

        // 2 listin 0. indexindeki elementleri silelim

        sayilar.remove(0);
        //arraydenList.remove(0); // UnsupportedOperationException

        System.out.println(sayilar);
        System.out.println(arraydenList);

        // 2.DEZAVANTAJ

        System.out.println("array:         " + Arrays.toString(arr));
        System.out.println("arrayden list: " + arraydenList);

        // array' in bir elementine yeni deger atayalim

        arr[0] = 22;

        System.out.println(" ==========array' i degistirdikten sonra");

        System.out.println("array:         " + Arrays.toString(arr));
        System.out.println("arrayden list: " + arraydenList);

        // list' in bir elementini update edelim

        arraydenList.set(1,45);

        System.out.println(" ==========list' i degistirdikten sonra");

        System.out.println("array:         " + Arrays.toString(arr));
        System.out.println("arrayden list: " + arraydenList);
    }

}
