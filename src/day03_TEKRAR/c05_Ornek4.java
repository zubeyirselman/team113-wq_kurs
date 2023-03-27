package day03_TEKRAR;

import java.util.Scanner;

public class c05_Ornek4 {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.
        // Çemberin çevresi : ” 2 π r ”
        //Çemberin alanı : ” π r 2 “

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapını giriniz.");
        double yariCap= scan.nextDouble();

        System.out.println("Cemberin Cevresi : " + 2*3.14*yariCap +
                            "\nCemberin Alani : " + 3.14*yariCap*yariCap);

    }
}
