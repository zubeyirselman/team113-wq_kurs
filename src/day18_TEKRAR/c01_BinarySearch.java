package day18_TEKRAR;

import java.util.Arrays;

public class c01_BinarySearch {
    public static void main(String[] args) {

        // verilen bir array' de istenen elemanin olup olmadigini bulur.

        int[] arr = {4,9,1,5,11,3,7,4,6};

        System.out.println(Arrays.binarySearch(arr, 4)); // 0
        System.out.println(Arrays.binarySearch(arr, 11)); // 4
        System.out.println(Arrays.binarySearch(arr, 7)); // -2

        // array' de binary search method' unun duzgun calismasi icin oncelikle
        // sort' un calistirilmasi lazimdir.

        Arrays.sort(arr); // [1, 3, 4, 4, 5, 6, 7, 9, 11]

        System.out.println(Arrays.binarySearch(arr, 5)); // 4
        System.out.println(Arrays.binarySearch(arr, 11)); // 8
        System.out.println(Arrays.binarySearch(arr, 1)); // 0
        System.out.println(Arrays.binarySearch(arr, 7)); // 6
        System.out.println(Arrays.binarySearch(arr, 4)); // 2

        // binary search method' u aranan elementin INDEXINI döner.

        System.out.println(Arrays.binarySearch(arr, 2)); // -2
        System.out.println(Arrays.binarySearch(arr, -3)); // -1
        System.out.println(Arrays.binarySearch(arr, 8)); // -8
        System.out.println(Arrays.binarySearch(arr, 10)); // -9
        System.out.println(Arrays.binarySearch(arr, 13)); // -10
        System.out.println(Arrays.binarySearch(arr, 20)); // -10


        // olmayan bir element aratilirsa, once array' de olsaydi nerede olurdu? bunu buluyoruz
        // sonra olmasi gereken siranin - isaretli degerini veriyoruz
        // bu mantikla en kucuk element' den daha kucuk butun sayilar icin -1
        // en buyuk element' den buyuk olan butun sayilar icin de lenght-1 degeri dondurur.

    }
}
