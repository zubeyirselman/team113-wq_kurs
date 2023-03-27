package day12_TEKRAR;

import java.util.Scanner;

public class c03_forLoop {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif tamsayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucuk olsa da program calissin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangic degerini tamsayi olarak giriniz.");
        int bas= scan.nextInt();
        System.out.println("Bitis degerini tamsayi olarak giriniz.");
        int bit= scan.nextInt();

        int sayilarToplami=0;

        if (bit>=bas){
            for (int i = bas; i <=bit ; i++) {
                sayilarToplami += i;
            }
            System.out.println("Sayilar Toplami: " + sayilarToplami);
        }else {
            for (int i = bas; i >=bit ; i--) {
                sayilarToplami += i;
            }
            System.out.println("Sayilar Toplami: " + sayilarToplami);
        }
    }
}
