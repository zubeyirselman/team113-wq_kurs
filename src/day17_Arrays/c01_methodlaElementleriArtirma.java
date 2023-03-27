package day17_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class c01_methodlaElementleriArtirma {
    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int[] arr= {3,4,5,6};

        arr = arrayElementleriniArtir(arr, 2);

        System.out.println(Arrays.toString(arr)); // [5, 6, 7, 8]

    }

    public static int[] arrayElementleriniArtir(int[] ilkArr, int artis){

        for (int i = 0; i <ilkArr.length ; i++) {
            ilkArr[i] += artis;
        }

        return ilkArr;
    }
}
