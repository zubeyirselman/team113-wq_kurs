package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class c05_ScannerİlkGorev {
    public static void main(String[] args) {

        //kullanicidan bir sayi alin ve sayinin karesini yazdırın

        Scanner sayi= new Scanner(System.in);
        System.out.println("lutfen bir sayi girin");
        double girilenSayi= sayi.nextDouble();
        System.out.println("girilen sayinin karesi :" + girilenSayi*girilenSayi);

    }
}
