package day06_TEKRAR;

import java.util.Scanner;

public class c03_IfStatements {
    public static void main(String[] args) {


        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("ucgenin 3 kenar uzunlugunu giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3){
            System.out.println("eskenar ucgendir.");
        }


    }
}
