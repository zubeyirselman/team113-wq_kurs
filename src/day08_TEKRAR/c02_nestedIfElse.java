package day08_TEKRAR;

import java.util.Scanner;

public class c02_nestedIfElse {
    public static void main(String[] args) {

        /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.
        hatali giris yapilirsa kullaniciyi uyarin.
         */

        //birden fazla degiskene bagli ifElse statement'larini yazarken
        //önce degiskenlerden birine gore ana yapiyi olusturalim.
        //bu soruda cinsiyeti ana degisken yapalim

        //ikinci degiskeni ana degiskenin her bolumunde ayri ayri degerlendirelim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz.");
        char cns= scan.next().charAt(0);
        System.out.println("Lutfen yasinizi giriniz.");
        int yas= scan.nextInt();

        if (cns=='k' || cns=='K'){ //kadin
            if (yas<16 || yas>80){
                System.out.println("Gecersiz yas girisi, lutfen tekrar deneyin");
            } else if (yas<60) {
                System.out.println("emekli olmak icin daha " + (60-yas) + " yil calismalisin.");
            } else {
                System.out.println("emekli olabilirsin");
            }

        } else if (cns=='e' || cns=='E') { //erkek
            if (yas<16 || yas>80){
                System.out.println("Gecersiz yas girisi, lutfen tekrar deneyin");
            } else if (yas<65) {
                System.out.println("emekli olmak icin daha " + (65-yas) + " yil calismalisin.");
            } else {
                System.out.println("emekli olabilirsin.");
            }

        } else {
            System.out.println("Gecersiz cinsiyet girisi, Lutfen yeniden deneyin.");
        }


    }
}
