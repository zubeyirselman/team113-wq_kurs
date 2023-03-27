package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {

        //1.adim : Scanner objesi olusturun.
        Scanner scan= new Scanner(System.in);

        //2.adim : kullaniciya ne istediginizi soyleyin.
        System.out.println("lutfen isminizi giriniz");

        //3.adim :girilen bilgiyi icine koyabileceginiz bir variable olusturun.
        //olusturdugunuz scanner objesi ile uygun method'u kullanarak bilgiyi alin.

        String kullaniciİsmi= scan.next();


    }
}
