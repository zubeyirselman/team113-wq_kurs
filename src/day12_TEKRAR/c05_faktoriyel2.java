package day12_TEKRAR;

import java.util.Scanner;

public class c05_faktoriyel2 {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        // bu sayinin faktoryel degerini hesaplayin.
        // Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen faktoryeli alinacak 20' den kucuk bir pozitif tamsayi giriniz: ");
        int sayi = scan.nextInt();

        int fak = 1;

        System.out.print(sayi+"!= ");
        for (int i = sayi; i >=1 ; i--) {
            fak *= i;

            if (i != 1){
                System.out.print(i+"*");
            }else {
                System.out.print(i+" = " + fak);
            }
        }
    }
}
