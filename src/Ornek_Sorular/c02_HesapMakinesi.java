package Ornek_Sorular;

import java.util.Scanner;

public class c02_HesapMakinesi {
    public static void main(String[] args) {

        // Switch ifadesini kullanarak, herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme
        //yapan basit bir hesap makinesi oluşturmak için kod yazınız.
        //a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
        //b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
        //c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
        //d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
        //e) Kullanıcı 10 ve -5 girdiğinde,
        // +, -, *, / 'den farklı bir işlem yaptığında kodunuz "Geçersiz İşlem" yazmalıdır

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki adet sayi giriniz: ");
        double dbl1 = scan.nextDouble();
        double dbl2 = scan.nextDouble();
        System.out.println("Yapmak istediginiz islemin sembolunu giriniz: ");
        String oprtr= scan.next();

        switch (oprtr){
            case "+" :
                System.out.println(dbl1 + dbl2);
            break;

            case "-" :
                System.out.println(dbl1 - dbl2);
            break;

            case "*" :
                System.out.println(dbl1 * dbl2);
            break;

            case "/" :
                System.out.println(dbl1 / dbl2);
            break;

            default:
                System.out.println("!!! gecersiz islem !!!");
        }

    }
}
