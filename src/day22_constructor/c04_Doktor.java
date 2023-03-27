package day22_constructor;

public class c04_Doktor {

    public c04_Doktor(){
        System.out.println("parametresiz constructor calisti");
    }
    String isim = "isim atanmamis";
    String soyIsim = "soyisim atanmamis";
    String telNo;
    String adres;
    public int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti = 20;

    public int mesaiUcretiHesapla(int mesaiSaati){


        return mesaiSaati*ekMesaiUcreti;
    }
}
