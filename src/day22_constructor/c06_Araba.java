package day22_constructor;

public class c06_Araba {
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

    public c06_Araba(String mrk, String mdl, boolean hmi, int yl, int fyt){
        yil = yl;
        marka = mrk;
        model = mdl;
        hasarliMi = hmi;
        fiyat = fyt;

    }

    public c06_Araba(){

    }

    @Override
    public String toString() {
        return "c06_Araba Ozellikleri{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }

    int yil;
    String marka = "Marka Belirtilmemis";
    String model = "Model Belirtilmemis";
    Boolean hasarliMi;
    int fiyat;

    public void yakitTuketimi(String yakitTuru){
        switch (yakitTuru){
            case "benzin" :
                System.out.println("benzinli araclar icin yakit tuketimi: 6l/100km");
                break;
            case "dizel" :
                System.out.println("dizel araclar icin yakit tuketimi: 5l/100km");
                break;
            case "elektrik" :
                System.out.println("elektrikli araclar icin yakit tuketimi: 5kW/100km");
                break;
            default:
                System.out.println("gecersiz yakit turu");
        }
    }


}
