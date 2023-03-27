package day06_TEKRAR;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan notunu alin,
        // 50 veya daha buyukse “Sinifi Gectin”, 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz:");

        double not= scan.nextDouble();

        if (not>=50 && not<=100){
            System.out.println("Sinifi Gectiniz!");
        }
        else {
            System.out.println("Maalesef kaldiniz!");
        }


        //kullanicidan pozitif bir tamsayi alin,
        //sayinin tek veya cift sayi oldugunu yazdirin.

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Sayi cift sayidir");
        }
        else System.out.println("Sayi tek sayidir");



        //kullanicidan pozitif bir tamsayi alin
        //5 ile bolunup bolunmedigini yazdirin.

        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi2= scan.nextInt();

        if (sayi2%5==0){
            System.out.println("Girilen sayi 5 ile tam olarak bolunebilir.");
        }
        else System.out.println("Girilen sayi 5 ile tam olarak bolunemez.");




    }
}
