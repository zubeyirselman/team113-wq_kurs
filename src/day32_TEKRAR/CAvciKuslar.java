package day32_TEKRAR;

public class CAvciKuslar extends BKuslar{

    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidir";
    String gaga = "sivri gagali";

    public static void main(String[] args) {

        CAvciKuslar kartalAvci = new CAvciKuslar();

        System.out.println(kartalAvci.hareket); // C class' indan ==> ucarlar
        System.out.println(kartalAvci.beslenme); // C class' indan ==> et yerler
        System.out.println(kartalAvci.pence); // C class' indan ==> pencelidir
        System.out.println(kartalAvci.gaga); // C class' indan ==> sivri gagali

        System.out.println(kartalAvci.kanat); // B class' indan ==> kanatlidirlar
        System.out.println(kartalAvci.solunum); // B class' indan ==> akcigerle nefes alirlar
        System.out.println(kartalAvci.cogalma); // B class' indan ==> yumurtayla cogalirlar

        System.out.println(kartalAvci.omur); // A class' indan ==> yasar ve olurler

        System.out.println("====================");

        BKuslar kartalKus = new CAvciKuslar();

        System.out.println(kartalKus.hareket); // A class' indan ==> hareket ederler
        System.out.println(kartalKus.beslenme); // A class' indan ==> beslenirler
        //System.out.println(kartalKus.pence); // CTE
        System.out.println(kartalKus.gaga); // B class' indan ==> gagalari vardir

        System.out.println(kartalKus.kanat); // B class' indan ==> kanatlidirlar
        System.out.println(kartalKus.solunum); // B class' indan ==> akcigerle nefes alirlar
        System.out.println(kartalKus.cogalma); // B class' indan ==> yumurtayla cogalirlar

        System.out.println(kartalKus.omur); // A class' indan ==> yasar ve olurler

        System.out.println("====================");

        AHayvanlar kartalHayvan =new CAvciKuslar();

        System.out.println(kartalHayvan.hareket); // A class' indan ==> hareket ederler
        System.out.println(kartalHayvan.beslenme); // A class' indan ==> beslenirler
        //System.out.println(kartalHayvan.pence); // CTE
        //System.out.println(kartalHayvan.gaga); // CTE

        //System.out.println(kartalHayvan.kanat); // CTE
        System.out.println(kartalHayvan.solunum); // A class' indan ==> nefes alirlar
        System.out.println(kartalHayvan.cogalma); // A class' indan ==> cogalirlar

        System.out.println(kartalHayvan.omur); // A class' indan ==> yasar ve olurler


        // variable olarak ozellikleri olusturursak
        BKuslar kuslar = new BKuslar();
       BKuslar avciKuslar = new CAvciKuslar();
        // bu 2 obje arasinda bir fark goremeyiz


        /*
            Eger bir obje olusturulurken
            data turu ve constructor ayni ise
            aradigimiz ozellikler icin direk o class' a gider
            ve ozellikleri arariz.

            Eger data turu ve constructor farkli ise
            variable ve method' lar farkli davranirlar.

            variable' lar
                - once data turunun oldugu class' a bakar
                  o variable' i bulursa degerini yazdirir.
                  bulamazsa data turunun parentlarina bakar.
                  orada bulursa degerini yazdirir.
                  orada da bulamazsa CTE verir.


            Ozetle bir ozelligi variable olarak olsuturursaniz
            data turu olan class ve parentlarindaki ortak ozelliklerine bakar

            ortak bilgileri arar EN GUNCEL BILGIYI ARAMAZ.
         */

    }
}
