package TakimCalismasi_01;

import java.util.Scanner;

public class C23_ {
    public static void main(String[] args) {

        // Kullanıcının ad ve soyad bilgilerini konsoldan alın,
        // Ekrana "Soy isminiz ..(soyad).. dir." Yazan metodu yazınız.
        // İnput: "Harun Özsoy "
        // Output: "Soy isminiz Özsoy dir."

        soyadYazdir();
    }

    public static void soyadYazdir () {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz: ");
        String ad = scan.nextLine();
        System.out.println(); // java' da nextLine() methodu kullanilirken java kaynakli, konsolda satir atlamasi olabiliyor,
                              // bu durumda atlanan satirin bir üst satirina boş bir "System.out.println();" koyariz.
        System.out.println("Lutfen soyadinizi giriniz: ");
        String soyad = scan.nextLine();

        System.out.println("Soy isminiz " + soyad + " dir.");

    }
}
