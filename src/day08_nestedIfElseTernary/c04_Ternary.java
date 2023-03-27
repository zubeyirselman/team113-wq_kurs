package day08_nestedIfElseTernary;

import java.util.Scanner;

public class c04_Ternary {
    public static void main(String[] args) {


        //kullanicidan pozitif bir tamsayi alin
        //sayi cift ise "sayi cift"
        //değilse "tek sayi" yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("cift sayi");
        } else {
            System.out.println("tek sayi");
        }

        System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");





    }
}
