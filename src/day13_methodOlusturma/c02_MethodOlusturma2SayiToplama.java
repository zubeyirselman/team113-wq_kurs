package day13_methodOlusturma;

import java.util.Scanner;

public class c02_MethodOlusturma2SayiToplama {
    public static void main(String[] args) {

        // kullanicidan 2 sayi alip,
        // toplamlarini yazdiran bir method olusturun.

    ikiSayiTopla();
    ikiSayiTopla();
    }

    public static void ikiSayiTopla() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Toplamak uzere 2 sayi giriniz:");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        System.out.println("2 sayinin toplami: " + (sayi1+sayi2));

    }


}
