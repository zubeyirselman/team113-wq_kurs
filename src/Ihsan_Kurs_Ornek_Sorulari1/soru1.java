package Ihsan_Kurs_Ornek_Sorulari1;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {

        // Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan ,
        // 3 kelimeden az ise inputu döndüren bir metot yazınız.
        // Merhaba Mer
        // Ali Ali

        System.out.println("Lutfen bir metin giriniz: ");
        ilk3HarfiYazma();

    }



    public static String ilk3HarfiYazma (){

        Scanner scan = new Scanner(System.in);
        String mtn = scan.nextLine();

        System.out.println("girilen metnin ilk 3 harfi: " + mtn.substring(0,3));

        if (mtn.indexOf(" ")==mtn.lastIndexOf(" ") ){
            System.out.println(mtn);
        }else {
            System.out.println("girilen metin 3 yada daha fazla kelime icerir.");
        }

      return mtn;
    }



}
