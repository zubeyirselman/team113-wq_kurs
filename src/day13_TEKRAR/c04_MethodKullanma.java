package day13_TEKRAR;

import java.util.Scanner;

public class c04_MethodKullanma {
    public static void main(String[] args) {

        // kullanicidan 10' dan kucuk iki pozitif tamsayi alip,
        // faktoriyel degerlerini toplayin

        Scanner scan = new Scanner(System.in);
        System.out.println("10'dan kucuk 2 adet pozitif tamsayi giriniz:");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int sonuc= c03_faktoriyelHesaplama.faktoriyelHesaplama(sayi1)
                    +c03_faktoriyelHesaplama.faktoriyelHesaplama(sayi2);

        System.out.println(sonuc);


    }
}
