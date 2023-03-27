package Ornek_Sorular;

import java.util.Scanner;

public class c01_ {
    public static void main(String[] args) {
        // kullanicidan cinsiyetini alin,
        // Cinsiyet "Erkek" ise "Erkek" yazdırınız.
        // Cinsiyet "Kadın" ise "Kız" yazdırınız.
        // Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
        // Not : Bu seçenekler dışındakilerini yoksayınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz: ");
        String cns= scan.next();

        if (cns.equalsIgnoreCase("erkek")){;
            System.out.println("girilen cinsiyet: Erkek");
        } else if (cns.equalsIgnoreCase("kadin")) {
            System.out.println("girilen cinsiyet: Kiz");
        } else {
            System.out.println("girilen cinsiyet: TOP");
        }

    }
}
