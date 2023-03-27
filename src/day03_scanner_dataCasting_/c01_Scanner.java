package day03_scanner_dataCasting_;

import java.util.Scanner;

public class c01_Scanner {
    public static void main(String[] args) {

       /* Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.*/

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");

        String soyisim= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        double yas= scan.nextDouble();

        /* System.out.println("Isminiz : " + isim);
        System.out.println("Soyisminiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz Basariyla Tamamlanmistir.");*/

        //kullanici istedigimiz data turunde bilgi girisi yapmazsa kodumuzda hata olusur
        //ve calisma durur.
        //ilerde kullanici hatalarina karsi nasil tedbirler alacagimizi ogrenecegiz.
        //Simdilik kullanici biz ne diyorsak onu tam yapiyor kabul edelim.

        /*System.out.print("Isminiz : " + isim);
        System.out.print("Soyisminiz : " + soyisim);
        System.out.print("Yasiniz : " + yas);
        System.out.print("Kaydiniz Basariyla Tamamlanmistir." + yas);
         System.out.println()' deki 'ln' yazdirma islemini yaptiktan sonra alt satira gecmesini saglar.*/

        System.out.println("Isminiz : " + isim +
                "\nSoyisminiz : " + soyisim +
                "\nYasiniz : " + yas +
                "\nKaydiniz Basariyla Tamamlanmistir.");

        /*System.out.println() ile birden fazla satir yazdirmak isterseniz
        string bir ifadenin icinde istediginiz yere \n yazabilirsiniz.
         */











    }
}
