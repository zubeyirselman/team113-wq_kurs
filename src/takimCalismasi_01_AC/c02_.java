package takimCalismasi_01_AC;

import java.util.Scanner;

public class c02_ {
    public static void main(String[] args) {

        // 2-Kullanıcının girdiği iki sayı arasındaki en büyük sayıyı bulan bir program yazın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karsilastirmak istediginiz birinci sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen karsilastirmak istediginiz ikinci sayiyi giriniz: ");
        int sayi2 = scan.nextInt();

        if (sayi2>sayi1){
            System.out.println("buyuk sayi: " + sayi2);
        } else {
            System.out.println("buyuk sayi: " + sayi1);
        }


    }
}
