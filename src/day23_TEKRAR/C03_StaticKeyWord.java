package day23_TEKRAR;

public class C03_StaticKeyWord {

    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneTelefonu = "09134725";
    static String bashekimIsmi = "Kemal Aydin";

    String persIsmi;
    String persAdresi;
    String persTelefonu;

    public static void main(String[] args) {

        C03_StaticKeyWord personel1 = new C03_StaticKeyWord();

        System.out.println(personel1.persIsmi); // null
        System.out.println(hastaneIsmi); // Yildiz
        System.out.println(personel1.bashekimIsmi); // Kemal

        C03_StaticKeyWord personel2 = new C03_StaticKeyWord();

        personel2.persIsmi = "Dogan";

        System.out.println(personel2.persIsmi); // Dogan
        System.out.println(personel1.persIsmi); // null

        personel2.bashekimIsmi = "Sumeyra Gunel";
        System.out.println(personel1.bashekimIsmi); // Sumeyra Gunel


         /*
            1- Static variable' lar tum class icin gecerlidir. ( class variable)
            2- Static variable' lar tum objeler icin ayni degeri tasidiklari icin
                her obje icin ayrica olusturulmaz, sadece 1 variable olur.
            3- Static variable' lara ulasmak veya update etmek icin obje ismi kullanmaya gerek yoktur.
                direk ulasilabilir.
                Baska class' dan Static variable' a ulasmak icin classIsmi.staticVariableIsmi yazilir.
         */
    }
}
