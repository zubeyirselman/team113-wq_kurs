package day03_TEKRAR;

import java.util.Scanner;

public class C03_ornek3 {
    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
        // sayi1: 17, sayi2: 31 olsun ve bunlarin yerlerini degistirin ve yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 1. Sayiyi Giriniz");
        int sayi1= scan.nextInt();

        System.out.println("Lutfen 2. Sayiyi Giriniz");
        int sayi2= scan.nextInt();

        int temp=0;

        temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("1.Sayi : " + sayi1 + "\n2.Sayi : " +sayi2);





    }
}
