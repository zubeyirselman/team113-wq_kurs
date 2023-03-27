package day08_TEKRAR;

import java.util.Scanner;

public class c03_NestedIfElse {
    public static <Scanenr> void main(String[] args) {
        
        /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.
        hatali giris yapilirsa kullaniciyi uyarin.
         */
        
        // bu defa ana degisken yas olsun
        
        
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz.");
        int yas = scan.nextInt();
        System.out.println("Lutfen cinsiyetinizi giriniz.");
        char cns= scan.next().charAt(0);
        
        if (yas<16 || yas>80){
            System.out.println("gecersiz yas");
        } else if (yas<60) { // 16-60 yas arasi

            if (cns == 'k' || cns == 'K') {
                System.out.println("emekli olmak icin daha " + (60 - yas) + " yil calismalisin.");
            } else if (cns == 'e' || cns == 'E') {
                System.out.println("emekli olmak icin daha \" + (65-yas) + \" yil calismalisin.");
            } else {
                System.out.println("gecersiz cinsiyet");
            }


        } else if (yas<65) { // 60-65 yas arasi

            if (cns == 'k' || cns == 'K') {
                System.out.println("emekli olabilirsin.");
            } else if (cns == 'e' || cns == 'E') {
                System.out.println("emekli olmak icin daha " + (65 - yas) + " yil calismalisin.");
            } else {
                System.out.println("gecersiz cinsiyet");
            }


        } else { // 65-80 yas arasi
            if (cns=='e' || cns=='E' || cns=='k' || cns=='K'){
                System.out.println("emekli olabilirsin.");
            } else {
                System.out.println("gecersiz cinsiyet girisi.");
            }

        }


    }
}
