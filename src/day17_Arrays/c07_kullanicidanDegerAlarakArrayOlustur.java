package day17_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class c07_kullanicidanDegerAlarakArrayOlustur {
    public static void main(String[] args) {

        // kullanicidan array olusturmak uzere pozitif tamsayilar alin,
        // kullaniciya islemi bitirmesi icin 0' a basmasi gerektigini soyleyin,
        // bir onceki class' dan method kullanarak aldiginiz elementleri array' e ekleyin.

        Scanner scan= new Scanner(System.in);

        int girilenSayi = 1;
        int[] arr = new int[0]; // []

        while (girilenSayi!=0){
            System.out.println("array' e eklemek icin pozitif tamsayilar girin" +
                                "\n islemi bitirmek icin 0' a basin.");

            girilenSayi = scan.nextInt();

            if (girilenSayi !=0){

                arr = c06_ArrayElemanEklemeMethodu.arrayeElementEkleMethodu(arr,girilenSayi);
            }

        }


        System.out.println(Arrays.toString(arr));


    }
}
