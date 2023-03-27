package TakimCalismasi_01;

import java.util.Scanner;

public class C14_ {
    public static void main(String[] args) {

        // Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi
        // kaldırılmış şekilde string döndüren programı yazınız.
        // (Merhaba, a) Merhba


    }

    public static String karakterSil() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String girilenKelime = scan.next();
        System.out.println("Lutfen kelimeden cikarmak istediginiz harfi giriniz: ");
        char silinecekHarf = scan.next().charAt(0);


        // merhabalar
        // a
        String yeniKelime = "";
        for (int i = 0; i <girilenKelime.length() ; i++) {
            if ( girilenKelime.charAt(i) != silinecekHarf){
                yeniKelime += girilenKelime.charAt(i);
            }
        }
        System.out.println(yeniKelime);
        return yeniKelime;
    }
}
     // i=0    m != a true ise i. karakteri yeni kelimeye ekle ==> yeni kelime = "m";
     //  i=1    e != a true ise i. karakteri  yeni kelimeye ekle ==> yeni kelime = "me";
     //                                                      ... ==> yeni kelime = "merhblr";