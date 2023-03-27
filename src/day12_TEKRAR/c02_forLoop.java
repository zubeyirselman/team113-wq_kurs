package day12_TEKRAR;

import java.util.Scanner;

public class c02_forLoop {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degeri giriniz: ");
        int bas = scan.nextInt();
        int bit = scan.nextInt();
        int sayiToplami = 0;

        if (bas > bit) {
            System.out.println("Hata! baslangic degeri bitis degerinden kucuk olmalidir.");
        } else {

            for (int i = bas; i <= bit; i++) {
                sayiToplami += i;
            }
            System.out.println("Sayilarin Toplami: " + sayiToplami);
        }
    }
}
