package day21_TEKRAR;

import day13_methodOlusturma.c02_MethodOlusturma2SayiToplama;

import java.util.ArrayList;
import java.util.List;

public class c06_OrtakElementleriBulma {
    public static void main(String[] args) {

        // Soru 5- Verilen iki array’in elementlerini karsilastirip,
        // ikisinde ortak olan elementleri ayri bir liste olarak veren bir program yazin.


        Integer[] arr1 = {2,3,6,7,4,7};
        Integer[] arr2 = {1,3,5,7,9,3};

        List<Integer> karsilastirmaListesi = new ArrayList<>();

        for (Integer each1: arr1
             ) {
            for (Integer each2: arr2
                 ) {
                if (each1==each2 && !karsilastirmaListesi.contains(each2)){
                    karsilastirmaListesi.add(each1);
                }
            }
        }

        System.out.println(karsilastirmaListesi);


    }
}
