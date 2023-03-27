package TakimCalismasi_01;

import java.util.Scanner;

public class c02_Ornek {
    public static void main(String[] args) {

        // 2-Kullanıcının girdiği iki sayı arasındaki en büyük sayıyı bulan bir program yazın.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen karsilastirmak uzere iki sayi giriniz: ");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        if (sayi1>sayi2){
            System.out.println("en buyuk sayi: " + sayi1);
        }else {
            System.out.println("en buyuk sayi: " + sayi2);
        }

    }
}
