package Ihsan_Kurs_Ornek_Sorulari1;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        // Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program yazdırın.
        // Ornek1: Sanayagı yagı
        // Ornek2: Mutluluk uluk

        yarisiniDondur();

    }

    public static String yarisiniDondur() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ortadan tam bolunebilmesi icin karakter sayisi cift sayi olan kelime giriniz: ");
        String mtn = scan.next();

        mtn = mtn.substring(mtn.length() / 2, mtn.length());

        System.out.println(mtn);

        return mtn;
    }


}
