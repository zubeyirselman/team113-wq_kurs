package day32_TEKRAR;

import day32_inheritance_dataTypeKullanimi.FHayvanlar;

public class HAvciKuslar extends GKuslar{

    public void hareket(){
        System.out.println("ucarlar");
    }

    public void beslenme(){
        System.out.println("et yerler");
    }

    public void pence(){
        System.out.println("pencelidir");
    }

    public void gaga(){
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        HAvciKuslar kartalAvci = new HAvciKuslar();

        kartalAvci.hareket(); // ucarlar ==> h class' indan
        kartalAvci.beslenme(); // et yerler ==> h class' indan
        kartalAvci.pence(); // pencelidir ==> h class' indan
        kartalAvci.gaga(); // sivri gagali ==> h class' indan

        kartalAvci.kanat(); // kanatlidirlar ==> G class' indan
        kartalAvci.solunum(); // akcigerle nefes alirlar ==> G class' indan
        kartalAvci.cogalma(); // yumurtayla cogalirlar ==> G class' indan

        kartalAvci.omur(); // yasar ve olurler ==> F class' indan

        System.out.println("===============");

        GKuslar kuslar = new GKuslar();

        kuslar.hareket(); // hareket ederler ==> f class' indan
        kuslar.beslenme(); // beslenirler ==> f class' indan
        //kuslar.pence(); // CTE
        kuslar.gaga(); // gagalari vardir ==> g class' indan

        kuslar.kanat(); // kanatlidirlar ==> G class' indan
        kuslar.solunum(); // akcigerle nefes alirlar ==> G class' indan
        kuslar.cogalma(); // yumurtayla cogalirlar ==> G class' indan

        kuslar.omur(); // yasar ve olurler ==> F class' indan

        System.out.println("===============");

        GKuslar kartalKus = new HAvciKuslar();

        kartalKus.hareket(); // ucarlar ==> h class' indan
        kartalKus.beslenme(); // et yerler ==> h class' indan
        // kartalKus.pence(); // CTE
        kartalKus.gaga(); // sivri gagali ==> h class' indan

        kartalKus.kanat(); // kanatlidirlar ==> G class' indan
        kartalKus.solunum(); // akcigerle nefes alirlar ==> G class' indan
        kartalKus.cogalma(); // yumurtayla cogalirlar ==> G class' indan

        kartalKus.omur(); // yasar ve olurler ==> F class' indan

        System.out.println("===============");

        FHayvanlar hayvanlar = new FHayvanlar();

        hayvanlar.hareket(); // hareket ederler ==> F class' indan
        hayvanlar.beslenme(); // beslenirler ==> F class' indan
        //hayvanlar.pence(); CTE
        //hayvanlar.gaga(); CTE

        //hayvanlar.kanat(); CTE
        hayvanlar.solunum(); // nefes alirlar ==> F class' indan
        hayvanlar.cogalma(); // cogalirlar ==> F class' indan

        hayvanlar.omur(); // yasar ve olurler ==> F class' indan

        System.out.println("===============");

        FHayvanlar kartalHayvani = new day32_inheritance_dataTypeKullanimi.HAvciKuslar();

        kartalHayvani.hareket(); // ucarlar ==> h class' indan
        kartalHayvani.beslenme(); // et yerler ==> h class' indan
        //kartalHayvani.pence(); CTE
        //kartalHayvani.gaga(); CTE

        //kartalHayvani.kanat(); CTE
        kartalHayvani.solunum(); // akcigerle nefes alirlar ==> G class' indan
        kartalHayvani.cogalma(); // yumurtayla cogalirlar ==> G class' indan

        kartalHayvani.omur(); // yasar ve olurler ==> F class' indan



        /*
            Ozellikler method olarak olusturulmus ise
            data turu ve cosntructor AYNI ise
            o class' da aramaya baslarim
            buldugum ilk degeri kullanirim.

            Data turu ve constructor farkli ise;
            data turu olan class' dan aramaya baslar
            o class veya parent class' larinda
            bulamazsa CTE verir.

            o class veya parent class' larinda bulursa
            override edilmis mi kontrol eder
            ve en guncel bilgiyi bulup yazdirir.
         */
    }
}
