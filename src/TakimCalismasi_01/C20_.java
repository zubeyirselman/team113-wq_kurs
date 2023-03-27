package TakimCalismasi_01;

import java.util.Scanner;

public class C20_ {
    public static void main(String[] args) {

        // Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden
        // çıkartarak sonuç döndüren metodu yazınız. (Büyük küçük duyarlı)
        // Merhaba Merhab , Ananas Anas


        tekrarlananiSil();

    }
    public static String tekrarlananiSil (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kac kelime giriniz: ");
        String girilenKelimeler = scan.nextLine();

        String yeniKelime = "";
        for (int i = 0; i <girilenKelimeler.length() ; i++) {
            char yeniKrk = girilenKelimeler.charAt(i);
            if (yeniKelime.indexOf(yeniKrk)<0){
                yeniKelime += yeniKrk;
            }
        }
        System.out.println(yeniKelime);
        return yeniKelime;
    }

}
