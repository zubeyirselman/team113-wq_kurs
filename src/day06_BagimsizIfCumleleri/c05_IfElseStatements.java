package day06_BagimsizIfCumleleri;

import java.util.Scanner;

public class c05_IfElseStatements {
    public static void main(String[] args) {

        /*
        eger bir olay icin;
            sadece 2 olasilik varsa
            ve bu olasiliklardan birisi mutlaka calisacaksa
            If Else Statements kullaniriz

            If Else Statements' da if body'si veya else body'si mutlaka calisir.
            ikisinin birden calisma ihtimali yoktur.
            ikisinin de calismama ihtimali yoktur.
         */

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

        System.out.println("Pozitif bir tamsayi giriniz:");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("Cift sayidir.");
        } else {
            System.out.println("Tek sayidir.");
        }



        //kullanicidan pozitif bir tamsayi alin
        //5 ile bolunup bolunmedigini yazdirin.

        if (sayi%5==0){
            System.out.println("Sayi 5 ile tam olarak bolunur.");
        } else {
            System.out.println("Sayi 5 ile tam olarak bolunemez");
        }



    }
}
