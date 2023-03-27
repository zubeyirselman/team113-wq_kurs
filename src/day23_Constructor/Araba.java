package day23_Constructor;

public class Araba {


    int yil;
    String marka = "marka belirtilmemis";
    String model = "model belirtilmemis";
    boolean hasarliMi;
    int fiyat;

    @Override
    public String toString() {
        return "Araba Bilgileri: {" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }

    public Araba(int yil, String marka, String model, boolean hasarliMi, int fiyat){

        /*
            Eger parametre ismi instance variable ismiyle AYNI DEGILSE,
        alttaki constructor' da oldugu gibi direk atama yapabiliriz.
            ANCAK genelde projenin daha anlasilir olmasi ve dogru variable' in kullanilmasi icin,
         constructor' daki parametre isimlerii instance varible' larla ayni secilir.

            Bu durumda Java' ya ayni isimdeki iki variable' dan hangisinin bu class' daki
         instance variable oldugunu belirtmemiz gerekir.

            Bunun icin Java Syntax olarak "this." yazilmasini istemistir.
         this. yazmazsak Java en kisa sekilde ulasabilecegi variable' i bulur.
         */


        this.yil = yil;
        this.marka = marka;
        this.model= model;
        this.hasarliMi=hasarliMi;
        this.fiyat=fiyat;

    }

    public Araba(int fyt, String mrk){
        fiyat = fyt;
        marka= mrk;

    }

    public Araba(int yil, String marka, String model, int fiyat) {
        this.yil = yil;
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    public Araba(){

    }
    public void yakitTuketimi(String yakitTuru) {
        switch (yakitTuru) {
            case "benzin":
                System.out.println("benzinli araclar icin yakit tuketimi: 6l/100km");
                break;
            case "dizel":
                System.out.println("dizel araclar icin yakit tuketimi: 5l/100km");
                break;
            case "elektrik":
                System.out.println("elektrikli araclar icin yakit tuketimi: 5kW/100km");
                break;
            default:
                System.out.println("gecersiz yakit turu");
        }
    }

}
