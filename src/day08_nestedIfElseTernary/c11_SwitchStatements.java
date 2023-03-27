package day08_nestedIfElseTernary;

import java.util.Scanner;

public class c11_SwitchStatements {
    public static void main(String[] args) {


        // kullanicidan bir harf isteyin
        // o harf ile baslayan gun ismi varsa yazdirin
        // yoksa 'gecersiz harf' yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);
        harf= Character.toUpperCase(harf);

        if (harf=='P'){
            System.out.println("pazar, pazartesi veya persembe");
        } else if (harf== 'S') {
            System.out.println("sali");
        } else if (harf=='C') {
            System.out.println("carsamba, cuma veya cumartesi");
        } else {
            System.out.println("gecersiz harf");
        }

        System.out.println("=======================");
        // daha duzenli ve kullanisli olarak switch statements kullanabiliriz.
        // switch statements, switch onunde yazilan degiskene (burada harf) esit olan case' i calistirir.
        // calismaya basladiktan sonra 'break' gorunceye kadar
        // veya switch' in sonuna kadar calisir.

        switch (harf) {

            case 'S' :
                System.out.println("sali");
                break;

            case 'P' :
                System.out.println("pazar, pazartesi veya persembe");
                break;

            case 'C' :
                System.out.println("carsamba, cuma veya cumartesi");
                break;

            default:
                System.out.println("gecersiz harf");
        }


    }
}
