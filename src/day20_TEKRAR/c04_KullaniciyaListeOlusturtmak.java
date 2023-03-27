package day20_TEKRAR;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c04_KullaniciyaListeOlusturtmak {
    public static void main(String[] args) {

        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(kullaniciyaListeOlusturtma());


    }

    public static List<String> kullaniciyaListeOlusturtma (){

        List<String> isimler = new ArrayList<>();

        String girilenisim= "";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Lutfen listeye eklemek uzere isim giriniz: " +
                                "\n gireceginiz isimler bittiginde lütfen Q' ya basiniz.");
            girilenisim = scan.nextLine();
            if (!girilenisim.equalsIgnoreCase("q")){
                isimler.add(girilenisim);
            }
        } while (!girilenisim.equalsIgnoreCase("Q"));
        return isimler;
    }
}
