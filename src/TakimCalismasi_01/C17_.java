package TakimCalismasi_01;

import java.util.Scanner;

public class C17_ {
    public static void main(String[] args) {

        // Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada 30
        // defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.

        tekrarYazdiran();


    }
    public static void tekrarYazdiran (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kisa olan kelimeyi giriniz: ");
        String kisaKelime = scan.next();
        System.out.println("Lutfen uzun olan kelimeyi giriniz: ");
        String uzunKelime = scan.next();

        String yeniKisaKelime = kisaKelime+kisaKelime;
        String yeniUzunKelime = uzunKelime.repeat(30);
        System.out.println(yeniKisaKelime+yeniUzunKelime+yeniKisaKelime);

    }
}
