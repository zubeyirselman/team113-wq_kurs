package day14_TEKRAR;

import java.util.Scanner;

public class c07_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan bir sifre isteyin ve asagidaki sartlari saglayana kadar;
        // her seferinde hatalari soyleyip, yeni sifre isteyin.
        // sartlari saglayan sifre oldugunda;
        // "5. denemenizde basarili sifre olusturuldu" seklinde aciklama yazin.
        //  -ilk harf kucuk harf olmali
        //  -son harf buyuk harf olmali
        //  -bosluk icermemeli
        //  -8 karakter veya daha uzun olmali

        Scanner scan = new Scanner(System.in);

        int denemeSayisi = 0;
        String sifre = "";
        int flag = 0;

        while (flag != 4) {
            flag = 0;
            //  -ilk harf kucuk harf olmali
            System.out.println("Lutfen bir sifre giriniz: ");
            sifre = scan.nextLine();
            if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
                flag++;
            } else {
                System.out.println("Hatali Giris! Ilk harf kucuk olmali.");
            }

            //  -son harf buyuk harf olmali
            if (sifre.charAt(sifre.length() - 1) >= 'A' && sifre.charAt(sifre.length() - 1) <= 'Z') {
                flag++;
            } else {
                System.out.println("Hatali Giris! Son harf buyuk olmali.");
            }

            //  -bosluk icermemeli
            if (sifre.contains(" ")) {
                System.out.println("Hatali Giris! Sifre bosluk icermemeli.");
            } else {
                flag++;
            }

            //  -8 karakter veya daha uzun olmali
            if (sifre.length() >= 8) {
                flag++;
            } else {
                System.out.println("Hatali Giris! Uzunluk en az 8 karakter olmali.");
            }
            denemeSayisi++;
        }

        System.out.println("Tebrikler! " + denemeSayisi + " denemede sifreniz basariyla kaydedildi!");
    }
}
