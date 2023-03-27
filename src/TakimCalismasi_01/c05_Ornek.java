package TakimCalismasi_01;

import java.util.Scanner;

public class c05_Ornek {
    public static void main(String[] args) {

        // 5-Kullanıcının girdiği bir sayının çift veya tek olduğunu kontrol eden bir program yazın.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz: ");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("girilen sayi cift sayidir.");
        } else{
            System.out.println("girilen sayi tek sayidir.");
        }


    }
}
