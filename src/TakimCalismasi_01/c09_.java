package TakimCalismasi_01;

import java.util.Scanner;

public class c09_ {
    public static void main(String[] args) {

        // Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan ,
        // 3 kelimeden az ise inputu döndüren bir metot yazınız.
        // Merhaba Mer
        // Ali Ali

       donecekKelime();

    }

    public static String donecekKelime (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String mtn = scan.nextLine();


        System.out.println(mtn.substring(0, 3));

        if ( mtn.indexOf(" ") == mtn.lastIndexOf(" ")){
            System.out.println(mtn);
        } else {
            System.out.println("girilen metin 3 ya da daha fazla kelime iceriyor.");
        }


        return mtn;
    }



}
