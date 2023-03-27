package day17_Arrays;

import java.util.Arrays;

public class c04_SagaKaydirma {
    public static void main(String[] args) {

        // verilen int bir array' deki tum elementleri bir saga kaydirip
        // sondaki elementi de en basa alip kaydedin
        // orn: [3,4,5,6] ===> [6,3,4,5]

        int[] arr = {3, 4, 5, 6, 7, 8, 9};

        int temp = arr[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {

            arr[arr.length - 1 - i] = arr[arr.length - 2 - i];
        }

        arr[0] = temp;

        System.out.println(Arrays.toString(arr));

    }
}
