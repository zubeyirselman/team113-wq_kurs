package Ornek_Sorular;

import day13_methodOlusturma.c02_MethodOlusturma2SayiToplama;
import day13_methodOlusturma.c05_StringiTersineCevirme;
import day21_arrayLists_forEachLoop.c04_KarelerinToplami;

import java.util.ArrayList;
import java.util.List;

public class c03_string {
    public static void main(String[] args) {


        // Bir array' de istedigimiz index' teki elementi yazdiran bir method olusturun.

        int[] arr = {2,3,4,5,5};
        verilenIndexiYazdirma(arr, 3);
        verilenIndexiYazdirma(arr, 2);


    }

    public static void verilenIndexiYazdirma(int[] arr, int index) {

        System.out.println(arr[index]);


    }
}
