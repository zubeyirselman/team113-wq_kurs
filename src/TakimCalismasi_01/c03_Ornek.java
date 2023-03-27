package TakimCalismasi_01;

import java.util.Scanner;

public class c03_Ornek {
    public static void main(String[] args) {

        // 3-Kullanıcının girdiği üç sayı arasındaki en küçük sayıyı bulan bir program yazın.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen karsilastirmak uzere 3 adet sayi giriniz: ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();

        if (sayi1<sayi2 && sayi1<sayi3){
            System.out.println("en kucuk sayi: " + sayi1);
        } else if (sayi2<sayi1 && sayi2<sayi3){
            System.out.println("en kucuk sayi: " + sayi2);
        }else {
            System.out.println("en kucuk sayi: " + sayi3);
        }

    }
}
