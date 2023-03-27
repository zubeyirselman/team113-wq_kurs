package day22_constructor;

import day21_TEKRAR.c04_KarelerinToplami;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class c01_Constructor {
    public static void main(String[] args) {

        /*
                Bir obje ancak bir class' tan olusturulabilir.
                Bir objeyi olusturdugumuz class ayni zamanda o objenin data turudur.

                Her obje olusturuldugu class' in ozelliklerini tasir.
                Eger bir programda, ortak ozelliklere sahip
                objeler uretmek uzere tasarladıgınız bir class varsa
                Main Method olmasi SART DEGILDIR.
                Bu class' lar kaliphane gibi calisir.
                Yani o class' dan ayni ozelliklere sahip objeler uretmemizi saglar.

         */
        Scanner scan = new Scanner(System.in);

        List<String> isimler = new ArrayList<>();

        c04_KarelerinToplami obje = new c04_KarelerinToplami();

        Random rnd = new Random();

        String str = new String("Ali");

        c02_hemsire hemsire1 = new c02_hemsire();

        System.out.println(hemsire1.mesaiUcretiHesapla(5));


        String str2;
        Random rnd2;
        List<String> harfler;
    }
}
