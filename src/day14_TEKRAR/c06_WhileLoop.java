package day14_TEKRAR;

import java.util.Scanner;

public class c06_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar alin
        // toplam 500 olursa veya 500' u gecerse
        // kac sayi girdigini ve sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);

        int girilenSayi=0;
        int toplam = 0;
        int girilenSayiAdedi = 0;

        while (toplam<500){
            System.out.println("lutfen toplanmak uzere sayilar girin: ");
            girilenSayi= scan.nextInt();
            toplam+=girilenSayi;
            girilenSayiAdedi++;
        }
        System.out.println("Toplam " + girilenSayiAdedi + " adet sayi girildi ve toplami: " + toplam );

    }
}
