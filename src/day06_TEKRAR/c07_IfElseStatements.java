package day06_TEKRAR;

import java.util.Scanner;

public class c07_IfElseStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz.");
        char krk= scan.next().charAt(0);

        if ('A'<=krk && krk<='Z'){
            System.out.println("Girilen karakter buyuk harftir.");
        }
        else System.out.println("Girilen karakter buyuk harf degildir.");


    }
}
