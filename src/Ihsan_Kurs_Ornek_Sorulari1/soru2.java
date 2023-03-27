package Ihsan_Kurs_Ornek_Sorulari1;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {

        // Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
        // Ornek: Merhaba dünya  ===>  Merhaba%dünya

        boslukDoldurma();

    }
    public static void boslukDoldurma (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String mtn = scan.nextLine();

        mtn = mtn.replaceAll(" ", "%");

        System.out.println(mtn);
    }

}
