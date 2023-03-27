package TakimCalismasi_01;

import java.util.Scanner;

public class C13_ {
    public static void main(String[] args) {

        // Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.
        // Merhaba MMMeeerrrhhhaaabbbaaa
        // Ali AAAllliii

        ucDefaYazdir();

    }
        public static void ucDefaYazdir (){

            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen bir kelime giriniz: ");
            String kelime = scan.next();

            String yeni= "";
            for (int i = 0; i <kelime.length() ; i++) {
                char harf= kelime.charAt(i);
                yeni += "" +harf + harf + harf;
            }

            System.out.println(yeni);

        }



}
