package day29_TEKRAR;

public class C02_encapsulationKullanimi {
    public static void main(String[] args) {
        C01 obj = new C01();

        obj.isim ="melike"; // write
        System.out.println(obj.isim); // read

        obj.setSayi(40); // write
        System.out.println(obj.getSayi()); // read

        /*
            Bir class uyesinin public olmasi ile
            private yapilip getter setter methodlarinin olusturulmasi
            islevsel acidan ayni sonucu olusturur.

            Bazi developerlar set(write yetkisi) ve get(read yetkisi) yetkilerinin
            kullanildigini vurgulamak icin
            2. yontemi tercih ederler.
            Ama sonuc acisindan hic bi fark olmaz.
         */
    }
}
