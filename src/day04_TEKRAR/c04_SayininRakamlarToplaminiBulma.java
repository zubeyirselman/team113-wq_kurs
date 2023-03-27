package day04_TEKRAR;

import java.util.Scanner;

public class c04_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {

        //kullanicidan 3 basamakli bir sayi alin ve sayinin rakamlar toplamini yazdirin

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli bir tamsayi giriniz");

        int girilenSayi= scan.nextInt(); // 135

        int rakam= girilenSayi %10;

        int rakamlarToplami= rakam;

        //---------------------------

        girilenSayi= girilenSayi/10;

        rakam= girilenSayi%10;

        rakamlarToplami= rakamlarToplami+rakam;


        girilenSayi= girilenSayi/10;

        rakam= girilenSayi%10;

        rakamlarToplami=rakamlarToplami+rakam;

        System.out.println(rakamlarToplami);







    }
}
