package day17_Arrays;

import java.util.Arrays;

public class c06_ArrayElemanEklemeMethodu {
    public static void main(String[] args) {


        // verilen bir array' e istenen bir elementi  ekleyip,
        // yeni halini bize donduren bir method olusturun

        int[] arr = {2,4,7,8};

        arr = arrayeElementEkleMethodu(arr, 5);

        System.out.println(Arrays.toString(arr)); // [2, 4, 7, 8, 5]

        System.out.println(Arrays.toString(arrayeElementEkleMethodu(arr, 45)));


    }


    public static int[] arrayeElementEkleMethodu(int[] arr, int eklenecekElement){

        int[] yeniArr = new int[arr.length+1]; // [0,0,0,0,0]

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i] = arr[i];
        } // yeniArr [2,4,7,8,0]
        yeniArr[yeniArr.length-1] = eklenecekElement;

        return yeniArr;

    }

}
