package day09_TEKRAR;

import java.util.Scanner;

public class c02_switch {
    public static void main(String[] args) {

        //Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ay numarasi giriniz: ");
        int ayNo = scan.nextInt();
        switch (ayNo) {
            case 12:
            case 1:
            case 2:
                System.out.println("Mevsim kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Mevsim ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Mevsim yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Mevsim sonbahar");
                break;
            default:
                System.out.println("gecersiz ay numarasi");

        }

    }
}
