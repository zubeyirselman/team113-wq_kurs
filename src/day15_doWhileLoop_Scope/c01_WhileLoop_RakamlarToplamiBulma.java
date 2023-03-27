package day15_doWhileLoop_Scope;

import java.util.Scanner;

public class c01_WhileLoop_RakamlarToplamiBulma {

    public static void main(String[] args) {

        // while loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scan = new Scanner(System.in);
        System.out.println("rakamlari toplanacak pozitif tamsayi giriniz:");
        int girilenSayi = scan.nextInt();

        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;


        while (sayi > 0) {

            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10;

        }

        System.out.println("girilen " + girilenSayi + " 'nin rakamlar toplami: " + rakamlarToplami);

        System.out.println(c02_RakamlarToplaminiBul.rakamlarToplaminiBul(girilenSayi));

    }
}

