package day20_TEKRAR;

public class c08_BaskaClasstanKullanma {
    public static void main(String[] args) {

        // verilen sayinin pozitif tam bolenleri sayisi 10' dan cok ise "Guzel"
        // degilse "Kotu" yazdirin

        int sayi = 3000;

        int pozitifTamBolenlerSayisi = c07_TamBolenlerListesi.pozitifBolenleriListele(sayi).size();

        if (pozitifTamBolenlerSayisi>10){
            System.out.println("Guzel");
        } else {
            System.out.println("Kotu");
        }

    }
}
