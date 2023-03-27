package day12_TEKRAR;

import java.util.Scanner;

public class c04_faktoriyel1 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //       bu sayinin faktoryel degerini hesaplayin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen faktoryeli alinacak 20' den kucuk bir pozitif tamsayi giriniz: ");
        int sayi = scan.nextInt();

        int fak = 1;

        for (int i = sayi; i >=1 ; i--) {
            fak *= i;
        }
        System.out.println(sayi + "! = " + fak);
    }
}
