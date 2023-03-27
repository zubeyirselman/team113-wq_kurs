package TakimCalismasi_01;

import java.util.Scanner;

public class C15_ {
    public static void main(String[] args) {

        //  Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimedeki istenen karakterin
        //  kaç adet olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı
        //  edilecek)
        //  Ankara,a 3
        //  Edirne,e 2

        harfadediDondur();
    }

    public static int harfadediDondur (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String girilenMetin = scan.nextLine();
        System.out.println("Lutfen adedini ogrenmek istediginiz harfi giriniz: ");
        char istenenHarf = scan.next().charAt(0);

        int sayac = 0;
        for (int i = 0; i <girilenMetin.length() ; i++) {
            if (girilenMetin.charAt(i) == istenenHarf){
                sayac++;
            }
        }
        System.out.println(sayac);
        return sayac;
    }

}
