package takimCalismasi_01_AC;

import java.util.Scanner;

public class c03_ {
    public static void main(String[] args) {

        // 3-Kullanıcının girdiği üç sayı arasındaki en küçük sayıyı bulan bir program yazın.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karsilastirmak istediginiz birinci sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen karsilastirmak istediginiz ikinci sayiyi giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.println("Lutfen karsilastirmak istediginiz ucuncu sayiyi giriniz: ");
        int sayi3 = scan.nextInt();

        if (sayi1<sayi2 && sayi1<sayi3){
            System.out.println("en kucuk sayi: " + sayi1);
        } else if (sayi2<sayi1 && sayi2<sayi3) {
            System.out.println("en kucuk sayi: " + sayi2);
        } else {
            System.out.println("en kucuk sayi: " + sayi3);
        }


    }
}
