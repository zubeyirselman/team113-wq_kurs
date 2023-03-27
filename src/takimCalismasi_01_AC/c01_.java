package takimCalismasi_01_AC;

import java.util.Arrays;
import java.util.Scanner;

public class c01_ {
    public static void main(String[] args) {

        // 1-Kullanıcının girdiği sayının pozitif, negatif veya sıfır olduğunu belirleyen bir program yazın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int sayi= scan.nextInt();

        if (sayi==0){
            System.out.println("girilen sayi 0'dir.");
        } else {
            if (sayi>0){
                System.out.println("girilen sayi pozitiftir.");
            }else {
                System.out.println("girilen sayi negatiftir.");
            }
        }

    }
}
