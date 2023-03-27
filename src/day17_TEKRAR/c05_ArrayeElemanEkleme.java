package day17_TEKRAR;

import java.util.Arrays;

public class c05_ArrayeElemanEkleme {
    public static void main(String[] args) {




        /*int[] a = {4,5,6};
        int[] b = {4,5,6,10};

        a = b ;
        System.out.println(Arrays.toString(a)); // [4, 5, 6, 10]

        arrayin uzunlugu degistirilmez
        ancak array e yeni bir array degeri atanabilir.
         */

        // verilen array' e istenen elementi ekleyelim

        int[] arr = {4,5,6};
        int eklenecekElement = 10;

        //arr= new int[4]; // [0,0,0,0] ==> eski degerleri korumak icin boyle yapmayiz,
        // once yeni bir array olusturup
        // eski array' deki tum elementleri yeni array' e tasiyoruz
        // sonra istenen elementi de atayip
        // yeni arr istedigimiz hale gelince
        // eskiArr = yeniArr; diyerek yeni array' in degerini eskisine atiyoruz

        int[] yeniArr = new int[arr.length+1]; // [0,0,0,0]

        for (int i = 0; i <arr.length ; i++) {

            yeniArr[i] = arr[i];
        }// [4,5,6,0]

        yeniArr[yeniArr.length-1] = eklenecekElement;

        System.out.println(Arrays.toString(yeniArr)); // [4, 5, 6, 10]

        arr = yeniArr;

        System.out.println(Arrays.toString(arr)); // [4, 5, 6, 10]
    }
}
