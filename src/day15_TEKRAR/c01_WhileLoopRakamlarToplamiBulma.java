package day15_TEKRAR;

import java.util.Scanner;

public class c01_WhileLoopRakamlarToplamiBulma {
    public static void main(String[] args) {

        // while loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen rakamlari toplanacak sayiyi giriniz.");
        int girilenSayi =scan.nextInt();

        int sayi=girilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

       while (sayi>0){
           birlerBasamagi = sayi%10;
           rakamlarToplami += birlerBasamagi;
           sayi /=10;
       }
        System.out.println("Girilen " + girilenSayi + "' nin rakamlar toplami: " + rakamlarToplami);
        System.out.println(c02_RakamlarToplaminiBulMethodu.rakamlariTopla(735));
    }
}
