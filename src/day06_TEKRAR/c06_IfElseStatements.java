package day06_TEKRAR;

import java.util.Scanner;

public class c06_IfElseStatements {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan yasini isteyin,
        // 65 yas ve uzeri ise “Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz:");
        double yas = scan.nextDouble();

        if (yas>=65){
            System.out.println("Emekli Olabilirsiniz.");
        } else System.out.println("Emekli Olmaniz Icin gereken yil sayisi : " + (65-yas));


    }
}
