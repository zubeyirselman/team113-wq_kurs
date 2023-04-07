package day41_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C03_LinkedListSoru {

    static List<Double> notListesi = new LinkedList<>();

    public static void main(String[] args) {
        // soru: Bir ogretmenden ogrencilerin notlarini girmesini isteyin
        // not girme islemi bittiginde Q' ya basmalidir.
        // bot girme islemi bittiginde asagidaki sekilde output hazirlayin
        //  not ortalamasi : .....
        //  ogrenci sayisi : .....
        //  ortalama altindaki ogrenci sayisi : .....
        //  ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : .....

        System.out.println("oncelikle ogrenci not listesini olusturalim");
        notListesineDegerEkle();

        double notToplami = 0;
        double notOrtalamasi = 0;
        int ortalamaAltindakiOgrenciSayisi = 0;
        int ortalama10PuanAltUstOgrenciSayisi = 0;

        for (double eachNot : notListesi
        ) {
            notToplami += eachNot;
        }

        notOrtalamasi = notToplami / notListesi.size();

        for (double eachNot : notListesi
        ) {
            if (eachNot < notOrtalamasi) {
                ortalamaAltindakiOgrenciSayisi += 1;
            }

            if (eachNot > notOrtalamasi - 10 && eachNot <= notOrtalamasi + 10) {
                ortalama10PuanAltUstOgrenciSayisi += 1;
            }
        }

        System.out.println("Not Ortalamasi: " + notOrtalamasi +
                "\nOgrenci Sayisi: " + notListesi.size() +
                "\nOrtalama Altindaki Ogrenci Sayisi: " + ortalamaAltindakiOgrenciSayisi +
                "\nOrtalamanin 10 Puan Alt ve Ustunde Olan Ogrenci Sayisi :" + ortalama10PuanAltUstOgrenciSayisi);

    }

    public static void notListesineDegerEkle() {

        Scanner scan = new Scanner(System.in);
        double not;
        boolean loopDevam = true;

        while (loopDevam) {

            try {
                System.out.println("Lutfen ogrenci notlarinizi giriniz \n Bitirmek icin Q' ya basiniz");
                not = scan.nextDouble();
                notListesi.add(not);
            } catch (Exception e) {

                String girilenDeger = scan.nextLine();

                if (girilenDeger.equalsIgnoreCase("Q")) {
                    loopDevam = false;
                    break;
                } else {
                    System.out.println("not icin sayisal degerler girmelisiniz");
                }

            }

        }
    }

}
