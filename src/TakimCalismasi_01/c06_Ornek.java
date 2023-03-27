package TakimCalismasi_01;

import java.util.Scanner;

public class c06_Ornek {
    public static void main(String[] args) {

        // 7-Soru: Kullanıcıdan 1' den buyuk pozitif birtam sayı girmesini isteyin
        // ve ardından sayının asal bir sayı olup olmadığını kontrol edin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1' den buyuk pozitif bir tamsayi giriniz: ");
        int sayi = scan.nextInt();


        int flag = 0;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag++;
                break;
            }
        }

        if (sayi==2){
            System.out.println("girilen 2 Sayisi asal sayidir.");
        } else if (flag==0) {
            System.out.println("girilen sayi asal sayidir.");
        } else {
            System.out.println("girilen sayi asal sayi degildir.");
        }
    }
}