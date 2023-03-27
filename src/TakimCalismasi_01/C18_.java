package TakimCalismasi_01;

import java.util.Scanner;

public class C18_ {
    public static void main(String[] args) {

        // Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
        // altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayan bir method olusturun.
        // Sabun Sabun
        // Merhaba Merha
        // Ali Ali..
        // Hey Hey..
        // Pi Pi…

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime = scan.next();

        if (kelime.length()>=5){
            System.out.println(kelime.substring(0, 5));
        }else if (kelime.length() == 4){
            System.out.println(kelime.substring(0,4) + ".");
        } else if (kelime.length() == 3) {
            System.out.println(kelime.substring(0,3) + "..");
        } else if (kelime.length() == 2) {
            System.out.println(kelime.substring(0,2) + "...");
        }else {
            System.out.println(kelime.substring(0,1) + "....");
        }

    }

}
