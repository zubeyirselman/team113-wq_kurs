package TakimCalismasi_01;

import java.util.Scanner;

public class c01_Ornek {
    public static void main(String[] args) {

        // 1-Kullanıcının girdiği sayının pozitif, negatif veya sıfır olduğunu belirleyen bir program yazın.


        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen konrol etmek istediginiz sayiyi giriniz: ");
        int girilenSayi = scan.nextInt();

        if (girilenSayi==0){
            System.out.println("girilen sayi 0' dir.");
        } else if (girilenSayi>0) {
            System.out.println("girilen sayi pozitiftir.");
        }else {
            System.out.println("girilen sayi negatiftir.");
        }

    }
}
