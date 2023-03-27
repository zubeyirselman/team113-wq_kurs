package TakimCalismasi_01;

import java.util.Scanner;

public class c10_ {
    public static void main(String[] args) {


        // Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.
        // Ornek: Merhaba dünya  ===>  Merhaba%dünya

        sembolEkle();

    }

    public static void sembolEkle (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String mtn = scan.nextLine();

        mtn = mtn.replaceAll(" ", "%");
        System.out.println(mtn);
    }




}
