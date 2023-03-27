package day03_TEKRAR;

import java.util.Scanner;

public class c02_ornek2 {
    public static void main(String[] args) {

        /*Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        Girilen bilgiler : J Doe, 44
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen Isminizi Giriniz");
        String isim= scan.nextLine();

        System.out.println("Lutfen Soyisminizi Giriniz");
        String soyisim= scan.nextLine();

        System.out.println("Lutfen Yasinizi Giriniz");
        int yas= scan.nextInt();

        System.out.println("Girilen Bilgiler : " + isim.charAt(0) +" " + soyisim +"," + " " +yas);



    }
}
