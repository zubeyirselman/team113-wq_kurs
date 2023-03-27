package day03_TEKRAR;

import java.util.Scanner;

public class c01_ornek1 {
    public static void main(String[] args) {

        /* Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz Basariyla Tamamlanmistir.*/

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Ismininizi Giriniz");
        String isim= scan.nextLine();

        System.out.println("Lutfen Soyisminizi Giriniz");
        String soyisim= scan.nextLine();

        System.out.println("Lutfen Yasinizi Giriniz");
        double yas= scan.nextDouble();

        System.out.println("Isminiz : " + isim +
                            "\nSoyisminiz : " + soyisim +
                            "\nYasiniz : " + yas +
                            "\nKaydiniz Basariyla Tamamlanmistir.");





    }
}
