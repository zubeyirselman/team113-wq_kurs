package day13_TEKRAR;

import java.util.Scanner;

public class c06_MethodKullanma {
    public static void main(String[] args) {

        //  verilen bir stringin Palindrome olup olmadigini yazdirin
        //  palindrome: duzden ve tersten ayni sekilde yazdirma
        //  madam, 123321, kabak

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String metin = scan.nextLine();

        String tersMetin = c05_StringTerseCevirme.stringTerseCevirme(metin);

        if (metin.equals(tersMetin)){
            System.out.println("girilen metin palindrome");
        }else {
            System.out.println("girilen metin palindrome degil");


        }
    }
}
