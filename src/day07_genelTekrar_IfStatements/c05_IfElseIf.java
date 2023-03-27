package day07_genelTekrar_IfStatements;

import java.util.Scanner;

public class c05_IfElseIf {
    public static void main(String[] args) {

         /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Cinsiyetinizi ve Yasinizi Giriniz : " +
                "\nNOT1: Lutfen Kadin icin K, Erkek icin E Giriniz." +
                "\nNOT2: Lutfen Girdiginiz Her Bilgiden Sonra ENTER Tusuna Basiniz.");
        char cns=scan.next().charAt(0);
        double yas= scan.nextDouble();

        if ((cns=='K' && yas>=60) || (cns=='E' && yas>=65)){
            System.out.println("Emekli Olabilirsiniz.");
        } else if (cns=='K') {
            System.out.println("Emekli olmak icin " +(60-yas)+ " yil daha calisman gerekir.");
        } else if (cns=='E') {
            System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calisman gerekir.");
        }


    }
}
