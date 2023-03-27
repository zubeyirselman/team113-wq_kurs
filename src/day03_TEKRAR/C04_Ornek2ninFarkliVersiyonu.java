package day03_TEKRAR;

import java.util.Scanner;

public class C04_Ornek2ninFarkliVersiyonu {
    public static void main(String[] args) {

        /*Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        Girilen bilgiler : J Doe, 44
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen Isminizi, Soyisminizi ve Yasinizi Giriniz " +
                            "\nNot:Lutfen Her Girdiginiz Bilgiden Sonra 'ENTER' Tusuna Basiniz");

        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        int yas= scan.nextInt();

        System.out.println("Girilen bilgiler : " + isim.charAt(0) + " " +
                            soyisim + ", " + yas);

    }
}
