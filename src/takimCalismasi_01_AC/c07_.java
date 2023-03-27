package takimCalismasi_01_AC;

import java.util.Scanner;

public class c07_ {
    public static void main(String[] args) {

        // 7-Soru: Kullanıcıdan 1' den buyuk pozitif birtam sayı girmesini isteyin
        // ve ardından sayının asal bir sayı olup olmadığını kontrol edin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz: ");
        int sayi = scan.nextInt();


        int flag = 0;

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {
                flag++;
                break;
            }
        }

        if (sayi == 2) {
            System.out.println("Girilen 2 sayisi ASAL bir sayidir.");
        } else if (flag == 0) {
            System.out.println("Girilen " + sayi + " sayisi ASAL bir sayidir.");
        } else {
            System.out.println("Girilen " + sayi + " sayisi ASAL bir sayi degildir.");
        }

    }
}
