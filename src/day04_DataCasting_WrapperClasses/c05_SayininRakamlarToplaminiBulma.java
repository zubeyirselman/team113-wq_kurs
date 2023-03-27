package day04_DataCasting_WrapperClasses;

import java.util.Scanner;

public class c05_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {

        //kullanicidan 3 basamakli bir sayi alin ve sayinin rakamlar toplamini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");

        int girilenSayi= scan.nextInt();

        int rakam= girilenSayi%10;

        int rakamlarToplami=rakam;




    }
}
