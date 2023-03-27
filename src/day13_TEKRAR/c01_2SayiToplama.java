package day13_TEKRAR;

import java.util.Scanner;

public class c01_2SayiToplama {
    public static void main(String[] args) {


        // kullanicidan 2 sayi alip,
        // toplamlarini yazdiran bir method olusturun.

        ikiSayiToplama();

    }
    // sadece yazdiracaksa void veriyoruz

    public static void ikiSayiToplama(){

        Scanner scan= new Scanner(System.in);
        System.out.println("Toplamak uzere 2 sayi giriniz:");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("2 sayinin toplami: " + (sayi1+sayi2));
    }

}
