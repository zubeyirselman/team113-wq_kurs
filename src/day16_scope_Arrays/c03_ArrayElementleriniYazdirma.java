package day16_scope_Arrays;

import java.util.Arrays;

public class c03_ArrayElementleriniYazdirma {
    public static void main(String[] args) {

        int[] arr = {3, 5, 6, 7, 8, 1, 2};

        // tum array' i yazdirin.

        System.out.println(Arrays.toString(arr)); // [3, 5, 6, 7, 8, 1, 2] ==> bu bir array

        // array' in tum elementlerini yan yana aralarinda bir bosluk olacak sekilde yazdirin

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " "); // 3 5 6 7 8 1 2 ==> bu array' in elementleri

        }


    }
}
