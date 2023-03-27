package day22_TEKRAR;

public class C06_Araba {

    /*
    bir obje olusturulurken default constructor veya
    parametresiz gorunur constructor kullanilirsa
    obje ilk atanan degerlere sahip olur
    istedigimiz degerleri atamak icin tek tek
    tum variable' lara atama yapmamiz gerekir.

    bunun yerine
    atamak istedigimiz degerleri parametre olarak
    constructor' a yollayalim
    ve atamalari constructor icinde yapalim.
     */

    public C06_Araba(String mrk, String mdl, boolean hmi, int yl, int fyt) {

        yil = yl;
        marka = mrk;
        model = mdl;
        hasarliMi = hmi;
        fiyat = fyt;

    }

    public C06_Araba(){

    }

    @Override
    public String toString() {
        return "Araba Ozellikleri C06_Araba{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }

    int yil;
    String marka = "marka belirtilmemis";
    String model = "model belirtilmemis";
    boolean hasarliMi;
    int fiyat;

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
