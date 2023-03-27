package day15_TEKRAR;

import java.util.Scanner;

public class c04_DoWhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar alin,
        // kullaniciya bitirmek icin 0' a basmasini soyleyin,
        // kullanici 0' a bastiginda,
        // 0 haric kac sayi girildigini ve toplamlarini yazdirin.

        Scanner scan = new Scanner(System.in);

        int girilenSayi = 13;
        int toplam = 0;
        int sayiAdedi = 0;

        while (girilenSayi !=0){

            System.out.println("Toplanmak uzere tamsayi giriniz: " +
                              "\nBitirmek icin 0' a basiniz.");
            girilenSayi = scan.nextInt();

            if (girilenSayi != 0){
                toplam += girilenSayi;
                sayiAdedi++;
            }

        }
        System.out.println("girilen " + sayiAdedi + " adet sayinin toplami: " + toplam);
    }
}
