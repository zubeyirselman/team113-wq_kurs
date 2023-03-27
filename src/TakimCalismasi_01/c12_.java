
package TakimCalismasi_01;

import java.util.Scanner;

public class c12_ {
    public static void main(String[] args) {

        // Kullanıcıdan bir kelime alin,
        // değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri alin
        // ve buna göre kelimede/dizede sadece ilk bulduğu yeri değiştiren metodu yazınız.
        // (Merhaba ,a, e) Merheba
        // (Kasaba , a, i) Kisaba

        harfleriDegistir();
    }

    public static void harfleriDegistir (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime = scan.next();
        System.out.println("Lutfen girilen kelimede degistirmek istediginiz " +
                            "\nve yerine koymak istediginiz harfi giriniz: ");
        /*
        bu soruyu char data turuyle cozebilecegimiz gibi
        String bir data turu kullanip, "substring" method' uyla da cozebiliriz.
         */

        //String ches = scan.next().substring(0,1);
        //String chyen = scan.next().substring(0,1);
        char ches = scan.next().charAt(0);
        char chyen = scan.next().charAt(0);

        kelime= kelime.replace(ches, chyen);
        System.out.println(kelime);


    }

}
