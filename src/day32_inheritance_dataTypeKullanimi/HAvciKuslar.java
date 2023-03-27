package day32_inheritance_dataTypeKullanimi;

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

        kuslar.hareket(); // hareket ederler ==> F class' indan
        kuslar.beslenme(); // beslenirler ==> F class' indan
        //kuslar.pence(); // CTE
        kuslar.gaga(); // gagalari vardir ==> G class' indan

        kuslar.kanat(); // kanatlidirlar ==> G class' indan
        kuslar.solunum(); // akcigerle nefes alirlar ==> G class' indan
        kuslar.cogalma(); // yumurtayla cogalirlar ==> G class' indan

        kuslar.omur(); // yasar ve olurler ==> F class' indan

        System.out.println("===============");

        GKuslar kartalKus = new HAvciKuslar();

        kartalKus.hareket(); // ucarlar ==> bulduktan sonra gecersiz klani yazdirdi.
        kartalKus.beslenme(); // et yerler ==> bulduktan sonra gecersiz klani yazdirdi.
        // kartalKus.pence(); CTE
        kartalKus.gaga(); // sivri gagali ==> bulduktan sonra gecersiz klani yazdirdi.

        kartalKus.kanat(); // kanatlidirlar ==> gecersiz klan olmadıgı icin buldugumuzu yazdirdi.
        kartalKus.solunum(); // akcigerle nefes alirlar ==> gecersiz klan olmadıgı icin buldugumuzu yazdirdi.
        kartalKus.cogalma(); // yumurtayla cogalirlar ecersiz klan olmadıgı icin buldugumuzu yazdirdi.

        kartalKus.omur(); // yasar ve olurler ==> gecersiz klan olmadıgı icin buldugumuzu yazdirdi.

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

        FHayvanlar kartalHayvani = new HAvciKuslar();

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
