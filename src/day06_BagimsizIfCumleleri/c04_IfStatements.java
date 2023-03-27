package day06_BagimsizIfCumleleri;

import java.util.Scanner;

public class c04_IfStatements {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan notunu alin,
        // 50 veya daha buyukse “Sinifi Gectin”, 50’den kucukse “Maalesef kaldin” yazdirin.

        /*
        if statements' da sart parantezinden sonra {} kullanmazsak,
        java ilk ";" ' e kadar olan kismi if body olarak kabul eder.

        if body zaten 1 satir ise bu bir sorun olmaz.
        ama if body 1 satirdan coksa ilk satirdan sonrasi her durumda calisir.

        YANİ EGER KODUMUZ 1 SATIRSA SÜSLÜ PARANTEZ KULLANMAYABILIRIZ
        AMA FAZLAYSA MUTLAKA KULLANMAMIZ LAZIM
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz:");

        double not= scan.nextDouble();

        if (not>=50 && not<=100){
            System.out.println("Sinifi Gectiniz!");
        }
        if (not<50){
            System.out.println("Maalesef kaldiniz!");
        }










    }
}
