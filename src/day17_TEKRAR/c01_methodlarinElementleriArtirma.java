package day17_TEKRAR;

import java.util.Arrays;

public class c01_methodlarinElementleriArtirma {
    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int[] arr= {3,4,5,6};

        arr = arrayinElemanlariniArtirma(arr, 4);
        System.out.println(Arrays.toString(arr)); // [7, 8, 9, 10]

    }

    public static int[] arrayinElemanlariniArtirma(int[] ilkarr, int artis){

        for (int i = 0; i <ilkarr.length ; i++) {
            ilkarr[i] += artis;
        }
        return ilkarr;
    }
}
