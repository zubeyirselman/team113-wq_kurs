package TakimCalismasi_01;

import java.util.Scanner;

public class C19_ {
    public static void main(String[] args) {

        // Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın. 5 karakterin
        // altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayan bir method olusturun.

        noktaYazdirma();
    }


    public static void noktaYazdirma (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz: ");
        String kelime = scan.next();

        if (kelime.length()>=5){
            System.out.println(kelime.substring(0,5));
        }else {
            for (int i = 0; i <kelime.length() ; i++) {
                if (kelime.length()<5){
                    kelime += ".";
                }
            }
            System.out.println(kelime);
        }
    }
}
