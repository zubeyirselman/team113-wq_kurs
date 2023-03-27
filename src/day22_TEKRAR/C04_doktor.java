package day22_TEKRAR;

public class C04_doktor {

    C04_doktor(){
        System.out.println("parametresiz constructor calisti.");
    }

    String isim = "isim atanmamis";
    String soyIsim = "soyisim atanmamis";
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti = 20;

    public int mesaiUcretiHesapla(int mesaiSaati){


        return mesaiSaati*ekMesaiUcreti;
    }





}
