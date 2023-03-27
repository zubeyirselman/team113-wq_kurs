package day03_scanner_dataCasting_;

import java.util.Scanner;

public class c03_Scanner {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");

        //ilk olarak kullanicinin girdigi bilgiyi kaydedebilecek data turunde bir variable olusturun
        //ikinci olarak kullanicidan bilgiyi almak icin scan objesini ve ilgili next method'unu kullanın

        double yariCap= scan.nextDouble();

        //cevresini ve alanini yazdiralim simdi

        System.out.println("cemberin cevresi : " + 2*3.14*yariCap);

        System.out.println("cemberin alani : " + 3.14*yariCap*yariCap);

    }
}
