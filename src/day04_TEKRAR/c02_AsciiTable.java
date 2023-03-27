package day04_TEKRAR;

import java.util.Scanner;

public class c02_AsciiTable {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenHarf= scan.nextLine().charAt(0);

        System.out.println("girilen harften sonraki 1. harf : " + (char)(girilenHarf + 1) +
                            "\ngirilen harften sonraki 2. harf : " + (char)(girilenHarf + 2) +
                            "\ngirilen harften sonraki 3. harf : " + (char)(girilenHarf + 3));


    }
}
