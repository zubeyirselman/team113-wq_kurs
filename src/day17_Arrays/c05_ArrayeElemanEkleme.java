package day17_Arrays;

import java.util.Arrays;

public class c05_ArrayeElemanEkleme {
    public static void main(String[] args) {

        // verilen array' e istenen elementi ekleyelim

        /*
        int[] a = {1,2,3};
        int[] b = {3,4,5,6,7};

        a = b ;
        System.out.println(Arrays.toString(a)); // [3, 4, 5, 6, 7]


        array' in uzunlugu degistirilmez
        ancak array' e yeni bir array degeri atanabilir
         */


        int[] arr = {4, 5, 6};
        int eklnecekElement = 10;

        //arr= new int[4]; // [0,0,0,0] ==> eski degerleri korumak icin boyle yapmayiz,
        // once yeni bir array olusturup
        // eski array' deki tum elementleri yeni array' e tasiyoruz
        // sonra istenen elementi de atayip
        // yeni arr istedigimiz hale gelince
        // eskiArr = yeniArr; diyerek yeni array' in degerini eskisine atiyoruz

        int[] yeniArr = new int[arr.length + 1]; // [0,0,0,0]

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];
        } // yeniArr [4,5,6,0]

        yeniArr[yeniArr.length-1]=eklnecekElement;

        System.out.println(Arrays.toString(yeniArr)); // [4, 5, 6, 10]

        arr= yeniArr;

        System.out.println(Arrays.toString(arr)); // [4, 5, 6, 10]


    }
}
